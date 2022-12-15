
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class J05045 {

    private String maNV, tenNV, chucVu;
    private int luongCB, soNgay, phuCap;
    private double luong,thuNhap,conLai,tamUng;
    
    public J05045(int maNV, String tenNV, String chucVu, int luongCB, int soNgay) {
        this.maNV = String.format("NV%02d", maNV);
        this.tenNV = tenNV;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.soNgay = soNgay;
        if (chucVu.equals("GD")) {
            phuCap = 500;
        } else if (chucVu.equals("PGD")) {
            phuCap = 400;
        } else if (chucVu.equals("TP")) {
            phuCap = 300;
        } else if (chucVu.equals("KT")) {
            phuCap = 250;
        } else {
            phuCap = 100;
        }
        luong = luongCB*soNgay;
        thuNhap=luong+phuCap;
        double a = (double)((phuCap+luong)*2.0/3.0);
        if(a<25000){
            tamUng=Math.round(a/1000)*1000;
        }else tamUng=25000;
        conLai=thuNhap-tamUng;
    }

    @Override
    public String toString() {
        return maNV+" "+tenNV+" "+phuCap+" "+String.format("%.0f", luong)+" "+String.format("%.0f", tamUng)+" "+String.format("%.0f", conLai);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<J05045> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            list.add(new J05045(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<J05045>() {
            @Override
            public int compare(J05045 o1, J05045 o2) {
                if(o1.thuNhap>o2.thuNhap){
                    return -1;
                }
                else if(o1.thuNhap<o2.thuNhap){
                    return 1;
                }
                else return o1.maNV.compareTo(o2.maNV);
            }
        });
        for (J05045 x : list) {
            System.out.println(x);
        }
    }

}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/
