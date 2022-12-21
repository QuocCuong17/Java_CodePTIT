/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OOPS {
    private String MA,maSV, hoTen, lopHoc;
    private double d1,d2,d3;

    public OOPS(String maSV, String hoTen, String lopHoc, double d1, double d2, double d3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+
                String.format("%.1f",d1)+" "+String.format("%.1f",d2)+" "+String.format("%.1f",d3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int p=n;
        List<OOPS>list= new ArrayList<>();
        for(int i=0;i<n;i++){
            String maSV=sc.next();
            sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            double d1=sc.nextDouble(),d2=sc.nextDouble(),d3=sc.nextDouble();
            OOPS x = new OOPS(maSV,hoTen,lopHoc,d1,d2,d3);
            list.add(x);
        }
        Collections.sort(list,new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                return o1.maSV.compareTo(o2.maSV);
            }
            
        });
        for(OOPS x :list){
            System.out.print(p-m+1+" ");
            System.out.println(x);
            m--;
        }
        
    }
}
