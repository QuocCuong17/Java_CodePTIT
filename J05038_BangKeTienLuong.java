/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class OOPS {
    private String maNV,hoTen;
    private long luongCoBan,soNgayCong,tienLuong,tienThuong,phuCap,tongT;
    private String chucVu;

    public OOPS(int maNV,String hoTen, long luongCoBan, long soNgayCong, String chucVu) {
        this.maNV ="NV"+ String.format("%02d", maNV);
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
        tienLuong=1l*luongCoBan*soNgayCong;
        phuCap=0;
        if(soNgayCong>=25){
            tienThuong=(long) ((1l*(0.2))*tienLuong);
        }
        else if(soNgayCong>=22){
            tienThuong=(long) ((0.1)*tienLuong);
        }
        else tienThuong=0;
        if(chucVu.equals("GD")) phuCap+=250000  ;
        else if(chucVu.equals("PGD")) phuCap+=200000;
        else if(chucVu.equals("TP")) phuCap+=180000;
        else if(chucVu.equals("NV")) phuCap+=150000;
        tongT=tienLuong+tienThuong+phuCap;
    }
    
    @Override
    public String toString(){
        return this.maNV+" "+this.hoTen+" "+this.tienLuong+" "+this.tienThuong+" "+this.phuCap+" "+this.tongT;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<OOPS> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            
            String ten=sc.nextLine();
            long luong =sc.nextLong();
            
            long ngayCong=sc.nextLong();
            
            String chucVu=sc.next();
            sc.nextLine();
            
            OOPS x = new OOPS(i+1,ten,luong,ngayCong,chucVu);
            list.add(x);
        }
        long sum=0;
        for(OOPS x:list){
            sum+=x.tongT;
            System.out.println(x);
        }
        System.out.println("Tong chi phi tien luong: "+sum);
    }
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV
