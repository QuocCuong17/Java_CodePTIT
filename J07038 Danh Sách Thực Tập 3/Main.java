
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<SinhVien> dsSV = new ArrayList<>();
        List<ThucTap> dsTT = new ArrayList<>();
        List<DoanhNghiep> dsDN = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            dsSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("DN.in"));
        t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            dsDN.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("THUCTAP.in"));
        t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            ThucTap p = new ThucTap(sc.next(), sc.nextLine().trim());
            for (SinhVien x : dsSV) {
                if (x.getMaSV().equals(p.getmSV())) {
                    p.setS(x);
                }
            }
            for (DoanhNghiep x : dsDN) {
                if (x.getMaDN().equals(p.getmDN())) {
                    p.setD(x);
                }
            }
            dsTT.add(p);
        }
        Collections.sort(dsTT, new Comparator<ThucTap>() {
            @Override
            public int compare(ThucTap o1, ThucTap o2) {
                return o1.getmSV().compareTo(o2.getmSV());
            }

        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.print("DANH SACH THUC TAP TAI ");
            for (DoanhNghiep x : dsDN) {
                if (x.getMaDN().equals(s)) {
                    System.out.println(x.getTenDN() + ":");
                    //break;
                }
            }
            for (DoanhNghiep x2 : dsDN) {
                int dem=x2.getSoSV();
                if (x2.getMaDN().equals(s)) {
                    for (ThucTap x : dsTT) {
                        if (x.getmDN().equals(s)) {
                            for (SinhVien x1 : dsSV) {
                                if (x.getmSV().equals(x1.getMaSV())) {
                                    System.out.println(x1.getMaSV() + " " + x1.getHoTen() + x1.getLop());
                                    dem-=1;
                                }
                            }

                        }
                        if(dem==0) break;
                    }
                }
                
            }
        }

    }
}
//2
//B15DCKT150
//NGUYEN NGOC SON
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//NguyeN   TrONg Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//2
//B15DCKT150 VIETTEL
//B15DCKT199 SUN
//1
//SUN
