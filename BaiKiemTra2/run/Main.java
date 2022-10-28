/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.*;
import java.util.*;

/**
 *
 * @author vinhp
 */
public class Main {

    public static void main(String[] args) {
//        QLKS q = new QLKS();
//        String fname = "src/controller/hd.dat";
//        q.docra(fname);
//        while (true) {
//            
//            System.out.println("1. nhap hoa don theo ngay");
//            System.out.println("2. nhap hoa don theo gio");
//            System.out.println("3. Hien thi danh sach");
//            System.out.println("4 . luu vao file");
//            System.out.println("5 . Sua");
//            System.out.println("6 . Sap xep theo ngay");
//            System.out.println("7 . Dua ra tong hoa don theo nam");
//            System.out.println("0 . Thoat");
//            System.out.print("Moi chon (0-7):");
//            int chon;
//            Scanner sc = new Scanner(System.in);
//            chon = Integer.parseInt(sc.nextLine());
//            switch (chon) {
//                case 0:
//                    System.out.println("bye !!!");
//                    System.exit(0);// safe exit
//                case 1:
//                    q.nhapHoaDonTheoNgay();
//                    break;
//                case 2:
//                    q.nhapHoaDonTheoGio();
//                    break;
//                case 3:
//                    q.hienthiDS();
//                    break;
//                case 4:
//                    q.luu(fname);
//                    break;
//                case 5:
//                    q.sua();
//                    break;
//                case 6:
//                    q.sapxeptheongayxuat();
//                    break;
//                case 7:
//                    q.duaratonghoadontheonam();
//                    break;
//                default:
//                    System.out.println("phai chon 0-15");
//                    break;
//            }
//        }
        String ngay = "02/04/2002";
        System.out.println();
        
        int s = Integer.parseInt(ngay.substring(0,ngay.indexOf("/")));
        System.out.println(s);
        int x = Integer.parseInt(ngay.substring(ngay.indexOf("/") + 1, ngay.lastIndexOf("/")));
        System.out.println(x);
    }
}
