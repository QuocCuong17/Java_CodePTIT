/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class OOPS {
    private double x,y;

    public OOPS() {
    }

    public OOPS(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double distance(OOPS a, OOPS b){
        return Math.sqrt((Math.pow(a.x-b.x, 2)) + Math.pow(a.y-b.y, 2));
    }
    public static double chuVi(OOPS a, OOPS b, OOPS c){
        return distance(a,b)+distance(a,c)+distance(b,c);
    }
    public static double dienTich(OOPS a,OOPS b, OOPS c){
        double x= chuVi(a,b,c);
        x/=2;
        return Math.sqrt(x*(x-distance(a,b))*(x-distance(a,c))*(x-distance(b,c)));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            double x1=sc.nextDouble(),x2=sc.nextDouble(),x3=sc.nextDouble(),x4=sc.nextDouble(),
                    x5=sc.nextDouble(),x6=sc.nextDouble();
            OOPS a = new OOPS(x1,x2);
            OOPS b = new OOPS(x3,x4);
            OOPS c = new OOPS(x5,x6);
            if(distance(a,b)+distance(a,c)<=distance(b,c)||distance(b,c)+distance(a,c)<=distance(a,b)||distance(a,b)+distance(b,c)<=distance(a,c)){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.2f",dienTich(a,b,c));
            }
            System.out.println("");
        }
    }
}

