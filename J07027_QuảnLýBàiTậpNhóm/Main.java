
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
    public static void main(String[] args) throws FileNotFoundException {
        List<SinhVien> dsSV = new ArrayList<>();
        List<BaiTap> dsBT = new ArrayList<>();
        List<Nhom> dsN = new ArrayList<>();
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        //Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        int to=t;
        while(t-->0){
            dsSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("BAITAP.in"));
        int t1=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t1;i++){
            dsBT.add(new BaiTap(i+1, sc.nextLine()));
        }
        sc = new Scanner(new File("NHOM.in"));
        //int t2=Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<to;i++){
            Nhom p = new Nhom(sc.next(),sc.next());
            for(SinhVien x : dsSV){
                if(x.getMaSV().equals(p.getmSV())){
                    p.setS(x);
                }
            }
            for(BaiTap x : dsBT){
                if(x.getMaBT().equals(p.getmN())){
                    p.setB(x);
                }
            }
            dsN.add(p);
        }
        Collections.sort(dsN,new Comparator<Nhom>(){
            @Override
            public int compare(Nhom o1, Nhom o2) {
                return o1.getmSV().compareTo(o2.getmSV());
            }
            
        });
        for(Nhom x : dsN){
            System.out.println(x);
        }
    }
}
//5
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//B17DTCN011
//Vu Viet Thang
//0981234567
//B17DTCN023
//Pham Trong Thang
//0992123456
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
//B17DTCN001 1
//B17DTCN011 1
//B17DTCN023 1
//B17DTCN022 2
//B17DTCN031 2