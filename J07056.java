
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J07056 {
    private String hoTen,loaiHo,maKH;
    private int chiSoDau,chiSoCuoi,tienTrongDM,tienVuotDM,DM,chiSo;
    private double VAT,tongTien;
     public static String chuanHoaTen(String ten){
        ten = ten.trim();
           String temp[] = ten.split("\\s+");
           for (int i = 0;i<temp.length; i++){
               temp[i] = Character.toUpperCase(temp[i].charAt(0))+temp[i].substring(1).toLowerCase();
           }
           return String.join(" ", temp);
    }

    public J07056(int maKH,String hoTen, String loaiHo, int chiSoDau, int chiSoCuoi) {
        this.maKH="KH"+String.format("%02d", maKH);
        this.hoTen = chuanHoaTen(hoTen);
        this.loaiHo = loaiHo;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        if(loaiHo.equals("A")){
            DM=100;
        }
        else if(loaiHo.equals("B")){
            DM=500;
        }
        else if(loaiHo.equals("C")){
            DM=200;
        }
        chiSo=chiSoCuoi-chiSoDau;
        if(chiSo<DM){
            tienTrongDM=chiSo*450;
        }
        else tienTrongDM=DM*450;
        if(chiSo>DM){
            tienVuotDM=(chiSo-DM)*1000;
        }
        else tienVuotDM=0;
        VAT=tienVuotDM*5.0/100.0;
        tongTien=tienTrongDM+tienVuotDM+VAT;
    }
    @Override
    public String toString(){
        return this.maKH+" "+this.hoTen+" "+this.tienTrongDM+" "+this.tienVuotDM+" "+String.format("%.0f", VAT)+" "+String.format("%.0f", tongTien);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("KHACHHANG.in"));
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<J07056> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            String arr[]=ma.split("\\s+");
            String m1=arr[0];
            int csd=Integer.parseInt(arr[1]);
            int csc=Integer.parseInt(arr[2]);
            J07056 x = new J07056(i+1,ten,m1,csd,csc);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07056>(){
            @Override
            public int compare(J07056 o1, J07056 o2) {
                if(o1.tongTien>o2.tongTien){
                    return -1;
                }
                else return 1;
            }
            
        });
        for(J07056 x : list){
            System.out.println(x);
        }
    }
}
//2
// nGuyEn Hong Ngat
//C 200 278
// Chu thi    minh
//A 120 160