

import java.io.*;
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
       public static void main(String[] args) throws IOException {
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        ArrayList<MonHoc> dsMonHoc = new ArrayList<>();
        ArrayList<BangDiem> dsbangDiem = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsSinhVien.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("MONHOC.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsMonHoc.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            BangDiem p = new BangDiem(sc.next(), sc.next(), Double.parseDouble(sc.nextLine()));
            for (MonHoc x : dsMonHoc)
                if (x.getMa().equals(p.getmMH()))
                    p.setM(x);
            for (SinhVien x : dsSinhVien)
                if (x.getMa().equals(p.getMsv()))
                    p.setS(x);
            dsbangDiem.add(p);
        }
        Collections.sort(dsbangDiem, new Comparator<BangDiem>() {
            public int compare(BangDiem a, BangDiem b) {
                if (a.getDiem() > b.getDiem())
                    return -1;
                else if (a.getDiem() == b.getDiem() && a.getMsv().compareTo(b.getMsv()) < 0)
                    return -1;
                return 1;
            }
        });
        //sc.nextLine();
        
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            for (BangDiem x : dsbangDiem) {
                if (s.equals(x.getMaMH())) {
                    System.out.println("BANG DIEM MON " + x.getNameMH() + ":");
                    break;
                }
            }
            for (BangDiem x : dsbangDiem) {
                if (s.equals(x.getMaMH())) {
                    System.out.println(x);
                }
            }
        }
    }
}