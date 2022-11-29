
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
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsMH.add(new MonHoc(sc.next(), sc.nextLine()));
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsGV.add(new GiangVien(sc.next(), sc.nextLine()));
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
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
        Collections.sort(dsGC, new Comparator<GIOCHUAN>() {
            @Override
            public int compare(GIOCHUAN o1, GIOCHUAN o2) {
                if (o1.getGio() >= o2.getGio()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });

        for (GiangVien x : dsGV) {
            double a=0;
            for (GIOCHUAN x1 : dsGC) {
                if (x1.getmGV().equals(x.getMaGV())) {
                    a+=x1.getGio();
                }
                
            }
            System.out.println(x.getTenGV()+" "+String.format("%.2f", a));
        }
    }
}
