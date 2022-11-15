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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J05060_KẾTQUẢXÉTTUYỂN {
    private String maSV,hoTen,ngaySinh,ketQua;
    private double diemLT,diemTH,diemThuong,tongDiem;
    private int tuoi;

    public J05060_KẾTQUẢXÉTTUYỂN(int maSV,String hoTen, String ngaySinh, double diemLT, double diemTH) {
        this.maSV = "PH"+String.format("%02d",maSV);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        String b = ngaySinh.substring(6, 10);
        int a=Integer.parseInt(b);
        tuoi=2021-a;
        if(diemLT>= 8 && diemTH>=8){
            diemThuong=1;
        }
        else if(diemLT>=7.5 && diemTH>=7.5){
            diemThuong=0.5;
        }
        else diemThuong=0;
        tongDiem=(double)((double)(diemLT+diemTH)/2+(double)diemThuong);
        
        if(tongDiem>=10) tongDiem=10;
        tongDiem=Math.round(tongDiem);
        if(tongDiem>=9){
            ketQua="Xuat sac";
        }
        else if(tongDiem>=8){
            ketQua="Gioi";
        }
        else if(tongDiem>=7){
            ketQua="Kha";
        }
        else if(tongDiem>=5){
            ketQua="Trung binh";
        }
        else ketQua="Truot";
        
    }
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.tuoi+" "+String.format("%.0f",tongDiem)+" "+this.ketQua;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String ngaysinh=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            J05060_KẾTQUẢXÉTTUYỂN x = new J05060_KẾTQUẢXÉTTUYỂN(i+1,ten,ngaysinh,d1,d2);  
            System.out.println(x);
        }
    }
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9
