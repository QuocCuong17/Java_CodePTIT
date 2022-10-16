
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J07059 {
    private String maCT;
    private String ngayThi;
    private String gioThi,phongThi;
    private int caThi,hsng,hsn,hst;
    public J07059(int maCT, String ngayThi, String gioThi, String phongThi) {
        this.maCT = "C"+String.format("%03d", maCT);
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
        String a=gioThi.substring(0,2);
        String b=gioThi.substring(3,5);
        int h1=Integer.parseInt(a);
        int h2=Integer.parseInt(b);
        caThi=h1*1000+h2;
        String y1=ngayThi.substring(0, 2);
        String y2=ngayThi.substring(3,5);
        String y3=ngayThi.substring(6,10);
        hsng=Integer.parseInt(y1);
        hst=Integer.parseInt(y2);
        hsn=Integer.parseInt(y3);
    }
    @Override
    public String toString(){
        return this.maCT+" "+this.ngayThi+" "+this.gioThi+" "+this.phongThi;
    }
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner sc=new Scanner(new File("CATHI.in"));
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        List<J07059> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();  
        for(int i=0;i<n;i++){
            String ngaythi=sc.nextLine();
            String giothi=sc.nextLine();
            String phongThi=sc.nextLine();
            J07059 x = new J07059(i+1,ngaythi,giothi,phongThi);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J07059>(){
            @Override
            public int compare(J07059 o1, J07059 o2) {
                if(o1.hsng!=o2.hsng){
                    return o1.hsng-o2.hsng;
                }
                else if(o1.hsng==o2.hsng && o1.hst != o2.hst){
                    return o1.hst-o2.hst;
                }
                else if(o1.hsng==o2.hsng&&o1.hst==o2.hst && o1.hsn!=o2.hsn){
                    return o1.hsn-o2.hsn;
                }
                else if(o1.gioThi!=o2.gioThi){
                    return o1.gioThi.compareTo(o2.gioThi);
                }
                else return o1.maCT.compareTo(o2.maCT);
            }
            
        });
        for(J07059 x : list ){
            System.out.println(x);
        }
    }
}
//2
//09/01/2022
//15:30
//70172
//09/01/2022
//10:00
//70279