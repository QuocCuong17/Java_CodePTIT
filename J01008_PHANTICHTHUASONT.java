
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J01008_PHANTICHTHUASONT {
    public static int snt(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int to=t;
        while(t-->0){
            
            long n=sc.nextLong();
            System.out.print("Test "+(to-t)+": ");
            for(int i=2;i<=Math.sqrt(n);i++){
                int mu=0;
                while(n%i==0){
                    mu++;
                    n/=i;
                }
                if(mu>0){
                    System.out.print(i+"("+mu+")");
                    if(i<n) System.out.print(" ");
                }
            }
            if(n!=1) System.out.println(n+"("+1+")");
            System.out.println("");
        }
    }
}
//input
//
//Output
//
//3
//
//60
//
//128
//
//10000
//
//Test 1: 2(2) 3(1) 5(1)
//
//Test 2: 2(7)
//
//Test 3: 2(4) 5(4)