import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class J05053_Sắp_Xếp_Đơn_Hàng {
    private String tenMH,maMH,STT;
    private long donGia,soLuong;
    private double giamGia,thanhTien;

    public J05053_Sắp_Xếp_Đơn_Hàng(String tenMH, String maMH, long donGia, long soLuong) {
        this.tenMH = tenMH;
        this.maMH = maMH;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.STT= maMH.substring(1,maMH.length()-1);
        String a[] = tenMH.split("\\s+");
        long b=donGia*soLuong;
        if(maMH.charAt(maMH.length()-1)=='2'){
            giamGia=30.0/100*donGia*soLuong;
        }
        else if(maMH.charAt(maMH.length()-1)=='1') {
            giamGia= 50.0/100*donGia*soLuong;
        }
        thanhTien=donGia*soLuong-giamGia;
    }

    @Override
    public String toString(){
        return this.tenMH+" "+this.maMH+" "+this.STT+" "+String.format("%.0f",giamGia)+" "+String.format("%.0f",thanhTien);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<J05053_Sắp_Xếp_Đơn_Hàng> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String tenMH=sc.nextLine();
            String maMH=sc.nextLine();
            long donGia=Long.parseLong(sc.nextLine());
            long soLuong=Long.parseLong(sc.nextLine());
            J05053_Sắp_Xếp_Đơn_Hàng x = new J05053_Sắp_Xếp_Đơn_Hàng(tenMH,  maMH,  donGia,  soLuong);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J05053_Sắp_Xếp_Đơn_Hàng>(){
            @Override
            public int compare(J05053_Sắp_Xếp_Đơn_Hàng o1, J05053_Sắp_Xếp_Đơn_Hàng o2) {
                return o1.STT.compareTo(o2.STT);
            }
            
        });
        for(J05053_Sắp_Xếp_Đơn_Hàng x : list){
            System.out.println(x);
        }
    }
}
//3
//Kaki 2
//K0252
//80000
//15
//Jean 1
//J2011
//200000
//24
//Jean 2
//J0982
//150000
//12