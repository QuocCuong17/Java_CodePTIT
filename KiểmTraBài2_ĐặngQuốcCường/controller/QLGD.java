/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Acer Gaming
 */
public class QLGD implements IChucNang {

    private List<GiangVien> list;
    private Scanner sc = new Scanner(System.in);

    public QLGD() {
        list = new ArrayList<>();
    }

    public List<GiangVien> getList() {
        return list;
    }

    public void setList(List<GiangVien> list) {
        this.list = list;
    }

    private int vitri(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    private GiangVien nhap() {
        String ma, hoVaTen;
        int soGioDayTrongThang;
        String re = "^[PM]{2}\\d{3}";
        while (true) {
            try {
                System.out.print("ma: ");
                ma = sc.nextLine().toUpperCase();
                if (vitri(ma) == -1 && ma.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Ma bi trung hoac khong dung dinh dang!");

                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        System.out.print("Nhap ho va ten: ");
        hoVaTen = sc.nextLine();
        while (true) {
            try {
                System.out.print("Nhap so gio day trong thang: ");
                soGioDayTrongThang = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhap lai cho dung dinh dang so");
            }
        }
        return new GiangVien(ma, hoVaTen, soGioDayTrongThang);
    }

    @Override
    public void nhapGVCoHuu() {
        GiangVien gv = nhap();
        int soGioDinhMuc;
        while (true) {
            try {
                System.out.print("Nhap so gio dinh muc: ");
                soGioDinhMuc = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Sai dinh dang!");
            }
        }
        GVCoHuu gvch = new GVCoHuu(soGioDinhMuc, gv.getMa(), gv.getHoVaTen(), gv.getSoGioDayTrongThang());
        list.add(gvch);
    }

    @Override
    public void nhapGVThinhGiang() {
        GiangVien gv = nhap();
        int heSo;
        while (true) {
            try {
                System.out.print("Nhap he so: ");
                heSo = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap sai dinh dang so!");
            }
        }
        GVThinhGiang gvtg = new GVThinhGiang(heSo, gv.getMa(), gv.getHoVaTen(), gv.getSoGioDayTrongThang());
        list.add(gvtg);
    }

    @Override
    public void hienThiDS() {
        System.out.println("Danh sach Giang Vien: ");
        for (GiangVien i : list) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        System.out.println("Tong so: " + list.size());
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
        System.out.print("Nhap vao ma can sua: ");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay!");
        } else {
            GiangVien g = list.get(vt);
            String hoVaTen;
            int soGioDayTrongThang;
            System.out.print("Nhap vao ten giang vien: ");
            hoVaTen = sc.nextLine();
            System.out.print("Nhap so gio day trong thang: ");
            soGioDayTrongThang = Integer.parseInt(sc.nextLine());
            g.setHoVaTen(hoVaTen);
            g.setSoGioDayTrongThang(soGioDayTrongThang);
            if (g instanceof GVCoHuu) {

                System.out.print("Nhap so gio dinh muc: ");
                int sogiodm = Integer.parseInt(sc.nextLine());
                ((GVCoHuu) g).setSoGioDinhMuc(sogiodm);

            }
            
            System.out.println("Sua Thanh Cong !!!");
        }
    }

    @Override
    public void timKiemGVCoHuu() {
        List<GVCoHuu> gvch = new ArrayList<>();

        for (GiangVien i : list) {
            if (i instanceof GVCoHuu) {
                gvch.add((GVCoHuu) i);
            }
        }
        try {
            System.out.print("Nhap luong tu: ");
            int l1 = Integer.parseInt(sc.nextLine());
            System.out.print("den: ");
            int l2 = Integer.parseInt(sc.nextLine());
            int k = 0;
            for (GVCoHuu i : gvch) {
                if (i.getLuong() >= l1 && i.getLuong() <= l2) {
                    System.out.println(i);
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("Khong tim thay!");
            } else {
                System.out.println("Tong giang vien co huu: " + k);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    @Override
    public void duaRaGVCoHuuLuongCaoNhatTheoSoGioDinhMuc() {
        List<GVCoHuu> gvch = new ArrayList<>();
        for (GiangVien i : list) {
            if (i instanceof GVCoHuu) {
                gvch.add((GVCoHuu) i);
            }
        }
        Map<Integer, GVCoHuu> max = gvch.stream().collect(
                Collectors.groupingBy(GVCoHuu::getSoGioDinhMuc,
                        Collectors.collectingAndThen(Collectors.reducing(
                                (GVCoHuu s1, GVCoHuu s2) -> s1.getLuong() > s2.getLuong() ? s1 : s2), Optional::get)));;
        Iterator i = max.keySet().iterator();
        while (i.hasNext()) {
            Object key = i.next();
            System.out.println(key + ":" + max.get(key));
        }
    }
}
