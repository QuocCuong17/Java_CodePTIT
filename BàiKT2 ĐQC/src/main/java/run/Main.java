    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import controller.*;
import java.util.Scanner;

/**
 *
 * @author Acer Gaming
 */

public class Main {
    public static void main(String[] args) {
        QLTL q = new QLTL();
        String fname = "src/controller/tl.dat";
        q.docra(fname);
        while (true) {
            System.out.println("<----------MENU---------->");
            System.out.println("1. Nhap sach");
            System.out.println("2. Nhap bao");
            System.out.println("3. Hien thi danh sach");
            System.out.println("4. Luu vao file");
            System.out.println("5. Xoa");
            System.out.println("6. Luu");
            System.out.println("7. Doc tu file");
            System.out.println("8. Tim sach theo ten sach");
            System.out.println("9. Tim bao tu nam den nam");
            System.out.println("10. Sap xep cho so ban phat hanh");
            System.out.println("11. Sap xep sach theo ten tac gia");
            System.out.println("12. Sap xep sach theo ngay phat hanh va so ban phat hanh");
            System.out.println("13. Tinh so dau sach va bao theo nha xuat ban");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon (0-15):");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 0:
                    System.out.println("Hen gap lai ban sau !!!");
                    System.exit(0);
                case 1:
                    q.nhapSach();
                    break;
                case 2:
                    q.nhapBao();
                    break;
                case 3:
                    q.hienThiDS();
                    break;
                case 4:
                    q.luu(fname);
                    break;
                case 5:
                    q.xoa();
                    break;
                case 6:
                    q.luu(fname);
                    
                    break;
                case 7:
                    q.docra(fname);
                    break;
                case 8:
                    q.timSachTheoTenSach();
                    break;
                case 9:
                    q.timBaoTuDenNam();
                    break;
                case 10:
                    q.sxSoBanPH();
                    break;    
                case 11:
                    q.sxSachTheoTenTG();
                   break;   
                case 12:
                    q.sxBaoTheoNgayVaSBPH();
                    break;   
                case 13:
                    q.tinhSachVaBaoTheoNXB();
                    break;    
                case 14:
                    
                    break;   
                case 15:
                    
                    break;   
                default:
                    System.out.println("Ban chi chon 0-7");
                    break;
            }
        }
    }
}
