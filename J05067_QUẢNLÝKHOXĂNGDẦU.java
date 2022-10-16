import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05067_QUẢNLÝKHOXĂNGDẦU {

    private String maDH, hangSX;
    private long soLuong, donGia, thue, thanhTien;

    public J05067_QUẢNLÝKHOXĂNGDẦU(String maDH, long soLuong) {
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
        List<J05067_QUẢNLÝKHOXĂNGDẦU> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            long b = sc.nextLong();
            J05067_QUẢNLÝKHOXĂNGDẦU x = new J05067_QUẢNLÝKHOXĂNGDẦU(a, b);
            System.out.println(x);
        }

    }
}
