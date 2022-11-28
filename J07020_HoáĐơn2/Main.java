
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
        List<KhachHang> dsKH =  new ArrayList<>();
        List<MatHang> dsMH =  new ArrayList<>();
        List<HoaDon> dsHD =  new ArrayList<>();
        Scanner sc = new Scanner (new File("KH.in"));
        //Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            dsKH.add(new KhachHang(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner (new File("MH.in"));
        t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            String tenMH =sc.nextLine();
            String dvT =sc.nextLine();
            int giaMua=Integer.parseInt(sc.nextLine());
            int giaBan=Integer.parseInt(sc.nextLine());
            MatHang mh = new MatHang(i+1, tenMH, dvT, giaMua, giaBan);
            dsMH.add(mh);
        }
        sc = new Scanner (new File("HD.in"));
        t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            HoaDon p = new HoaDon(i+1, sc.next(),sc.next(),Integer.parseInt(sc.next()));
            for(KhachHang x : dsKH){
                if(x.getMaKH().equals(p.getmKH())){
                    p.setK(x);
                }
            }
            for(MatHang x : dsMH){
                if(x.getMaMH().equals(p.getmMH())){
                    p.setM(x);
                }
            }
            dsHD.add(p);
        }
        for(HoaDon x : dsHD){
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4