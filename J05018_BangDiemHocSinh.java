/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.Collections;
import java.util.Comparator;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class OOPS {
    private String hoTen,maSV;
    private double d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,DTB;

    public OOPS(int maSV,String hoTen, double d1, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.maSV="HS"+String.format("%02d",maSV);
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
        double r=(d1*2 + d2*2+d3+d4+d5+ d6+ d7+ d8+ d9+ d10)/12;
        this.DTB=Math.round(r*100.0)/100.0;
        
    }
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+String.format("%.1f",DTB);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<OOPS> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            double d1=sc.nextDouble();
            double d2=sc.nextDouble();
            double d3=sc.nextDouble();
            double d4=sc.nextDouble();
            double d5=sc.nextDouble();
            double d6=sc.nextDouble();
            double d7=sc.nextDouble();
            double d8=sc.nextDouble();
            double d9=sc.nextDouble();
            double d10=sc.nextDouble();
            list.add(new OOPS(i+1, ten,  d1,  d2,  d3,  d4,  d5,  d6,  d7,  d8,  d9,  d10));
        }
        Collections.sort(list, new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                if(o1.DTB>o2.DTB){
                    return -1;
                }
                else if(o1.DTB<o2.DTB)
                    return 1;
                else return o1.maSV.compareTo(o2.maSV);
            }
            
        });
        for(OOPS x : list){
            System.out.print(x);
            if(x.DTB>=9) System.out.println(" XUAT SAC");
            else if(x.DTB>=8) System.out.println(" GIOI");
            else if(x.DTB>=7) System.out.println(" KHA");
            else if(x.DTB>=5) System.out.println(" TB");
            else if(x.DTB>=0) System.out.println(" YEU");
            
        }
    }
}

//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0