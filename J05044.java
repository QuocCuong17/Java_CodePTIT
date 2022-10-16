import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class J05044 {
    private String maNV,hoTen,chucVu;
    private int soNgayCong,luongCoBan,phuCap,luongChinh;
    private double tamUng,conLai;

    public J05044() {
    }

    public J05044(int maNV, String hoTen, String chucVu, int luongCoBan, int soNgayCong) {
        this.maNV = "NV"+String.format("%02d", maNV);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        luongChinh=luongCoBan*soNgayCong;
        if(chucVu.equals("GD")) phuCap=500;
        else if(chucVu.equals("PGD")) phuCap=400;
        else if(chucVu.equals("TP")) phuCap=300;
        else if(chucVu.equals("KT")) phuCap=250;
        else phuCap=100;
        double a=(phuCap+luongChinh)*(2.0/3.0);
        if((a)<25000){
   
            
            tamUng= (double)Math.round(a/1000) * 1000;
            
        }
        else tamUng=25000;
        conLai=(double)(luongChinh+phuCap-(double)tamUng);
    }
    @Override
    public String toString(){
        return this.maNV+" "+this.hoTen+" "+this.phuCap+" "+this.luongChinh+" "+String.format("%.0f", tamUng)
                +" "+String.format("%.0f", conLai);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<J05044> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String hoTen=sc.nextLine();
            String chucVu=sc.nextLine();
            int luongCoBan=Integer.parseInt(sc.nextLine());
            int soNgayCong=Integer.parseInt(sc.nextLine());
            J05044 x = new J05044(i+1,hoTen,chucVu,luongCoBan,soNgayCong);
            list.add(x);
        }
        String s=sc.next();
        for(J05044 x : list){
            if(x.chucVu.equals(s)){
                System.out.println(x);
            }
        }
    }
}


//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
//TP