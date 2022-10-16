
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J05049 {

    private String ma,hs;
    private long soLuongNhap;
    private double soLuongXuat, donGia, tien, thue;

    public J05049(String ma, long soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        if (ma.startsWith( "A")) {
            soLuongXuat = Math.round(soLuongNhap/100.0*60);
        }
        else if (ma.startsWith( "B")) {
            soLuongXuat = Math.round(soLuongNhap/100.0*70);
        }
        if (ma.endsWith("Y")) {
            donGia = 110000;
        } else if(ma.endsWith("N")) {
            donGia = 135000;
        }
        tien =donGia*soLuongXuat;
        if (ma.startsWith( "A") && ma.endsWith("Y")) {
                thue = tien/100.0*8;
        }
        else if(ma.startsWith( "A") && ma.endsWith("N")){
                thue = tien/100.0*11;
        }
        if (ma.startsWith( "B") && ma.endsWith("Y")) {
            thue = Math.round(tien/100.0*17);
        }
        else if (ma.startsWith( "B") && ma.endsWith("N")) {
            thue = Math.round(tien/100.0*22);
        }
        hs=ma.substring(0,1);
    }

    public double getThue() {
        return thue;
    }

    public double setTien() {
        return donGia*soLuongXuat;
    }
    
    @Override
    public String toString(){
        return this.ma+" "+this.soLuongNhap+" "+String.format("%.0f",soLuongXuat)
                +" "+String.format("%.0f",donGia)+" "+String.format("%.0f",setTien())
                +" "+String.format("%.0f",thue);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<J05049> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            long sl=Long.parseLong(sc.nextLine());
            J05049   x = new J05049(ma,sl);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J05049>(){
            @Override
            public int compare(J05049 o1, J05049 o2) {
                if(o1.thue>o2.thue){
                    return -1;
                }
                else return 1;
            }
            
        });
        String s=sc.next();
        for(J05049 x : list){
            if(x.hs.equals(s)){
                System.out.println(x);
            }
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B