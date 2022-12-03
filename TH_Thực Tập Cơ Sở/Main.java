
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
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        ArrayList<DeTai> dsDT = new ArrayList<>();
        ArrayList<NhiemVu> dsNV = new ArrayList<>();
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
        while (t-- > 0) {
            String ss =sc.nextLine();
            String arr[]=ss.split("\\s+");
            String a = arr[0],b=arr[1];
            NhiemVu p = new NhiemVu(a, b);
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
            dsNV.add(p);
        }
        Collections.sort(dsNV, new Comparator<NhiemVu>(){
            @Override
            public int compare(NhiemVu o1, NhiemVu o2) {
                return o1.getTENDT().compareTo(o2.getTENDT());
            }
            
        });
        for (NhiemVu x : dsNV) {
            for(SinhVien x1 : dsSV){
                if(x.getmSV().equals(x1.getMaSV())){
                    System.out.print(x1.getMaSV()+" "+x1.getHoTen()+" "+x1.getSdt()+" "+x1.getEmail()+" ");
                }
            }
            for(DeTai x2 :dsDT){
                if(x.getmDT().equals(x2.getMaDT())){
                    System.out.println(x2.getTenGV()+" "+x2.getTenDT());
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
//B19DCCN997 DT001
//B19DCCN999 DT002
