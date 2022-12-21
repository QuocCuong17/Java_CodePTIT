/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OOPS {
    private String maMH,tenMH,donViTinh;
    private int donGiaNhap,soLuong;
    private double phiVC,thanhTien,giaBan;

    public OOPS(int maMH,String tenMH, String donViTinh, int donGiaNhap, int soLuong) {
        this.maMH= "MH"+String.format("%02d", maMH);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
        phiVC=(double) ((double)(donGiaNhap*soLuong)*0.05);
        thanhTien=(double)donGiaNhap*soLuong+(double)phiVC;
        giaBan=(double)(thanhTien)*1.02;
    }
    @Override
    public String toString(){
        return maMH+" "+tenMH+" "+donViTinh+" "+String.format("%.0f", phiVC)+" "+String.format("%.0f", thanhTien)
                +" "+String.format("%.0f", giaBan); 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<OOPS> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String tenMH=sc.nextLine();
            String donViTinh=sc.nextLine();
            int donGiaNhap=Integer.parseInt(sc.nextLine());
            int soLuong =Integer.parseInt(sc.nextLine());
            OOPS x= new OOPS(i+1,tenMH,donViTinh,donGiaNhap,soLuong);
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
