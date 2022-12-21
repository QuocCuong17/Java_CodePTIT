
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J01003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }
            else {
                System.out.println("VN");
            }
        }
        else {
            double x=-b/a;
            System.out.printf("%.2f",x);
            System.out.println("");
        }
    }
}
