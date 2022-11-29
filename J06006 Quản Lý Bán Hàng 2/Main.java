
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
        List<HoaDon> dsHD = new ArrayList<>();
        List<KhachHang> dsKH = new ArrayList<>();
        List<MatHang> dsMH = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            dsKH.add(new KhachHang(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            dsMH.add(new MatHang(i+1, sc.nextLine(), sc.nextLine(),Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            HoaDon p = new HoaDon(i+1,  sc.next(),  sc.next(), Integer.parseInt(sc.next()));
            for(KhachHang x :dsKH){
                if(x.getMaKH().equals(p.getMaKH())){
                    p.setK(x);
                }
            }
            for(MatHang x :dsMH){
                if(x.getMaMH().equals(p.getMaMH())){
                    p.setM(x);
                }
            }
            dsHD.add(p);
        }
        Collections.sort(dsHD,new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                if(o1.getLoiNhuan()>o2.getLoiNhuan()){
                    return -1;
                }
                else return 1;
            }
            
        });
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