
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */

public class J05037 {
    private String maMH,tenMH,donViTinh;
    private long donGiaNhap,soLuong;
    private double phiVC,thanhTien,giaBan;
    public J05037(int maMH, String tenMH, String donViTinh, long donGiaNhap, long soLuong) {
        this.maMH ="MH"+String.format("%02d", maMH);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
        phiVC=donGiaNhap*soLuong*0.05;
        thanhTien=donGiaNhap*soLuong+phiVC;
        double a=(double)(thanhTien+thanhTien*0.02)/soLuong;
        giaBan=(double)Math.ceil(a/100)*100;
    }
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" "+this.donViTinh+" "+String.format("%.0f", phiVC)+" "+String.format("%.0f", thanhTien)+" "+String.format("%.0f", giaBan);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<J05037> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String donvi=sc.nextLine();
            long dongia=Long.parseLong(sc.nextLine());
            long soluong=Long.parseLong(sc.nextLine());
            J05037 x = new J05037(i+1,ten,donvi,dongia,soluong);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J05037>(){
            @Override
            public int compare(J05037 o1, J05037 o2) {
                if(o1.giaBan>o2.giaBan){
                    return -1;
                }
                else return 1;
            }
            
        });
        for(J05037 x : list){
            System.out.println(x);
        }
    }
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430