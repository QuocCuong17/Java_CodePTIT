
import java.io.*;
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
        List<MonHoc> dsMH = new ArrayList<>();
        List<GiangVien> dsGV = new ArrayList<>();
        List<GIOCHUAN> dsGC = new ArrayList<>();
        //Scanner sc = new Scanner(new File("MONHOC.in"));
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsMH.add(new MonHoc(sc.next(), sc.nextLine()));
        }
        //sc = new Scanner(new File("GIANGVIEN.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsGV.add(new GiangVien(sc.next(), sc.nextLine()));
        }
        //sc = new Scanner(new File("GIOCHUAN.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            GIOCHUAN p = new GIOCHUAN(sc.next(), sc.next(), Double.parseDouble(sc.nextLine()));
            for (GiangVien x : dsGV) {
                if (x.getMaGV().equals(p.getmGV())) {
                    p.setG(x);
                }
            }
            for (MonHoc x : dsMH) {
                if (x.getMaMH().equals(p.getmMH())) {
                    p.setM(x);
                }
            }
            dsGC.add(p);
        }
//        Collections.sort(dsGC, new Comparator<GIOCHUAN>() {
//            @Override
//            public int compare(GIOCHUAN o1, GIOCHUAN o2) {
//                if (o1.getGio() >= o2.getGio()) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//
//        });
        String q = sc.next();
        for (GiangVien x : dsGV) {
            double a = 0;
            if (x.getMaGV().equals(q)) {
                System.out.println("Giang vien: " + x.getTenGV());
                for (GIOCHUAN x1 : dsGC) {
                    if (x1.getmGV().equals(x.getMaGV())) {
                        for (MonHoc x2 : dsMH) {
                            if (x1.getmMH().equals(x2.getMaMH())) {
                                System.out.println(x2.getTenMH().trim() + " " + x1.getGio());
                            }
                        }
                        a += x1.getGio();
                    }

                }
                System.out.print("Tong: ");
                System.out.println(String.format("%.2f", a));
            }

        }
    }
}
//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//3
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01 INT1155 113.2
//GV01