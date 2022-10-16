
import java.text.*;
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.io.*;
import java.security.*;
import java.util.List;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 * CODEBYCUONGDZ
 */
public class J05032 {
    private String Ten;
    private String NgaySinh;
    //private int hsng,hst,hsn;
    private long Tools;
    public static String chuanHoaNgay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0,"0");
        if(sb.charAt(4)=='/') sb.insert(3,"0");
        return sb.toString();
    }
    

    public J05032(String Ten, String NgaySinh) {
        this.Ten = Ten;
        this.NgaySinh =chuanHoaNgay(NgaySinh);
        String a=NgaySinh.substring(0,2);
        String b=NgaySinh.substring(3,5);
        String c=NgaySinh.substring(6,10);
        int hsng=Integer.parseInt(a);
        int hst=Integer.parseInt(b);
        int hsn=Integer.parseInt(c);
        Tools=hsn*10000+hst*100+hsng;//Tools nhân số ngày lên 
    }
    @Override
    public String toString(){
        return this.Ten;
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        long dmin=0;
        long dmax=99999999;
        String s11="";
        String s22="";
        List<J05032> list = new ArrayList<>();   
        for(int i=0;i<n;i++){
            String a=sc.nextLine();
            String arr[]=a.split("\\s+");
            String ten=arr[0];
            String ngaySinh=arr[1];
            //String ngaySinh=arr[1];
            J05032 x = new J05032(ten,ngaySinh);
            list.add(x);
        }
        for(J05032 x : list){
            if(x.Tools>dmin){
                dmin=x.Tools;
            }
            if(x.Tools<dmax){
                dmax=x.Tools;
            }
        }
        for(J05032 x : list){
            if(x.Tools==dmax){
                System.out.println(x.Ten);
            }
            if(x.Tools==dmin) {
                System.out.println(x.Ten);
            }
        }
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990