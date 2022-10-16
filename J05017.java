
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J05017 {
    private String maKH,tenKH;
    private int chiSoCu,chiSoMoi,chiSo,donGia,phuPhi;
    private double tongTien;

    public J05017(int maKH,String tenKH, int chiSoCu, int chiSoMoi) {
        this.maKH = "KH"+String.format("%02d",maKH);
        this.tenKH = tenKH;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        chiSo=chiSoMoi-chiSoCu;
        if(chiSo>=0 && chiSo<=50){
            donGia=100;
            tongTien=  ((donGia*chiSo)*1.02);
        }
        else if(chiSo>=51 && chiSo<=100){
            tongTien=  (((chiSo-50)*150 + 50*100)*1.03);
        }
        else {
            tongTien= ((50*100+50*150+(chiSo-100)*200)*1.05);
        }
    }
    @Override
    public String toString(){
        return this.maKH+" "+this.tenKH+" "+String.format("%.0f", tongTien);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<J05017> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            int chisocu=Integer.parseInt(sc.nextLine());
            int chisomoi=Integer.parseInt(sc.nextLine());
            J05017 x = new J05017(i+1,ten,chisocu,chisomoi);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J05017>(){
            @Override
            public int compare(J05017 o1, J05017 o2) {
                if(o1.tongTien>o2.tongTien) return -1;
                else return 1;
            }
            
        });
        for(J05017 x : list){
            System.out.println(x);
        }
    }
}
//3
//Le Thi Thanh
//468
//500
//Le Duc Cong
//160
//230
//Ha Hue Anh
//410
//612