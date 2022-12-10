/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.*;
import java.util.*;

/**
 *
 * @author Acer Gaming
 */
public class Main {

    public static void main(String[] args) {
        QLGD q = new QLGD();
        String fname = "src/controller/gv.dat";
        q.docra(fname);
        while (true) {
            System.out.println("<--------------------MENU----------------->");
            System.out.println("1. Nhap giang vien co huu");
            System.out.println("2. Nhap giang vien thinh giang");
            System.out.println("3. Hien thi danh sach toan bo giang vien");
            System.out.println("4. Luu vao file");
            System.out.println("5. Sua");
            System.out.println("6. Tim kiem giang vien co huu theo luong");
            System.out.println("7. Dua ra giang vien co huu co luong cao nhat theo so gio dinh muc");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon (0-7):");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Hen gap lai ban !!!");
                    System.exit(0);
                case 1:
                    q.nhapGVCoHuu();
                    break;
                case 2:
                    q.nhapGVThinhGiang();
                    break;
                case 3:
                    q.hienThiDS();
                    break;
                case 4:
                    q.luu(fname);
                    break;
                case 5:
                    q.sua();
                    break;
                case 6:
                    q.timKiemGVCoHuu();
                    break;
                case 7:
                    q.duaRaGVCoHuuLuongCaoNhatTheoSoGioDinhMuc();
                    break;

                default:
                    System.out.println("Ban chi chon 0-7");
                    break;
            }
        }
    }
}
