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
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class J05058_SẮPXẾPKẾTQUẢTUYỂNSINH {
    private String maThiSinh,hoTen;
    private double d1,d2,d3;

    public J05058_SẮPXẾPKẾTQUẢTUYỂNSINH(String maThiSinh, String hoTen, double d1, double d2, double d3) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }



    public double getDiemUT() {
        String a=maThiSinh.substring(0,3);
        if(a.equals("KV1")){
            return 0.5;
        }
        else if(a.equals("KV2")){
            return 1;
        }
        else return 2.5;
    }
    public double gettongDiem() {
        return d1*2+d2+d3+this.getDiemUT();
    }

    public String getTT() {
        if(this.gettongDiem()<24){
            return "TRUOT";
        }
        else return "TRUNG TUYEN";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<J05058_SẮPXẾPKẾTQUẢTUYỂNSINH> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String a=sc.next();
            sc.nextLine();
            String b=sc.nextLine();
            double d1=sc.nextDouble(),d2=sc.nextDouble(),d3=sc.nextDouble();
            J05058_SẮPXẾPKẾTQUẢTUYỂNSINH x = new J05058_SẮPXẾPKẾTQUẢTUYỂNSINH(a,b,d1,d2,d3);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J05058_SẮPXẾPKẾTQUẢTUYỂNSINH>(){
            @Override
            public int compare(J05058_SẮPXẾPKẾTQUẢTUYỂNSINH o1, J05058_SẮPXẾPKẾTQUẢTUYỂNSINH o2) {
                if(o1.gettongDiem()<o2.gettongDiem()){
                    return 1;
                }
                else if(o1.gettongDiem()>o2.gettongDiem()){
                    return -1;
                }
                else return o1.maThiSinh.compareTo(o2.maThiSinh);
            }
            
        });
        for(J05058_SẮPXẾPKẾTQUẢTUYỂNSINH x:list){
            System.out.print(x.maThiSinh+" "+x.hoTen+" ");
            if((int)x.getDiemUT()==x.getDiemUT()){
                System.out.printf("%.0f ",x.getDiemUT());
            }
            else System.out.printf("%.1f ",x.getDiemUT());
            if((int)x.gettongDiem()==x.gettongDiem()){
                System.out.printf("%.0f ",x.gettongDiem());
            }
            else {
                System.out.printf("%.1f ",x.gettongDiem());
            }
            System.out.println(x.getTT());
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7
