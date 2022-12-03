/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07047;

import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Đặng Cường
 */
public class KhachHang {

    private String maKH, tenKH, maPhong, KHP;
    private Date ngayDen, ngayDi;
    private KhachSan KS;
    private long soNgay;

    public KhachHang(int maKH, String tenKH, String maPhong, Date ngayDen, Date ngayDi) {
        this.maKH = "KH" + String.format("%02d", maKH);
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        KHP = maPhong.substring(2, 3);
        soNgay = (ngayDi.getTime() - ngayDen.getTime()) / 86400000 ;
    }

    public double getDGN() {
        return KS.getDonGiaNgay();
    }

    public double getPDV() {
        return KS.getPhiPV();
    }
    public double getTien() {
        double res = 0;
        if (soNgay < 10) {
            res += (soNgay * getDGN()) + (soNgay * getDGN()) * getPDV();
        } else if (soNgay < 20) {
            res += ((soNgay * getDGN()) + (soNgay * getDGN()) * getPDV()) * 0.98;
        } else if (soNgay < 30) {
            res += ((soNgay * getDGN()) + (soNgay * getDGN()) * getPDV()) * 0.96;
        } else {
            res += ((soNgay * getDGN()) + (soNgay * getDGN()) * getPDV()) * 0.94;
        }
        return res;
    }
    public double getTienKHONGNGAY() {
        double res = 0;
        res += (1 * getDGN()) + (1 * getDGN()) * getPDV();
        return res;
    }
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(Date ngayDen) {
        this.ngayDen = ngayDen;
    }

    public Date getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(Date ngayDi) {
        this.ngayDi = ngayDi;
    }

    public KhachSan getKS() {
        return KS;
    }

    public void setKS(KhachSan KS) {
        this.KS = KS;
    }

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DATA.in"));
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        List<KhachSan> dsKS = new ArrayList<>();
        List<KhachHang> dsKH = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String se1 = sc.nextLine();
            String arr[] = se1.split("\\s+");
            String a = arr[0];
            String b = arr[1];
            double c = Double.parseDouble(arr[2]);
            double d = Double.parseDouble(arr[3]);
            dsKS.add(new KhachSan(a, b, c, d));
        }
        t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String phong = sc.nextLine();
            String t1 = sc.nextLine();
            String t2 = sc.nextLine();
            Date d1 = df.parse(t1);
            Date d2 = df.parse(t2);
            KhachHang p = new KhachHang(i + 1, ten, phong, d1, d2);
            for (KhachSan x1 : dsKS) {
                if (x1.getKyHieu().equals(p.KHP)) {
                    p.setKS(x1);
                }
            }
            dsKH.add(p);
        }
        Collections.sort(dsKH, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if(o1.soNgay > o2.soNgay){
                    return -1;
                }
                else return 1;
            }
            
        });
        for (KhachHang x : dsKH) {
            if(x.soNgay>0)
                System.out.println(x.getMaKH() + " " + x.getTenKH() + " " + x.getMaPhong() + " " + x.soNgay + " " + String.format("%.2f", x.getTien()));
            else {
                System.out.println(x.getMaKH() + " " + x.getTenKH() + " " + x.getMaPhong() + " " + x.soNgay + " " + String.format("%.2f", x.getTienKHONGNGAY()));
            }
        }
    }
}
//2
//C THUONG 150 0.03
//B VIP 200 0.05
//2
//Nguyen Van Hoang
//55B1
//01/01/2021
//05/01/2021
//Nguyen Trung Dung
//04C6
//01/01/2021
//10/01/2021
