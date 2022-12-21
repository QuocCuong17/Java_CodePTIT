
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J04001_KhaiBaoLopPoint {
    private double x,y;

    

    public J04001_KhaiBaoLopPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance(J04001_KhaiBaoLopPoint p1,J04001_KhaiBaoLopPoint p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double x1=sc.nextDouble();
            double x2=sc.nextDouble(),x3=sc.nextDouble(),x4=sc.nextDouble();
            J04001_KhaiBaoLopPoint p1 = new J04001_KhaiBaoLopPoint(x1,x2);
            J04001_KhaiBaoLopPoint p2 = new J04001_KhaiBaoLopPoint(x3,x4);
            System.out.printf("%.4f",distance(p1,p2));
            System.out.println("");
        }
    }
}
