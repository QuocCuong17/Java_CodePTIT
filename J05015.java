
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J05015 {
    private String hoTen,diaChi,thoiGian,Ma;
    private double thoiDiem;

    public J05015(String hoTen, String diaChi, String thoiGian) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.thoiGian = thoiGian;
        String arr1[]=hoTen.split("\\s+");
        String arr2[]=diaChi.split("\\s+");
        String ma="";
        for(int i=0;i<arr2.length;i++){
            ma+=Character.toUpperCase(arr2[i].charAt(0));
        }
        for(int i=0;i<arr1.length;i++){
            ma+=Character.toUpperCase(arr1[i].charAt(0));
        }
        Ma=ma;
        String a=thoiGian.substring(0,1);
        double gio=Integer.parseInt(a);
        String b=thoiGian.substring(2,4);
        double phut=Integer.parseInt(b);
        thoiDiem=(double)(120/(gio+(phut/60)-6));
    }
    @Override
    public String toString(){
        return this.Ma+" "+this.hoTen+" "+this.diaChi+" "+String.format("%.0f", this.thoiDiem)+" Km/h";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<J05015> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String diachi=sc.nextLine();
            String tg=sc.nextLine();
            J05015 x = new J05015(ten,diachi,tg);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J05015> (){
            @Override
            public int compare(J05015 o1, J05015 o2) {
                if(o1.thoiDiem>o2.thoiDiem)
                        return -1;
                else return 1;
            }
        });
        for(J05015 x : list ){
            System.out.println(x);
        }
    }
}
//3
//Tran Vu Minh
//Ha Noi
//8:30
//Vu Ngoc Hoang
//Hoa Binh
//8:20
//Pham Dinh Tan
//An Giang
//8:45