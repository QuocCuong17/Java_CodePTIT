/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06001;

import java.util.*;

/**
 *
 * @author Đặng Cường
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SanPham> dsSP = new ArrayList<>();
        List<HoaDon> dsHD = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            dsSP.add(new SanPham(sc.nextLine(), sc.nextLine(),Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            HoaDon p = new HoaDon(i+1, sc.nextLine());
            for(SanPham x : dsSP){
                if(x.getMaSP().equals(p.getMaLoai())){
                    p.setS(x);
                }
            }
            dsHD.add(p);
        }
        for(HoaDon x : dsHD){
            for(SanPham x1 : dsSP){
                if(x.getMaLoai().equals(x1.getMaSP())){
                    System.out.println(x.getMaHD()+" "+x1.getTenSP()+" "+x.getGiamGia()+" "+x.getPhaiTra());
                }
            }
        }
    }
}
/*
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105
*/