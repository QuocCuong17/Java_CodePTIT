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
import java.util.Scanner;

public class OOPS {

    private String maDH, hangSX;
    private long soLuong, donGia, thue, thanhTien;

    public OOPS(String maDH, long soLuong) {
        this.maDH = maDH;
        this.soLuong = soLuong;
        String a = maDH.substring(0, 1);

        String b = maDH.substring(3, 5);
        if (b.equals("BP")) {
            hangSX = "British Petro";
        } 
        else if (b.equals("ES")) {
            hangSX = "Esso";
        } 
        else if (b.equals("SH")) {
            hangSX = "Shell";
        } 
        else if (b.equals("CA")) {
            hangSX = "Castrol";
        } 
        else if (b.equals("MO")) {
            hangSX = "Mobil";
        } 
        else {
            hangSX = "Trong Nuoc";
        }
        if (a.equals("X") ) {
            donGia = 128000;
            if(hangSX!="Trong Nuoc")
                thue = (long) (1l * donGia * (0.03) * soLuong);
            else thue=0;
        } else if (a.equals("D")) {
            donGia = 11200;
            if(hangSX!="Trong Nuoc")
                thue = (long) (1l * donGia * (0.035) * soLuong);
            else thue=0;

        } else if (a.equals("N")) {
            donGia = 9700;
            if(hangSX!="Trong Nuoc")
                thue = (long) (1l * donGia * (0.02) * soLuong);
            else thue=0;
        }
//        else {
//            donGia=thue=0;
//        }
        thanhTien = 1l * (donGia * soLuong) + thue;
    }

    @Override
    public String toString() {
        return this.maDH + " " + this.hangSX + " " + this.donGia + " " + this.thue + " " + this.thanhTien;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<OOPS> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            long b = sc.nextLong();
            OOPS x = new OOPS(a, b);
            System.out.println(x);
        }

    }
}
//3
//N89BP 4500
//D00BP 3500
//X92SH 2600

