
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class J05064 {

    private String ma, ten, chucVu;
    private long luongCB, heso, phucap, thunhap;

    public J05064(String ma, String ten, long luongCB) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        chucVu = ma.substring(0, 2);
        if (chucVu.equals("HT")) {
            phucap = 2000000;
        } else if (chucVu.equals("HP")) {
            phucap = 900000;
        } else if (chucVu.equals("GV")) {
            phucap = 500000;
        }
        heso = Integer.parseInt(ma.substring(2, 4));
        thunhap = luongCB * heso + phucap;
    }

    public String toString() {
        return ma + " " + ten + " " + heso + " " + phucap + " " + thunhap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<J05064> l = new ArrayList<>();
        int ht = 0, hp = 0;
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            int ok = 0;
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long luong = Long.parseLong(sc.nextLine());
            J05064 x = new J05064(ma, ten, luong);
            if (x.chucVu.equals("HT")) {
                ht++;
                if (ht == 1) {
                    l.add(x);
                }
            } else if (x.chucVu.equals("HP")) {
                hp++;
                if (hp < 3) {
                    l.add(x);
                }
            }
            else l.add(x);
        }
        for (J05064 x : l) {
            System.out.println(x);
        }
    }
}
/*
4
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
HT03
Hoang Thanh Tuan
1780000
*/
