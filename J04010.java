
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J04010 {
    private double x,y;

    public J04010(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public static double distance(J04010 a, J04010 b ){
        return Math.sqrt((Math.pow(a.x-b.x, 2))+Math.pow(a.y-b.y, 2));
    }
    public static double chuVi(J04010 a ,J04010 b,J04010 c){
        return distance(a, b)+distance(a, c)+distance(b,c);
    }
    public static double dienTich(J04010 a,J04010 b,J04010 c){
        double x = chuVi(a, b, c);
        x/=2;
        return Math.sqrt(x*(x-distance(a, b))*(x-distance(a, c))*(x-distance(b, c)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            double x1=sc.nextDouble();
            double x2=sc.nextDouble();
            double y1=sc.nextDouble();
            double y2=sc.nextDouble();
            double z1=sc.nextDouble();
            double z2=sc.nextDouble();
            J04010 a = new J04010(x1,x2);
            J04010 b = new J04010(y1,y2);
            J04010 c = new J04010(z1,z2);
            double AB = distance(a, b);
            double AC =distance(a, c);
            double BC = distance(b, c);
            if(AB+AC<=BC || AB + BC <= AC|| AC+BC<=AB){
                System.out.println("INVALID");
            }
            else{
                double s =dienTich(a, b, c);
                double r =(AB*AC*BC)/(4*s);
                System.out.printf("%.3f",Math.PI*r*r);
                System.out.println("");
            }
        }
    }
}
