
import java.util.*;
import java.io.*;

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
        //Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        ArrayList<DeTai> dsDT = new ArrayList<>();
        ArrayList<HoiDong> dsHD = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("DETAI.in"));
        t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String ten1 = sc.nextLine();
            String ten2 = sc.nextLine();
            DeTai dt = new DeTai(i + 1, ten1, ten2);
            dsDT.add(dt);
        }
        sc = new Scanner(new File("NHIEMVU.in"));
        t = Integer.parseInt(sc.nextLine());
        int to = t;
        while (t-- > 0) {
            String ss = sc.nextLine();
            String arr[] = ss.split("\\s+");
            String a = arr[0], b = arr[1], c = arr[2];
            HoiDong p = new HoiDong(a, b, c);
            for (SinhVien x : dsSV) {
                if (x.getMaSV().equals(p.getmSV())) {
                    p.setS(x);
                }
            }
            for (DeTai x : dsDT) {
                if (x.getMaDT().equals(p.getmDT())) {
                    p.setD(x);
                }
            }
            dsHD.add(p);
        }

        Collections.sort(dsHD, new Comparator<HoiDong>() {
            @Override
            public int compare(HoiDong o1, HoiDong o2) {
                if (o1.getmHD().equals(o2.getmHD())) {
                    return o1.getMSV().compareTo(o2.getMSV());
                } else {
                    return o1.getmHD().compareTo(o2.getmHD());
                }
            }

        });
        for (int i = 1; i <= to; i++) {
            System.out.println("DANH SACH HOI DONG " + i + ":");
            for (HoiDong x : dsHD) {
                if (x.getTenHD() == i) {
                    for (SinhVien x1 : dsSV) {
                        if (x.getmSV().equals(x1.getMaSV())) {
                            System.out.print(x1.getMaSV() + " " + x1.getHoTen() +  " ");
                        }
                    }
                    for (DeTai x2 : dsDT) {
                        if (x.getmDT().equals(x2.getMaDT())) {
                            System.out.println(x2.getTenDT()+" "+x2.getTenGV());
                        }
                    }
                }

            }
        }
    }
}

//2
//B19DCCN999
//Ngo Quang Huy
//0976544443
//B19DCCN999@stu.ptit.edu.vn
//B19DCCN997
//Nguyen Manh Cuong
//0987654321
//B19DCCN997@stu.ptit.edu.vn
//3
//Nguyen Hoai Nam
//Xay dung website tim kiem nha thong minh
//Tran Thanh Cong
//Xay dung he thong diem danh bang nhan dang van tay
//Le Thi My Uyen
//Xay dung website cap nhat tin tuc
//2
//B19DCCN997 DT001 HD2
//B19DCCN999 DT002 HD1