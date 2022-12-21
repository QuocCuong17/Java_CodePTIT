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
import java.util.Scanner;
public class OOPS {
    private double x,y;

    public OOPS() {
    }

    public OOPS(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public static double distance (OOPS a , OOPS b){
        return Math.sqrt((Math.pow(a.x-b.x, 2))+Math.pow(a.y-b.y, 2));
    }
    public static double chuVi(OOPS a, OOPS b,OOPS c){
        return distance(a,b)+distance(a,c)+distance(b,c);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double x1=sc.nextDouble();
            double x2=sc.nextDouble();
            double x3=sc.nextDouble();
            double x4=sc.nextDouble();
            double x5=sc.nextDouble();
            double x6=sc.nextDouble();
            OOPS a = new OOPS(x1,x2);
            OOPS b = new OOPS(x3,x4);
            OOPS c = new OOPS(x5,x6);
            if(distance(a,b)+distance(a,c)<=distance(b,c) || distance(a,b)+distance(b,c)<=distance(a,c)|| distance(a,c)+distance(b,c)<=distance(a,b)){
                System.out.println("INVALID");
            }
            else {
                System.out.printf("%.3f",chuVi(a, b, c));
                System.out.println("");
            }
        }
    }
}
