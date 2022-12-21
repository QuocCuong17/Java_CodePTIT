/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OOPS {
    private String ma,hoTen,ngaySinh;
    private double d1,d2,d3,tongDiem;

    public OOPS(int ma, String hoTen, String ngaySinh, double d1, double d2, double d3) {
        this.ma = String.format("%01d",ma);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        tongDiem=d1+d2+d3;
    }
    public String toString(){
        return this.ma+" "+this.hoTen+" "+this.ngaySinh+" "+this.tongDiem;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<OOPS> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String ngaySinh=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            OOPS x = new OOPS(i+1,ten,ngaySinh,d1,d2,d3);
            list.add(x);
        }
        double hello=0;
        for(OOPS x : list){
            hello=Math.max(hello,x.tongDiem);
        }
        for(OOPS x : list ){
            if(x.tongDiem==hello){
                System.out.println(x);
            }
        }
    }
}
//3
//Nguyen Van A
//12/12/1994
//3.5
//7.0
//5.5
//Nguyen Van B
//1/9/1994
//7.5
//9.5
//9.5
//Nguyen Van C
//6/7/1994
//8.5
//9.5
//8.5
