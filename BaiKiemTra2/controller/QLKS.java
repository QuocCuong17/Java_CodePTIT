/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.*;
import java.util.stream.Collectors;
import model.*;

/**
 *
 * @author vinhp
 */
public class QLKS implements IChucNang {

    private List<HoaDon> list;
    private Scanner sc = new Scanner(System.in);

    public QLKS() {
        list = new ArrayList<>();

    }

    private int vitri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    private HoaDon nhap() {
        String ma, ngayXuat, hoVaTen;
        double giaBan;
        String re = "^[NX]{1}\\d{2}";
        while (true) {
            try {
                System.out.print("ma : ");
                ma = sc.nextLine().toUpperCase();
                if (vitri(ma) == -1 && ma.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Ma bi trung hoac khong dung dinh dang");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        while (true) {
            try {
                System.out.print("Nhap ngay phat hanh: ");
                ngayXuat = sc.nextLine();
                if (ngayXuat.matches("^\\d{1,2}/\\d{1,2}/\\d{4}$")) {
                    break;
                } else {
                    throw new ValidException("Nhap khong dung dinh dang");
                }
            } catch (ValidException e) {
                System.out.println("Nhap lai");
            }

        }

        System.out.println("Nhap ho va ten");
        hoVaTen = sc.nextLine();
        return new HoaDon(ma, ngayXuat, hoVaTen);
    }

    public List<HoaDon> getList() {
        return list;
    }

    public void setList(List<HoaDon> list) {
        this.list = list;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public void nhapHoaDonTheoNgay() {
        HoaDon hd = nhap();
        int soNgay;
        while (true) {
            try {
                System.out.println("Nhap so ngay ");
                soNgay = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sai dinh dang");
            }
        }
        HoaDonTheoNgay o = new HoaDonTheoNgay(soNgay, hd.getMa(), hd.getNgayXuat(), hd.getHoVaTen());
        list.add(o);

    }

    @Override
    public void nhapHoaDonTheoGio() {
        HoaDon hd = nhap();
        System.out.println("Nhap gio: ");
        int soGio = Integer.parseInt(sc.nextLine());
        HoaDonTheoGio o = new HoaDonTheoGio(soGio, hd.getMa(), hd.getNgayXuat(), hd.getHoVaTen());
        list.add(o);
    }

    @Override
    public void hienthiDS() {
        System.out.println("DS PTGT");
        for (HoaDon ptgt : list) {
            System.out.println(ptgt);
        }
        System.out.println("--------");
        System.out.println("tong so: " + list.size());
    }

    @Override
    public void luu(String fname) {
        IOFile.write(fname, list);
    }

    @Override
    public void docra(String fname) {
        setList(IOFile.read(fname));
    }

    @Override
    public void sua() {
        System.out.println("Nhap vao ma can sua");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay");
        } else {
            HoaDon t = list.get(vt);
            String ngayXuat, hoVaTen;
            System.out.println("Nhap ngay san xuat");
            ngayXuat = sc.nextLine();
            t.setNgayXuat(ngayXuat);
            System.out.println("Ho va ten");
            hoVaTen = sc.nextLine();
            t.setHoVaTen(hoVaTen);
            if (t instanceof HoaDonTheoNgay) {

                System.out.print("Nhap so ngay: ");
                int soNgay = Integer.parseInt(sc.nextLine());
                ((HoaDonTheoNgay) t).setSoNgayThue(soNgay);
            }
            if (t instanceof HoaDonTheoGio) {
                System.out.println("Nhap so gio");
                int soGio = Integer.parseInt(sc.nextLine());
                ((HoaDonTheoGio) t).setSoGioThue(soGio);
            }
            System.out.println("Sua thanh cong");
        }
    }

    @Override
    public void sapxeptheongayxuat() {
        list.sort(new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                StringTokenizer n1 = new StringTokenizer(o1.getNgayXuat(), "/");
                StringTokenizer n2 = new StringTokenizer(o2.getNgayXuat(), "/");
                String ng1 = "";
                while (n1.hasMoreTokens()) {
                    ng1 = n1.nextToken() + ng1;
                }
                String ng2 = "";
                while (n2.hasMoreTokens()) {
                    ng2 = n2.nextToken() + ng2;
                }
                return ng1.compareToIgnoreCase(ng2);
            }

        });
        hienthiDS();
    }

    @Override
    public void duaratonghoadontheonam() {

        Map<Integer, Double> sum = list.stream().collect(
                Collectors.groupingBy(HoaDon::getNam, Collectors.summingDouble(HoaDon::getTienTT)));
        Iterator i = sum.keySet().iterator();
        while (i.hasNext()) {
            Object key = i.next();
            System.out.println(key + ":" + sum.get(key));
        }

    }

}
