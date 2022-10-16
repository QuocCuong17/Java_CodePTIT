
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J05073 {
    private String ma;
    private long donGia,soLuong;
    private double thue,pvc,tongTien;
    public J05073(String ma, long donGia, long soLuong) {
        this.ma = ma;
        this.donGia = donGia;
        this.soLuong = soLuong;
        if(ma.startsWith("T")){
            thue= 29.0/100*(soLuong*donGia);
        }
        else if(ma.startsWith("C")){
            thue= 10.0/100*(soLuong*donGia);  
        }
        else if(ma.startsWith("D")){
            thue= 8.0/100*(soLuong*donGia);  
        }
        else if(ma.startsWith("M")){
            thue= 2.0/100*(soLuong*donGia);  
        }
        if(ma.endsWith("C")){
            thue=thue-5.0/100*thue;
        }
        if(ma.startsWith("T")){
            pvc= 4.0/100*(soLuong*donGia);
        }
        else if(ma.startsWith("C")){
            pvc= 3.0/100*(soLuong*donGia);  
        }
        else if(ma.startsWith("D")){
            pvc= 2.5/100*(soLuong*donGia);  
        }
        else if(ma.startsWith("M")){
            pvc= 0.5/100*(soLuong*donGia);  
        }
        tongTien=soLuong*donGia+pvc+thue;
        tongTien+=20.0/100*tongTien;
        tongTien/=soLuong;
    }
    @Override
    public String toString(){
        return this.ma+" "+String.format("%.2f", tongTien);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<J05073> list = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String ma=sc.next();
            long dongia=sc.nextLong();
            long sl=sc.nextLong();
            J05073 x = new J05073(ma,dongia,sl);
            System.out.println(x);
        }
    }
}
//2
//TTVC 400 300
//CCAK 200 200