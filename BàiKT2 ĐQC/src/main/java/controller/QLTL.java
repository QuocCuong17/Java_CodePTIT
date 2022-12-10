/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import model.IChucNang;
import model.*;

/**
 *
 * @author Acer Gaming
 */
public class QLTL implements IChucNang {

    private List<TaiLieu> list;
    private Scanner sc = new Scanner(System.in);

    public QLTL() {
        list = new ArrayList<>();
    }

    public List<TaiLieu> getList() {
        return list;
    }

    public void setList(List<TaiLieu> list) {
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

    private TaiLieu nhap() {
        String ma, tenNhaXB;
        int soBanPH;
        String re = "^[ABCD]{1}\\d{3}";
        while (true) {
            try {
                System.out.print("Nhap ma: ");
                ma = sc.nextLine();
                if (vitri(ma) == -1 && ma.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Ma bi trung hoac khong dung dinh dang!!!");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        System.out.print("Nhap ten nha xuat ban: ");
        tenNhaXB = sc.nextLine();
        while (true) {
            try {
                System.out.print("So ban phat hanh: ");
                soBanPH = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Nhap sai dinh dang so!");
            }
        }
        return new TaiLieu(ma, tenNhaXB, soBanPH);
    }

    @Override
    public void nhapSach() {
        TaiLieu tl = nhap();
        String tenTG, tenSach;
        int soTrang;
        System.out.print("Nhap ten tac gia: ");
        tenTG = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        while (true) {
            try {
                System.out.print("So trang phat hanh: ");
                soTrang = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        Sach s = new Sach(tenTG, tenSach, soTrang, tl.getMa(), tl.getTenNhaXB(), tl.getSoBanPH());
        list.add(s);
    }

    @Override
    public void nhapBao() {
        TaiLieu tl = nhap();
        String ngayPH;

        String re = "^\\d{1,2}/\\d{1,2}/\\d{4}";
        while (true) {
            try {
                System.out.print("Nhap ngay phat hanh: ");
                ngayPH = sc.nextLine();
                if (ngayPH.matches(re)) {
                    break;
                } else {
                    throw new ValidException("Ngay khong dung dinh dang!!!");
                }
            } catch (ValidException e) {
                System.err.println(e);
            }
        }
        Bao b = new Bao(ngayPH, tl.getMa(), tl.getTenNhaXB(), tl.getSoBanPH());
        list.add(b);
    }

    @Override
    public void hienThiDS() {
        System.out.println("Danh sach tai lieu:");
        for (TaiLieu i : list) {
            System.out.println(i);
        }
        System.out.println("----------------");
        System.out.println("Tong so: " + list.size());
    }

    @Override
    public void sua() {
        System.out.print("Nhap vao ma can sua: ");
        String ma = sc.nextLine();
        int vt = vitri(ma);
        if (vt == -1) {
            System.out.println("Khong tim thay!");
        } else {
            TaiLieu t = list.get(vt);
            String  ten;
            int sobanph;
            System.out.print("Nhap vao ten nha xuat ban: ");
            ten = sc.nextLine();
            System.out.print("Nhap so ban phat hanh: ");
            sobanph=Integer.parseInt(sc.nextLine());
            t.setSoBanPH(sobanph);
            t.setTenNhaXB(ten);
            if (t instanceof Sach) {
                System.out.print("Nhap ten tac gia: ");
                String tentg=sc.nextLine();
                System.out.print("Nhap ten sach: ");
                String tensach=sc.nextLine();
                System.out.print("Nhap so trang: ");
                int sotrang = Integer.parseInt(sc.nextLine());
                ((Sach) t).setSoTrang(sotrang);
                ((Sach) t).setTenSach(tensach);
                ((Sach) t).setTenTG(tentg);
            }
            if (t instanceof Bao) {
                System.out.print("Nhap ngay phat hanh: ");
                String ngayph = sc.nextLine();
                ((Bao) t).setNgayPH(ngayph);
            }
            System.out.println("Sua Thanh Cong !!!");
        }
    }

    @Override
    public void xoa() {
        System.out.print("Nhap ma can xoa: ");
        String ma2 = sc.nextLine();
        int vt = vitri(ma2);
        if (vt == -1) {
            System.out.println("Khong tim thay ma");
        } else {
            System.out.println("Tai Lieu xoa: " + list.remove(vt));
            System.out.println("Xoa thanh cong!!!");
        }
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
    public void timSachTheoTenSach() {
        List<Sach> hdn= new ArrayList<>();
        int k=0;
        System.out.print("Nhap ten sach can tim : ");
        String ten1 = sc.nextLine();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                hdn.add((Sach) i);
            }
        }
        for(Sach i : hdn){
            if(i.getTenSach().toLowerCase().indexOf(ten1.toLowerCase())>=0){
                
                System.out.println(i);
                k++;
            }
        }
        if(k==0){
            System.out.println("Khong tim thay!");
        }
        else System.out.println("Tong tim thay: "+k);
    }

    @Override
    public void timBaoTuDenNam() {
        List<Bao> bao= new ArrayList<>();
        
        for(TaiLieu i : list){
            if(i instanceof Sach){
                bao.add((Bao) i);
            }
        }
        try {
            System.out.print("Nhap tu nam: ");
            int n1= Integer.parseInt(sc.nextLine());
            System.out.println("den nam: ");
            int n2= Integer.parseInt(sc.nextLine());
            int k=0;
            for(Bao i : bao){
                if(i.getNam()>=n1 && i.getNam()<=n2){
                    System.out.println(i);
                    k++;
                }
            }
            if(k==0){
                System.out.println("Khong tim thay!");
            }
            else {
                System.out.println("Tong bao: "+k);
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    @Override
    public void sxSoBanPH() {
        Collections.sort(list);
       // hienThiDS();
    }

    @Override
    public void sxSachTheoTenTG() {
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach)i);
            }
        }
        sach.sort(new Comparator<Sach>(){
            @Override
            public int compare(Sach o1, Sach o2) {
                String ten1=o1.getTenTG();
                String ten2=o2.getTenTG();
                String t1=ten1.substring(ten1.lastIndexOf(" ")+1)+ten1;
                String t2=ten2.substring(ten1.lastIndexOf(" ")+1)+ten2;
                return o1.compareTo(o2);
            }
            
        });
        for(Sach i : sach){
            System.out.println(i);
        }
        System.out.print("Tong sach: "+sach.size());
    }

    @Override
    public void sxBaoTheoNgayVaSBPH() {
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao)i);
            }
        }
        bao.sort(new Comparator<Bao>(){
            @Override
            public int compare(Bao o1, Bao o2) {
                StringTokenizer n1 = new StringTokenizer(o1.getNgayPH());
                StringTokenizer n2 = new StringTokenizer(o2.getNgayPH());
                String ng1="";
                while(n1.hasMoreTokens()){
                    ng1=n1.nextToken()+ng1;
                }
                String ng2="";
                while(n2.hasMoreTokens()){
                    ng2=n2.nextToken()+ng2;
                }
                if(ng1.equalsIgnoreCase(ng2)){
                    return o1.getSoBanPH()-o2.getSoBanPH();
                }
                else return ng1.compareToIgnoreCase(ng2);
            }
            
        });
        for(Bao i : bao){
            System.out.println(i);
        }
        System.out.print("Tong bao: "+bao.size());
    }

    @Override
    public void tinhSachVaBaoTheoNXB() {
        Map<String,Long> count = list.stream().collect(
                Collectors.groupingBy(TaiLieu::getTenNhaXB,Collectors.counting()));
        Iterator i = count.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+":"+count.get(key));
        }
        
    }
    @Override
    public void Moi1NamSLPhatHanhLaBNChoBao() {
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao)i);
            }
        }
        Map<Integer,Integer> sum = bao.stream().collect(
                Collectors.groupingBy(Bao::getNam,Collectors.summingInt(Bao::getSoBanPH)));
        Iterator i = sum.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+":"+sum.get(key));
        }
    }

    private TaiLieu TaiLieu(String ma, String tenNhaXB, int soBanPH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // max toan bo
    
    public void maxSachTheoSoTrang(){
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach)i);
            }
        }
        Optional<Sach> max =sach.stream().collect(Collectors.maxBy(
                Comparator.comparing(Sach::getSoTrang)));
        System.out.println("Sach co so trang nhieu nhat: ");
        System.out.println(max.isPresent()?max.get():"Khong ton tai!");
    }
    
    public void SachCoSoTrangLonTheoNXB(){
        List<Sach> sach = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Sach){
                sach.add((Sach)i);
            }
        }
        Map<String,Sach> max = sach.stream().collect(
                Collectors.groupingBy(Sach::getTenNhaXB,
                        Collectors.collectingAndThen(Collectors.reducing(
                                (Sach s1,Sach s2)->s1.getSoTrang()>s2.getSoTrang()?s1:s2),Optional::get)));;
        Iterator i = max.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+":"+max.get(key));
        }                        
    }
    public void MaxSoPHTheoCacNam(){
        List<Bao> bao = new ArrayList<>();
        for(TaiLieu i : list){
            if(i instanceof Bao){
                bao.add((Bao)i);
            }
        }
        Map<Integer,Bao> max = bao.stream().collect(
                Collectors.groupingBy(Bao::getNam,
                        Collectors.collectingAndThen(Collectors.reducing(
                                (Bao s1,Bao s2)->s1.getSoBanPH()>s2.getSoBanPH()?s1:s2),Optional::get)));;
        Iterator i = max.keySet().iterator();
        while(i.hasNext()){
            Object key = i.next();
            System.out.println(key+":"+max.get(key));
        }        
    }
}
