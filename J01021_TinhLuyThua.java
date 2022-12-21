
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J01021_TinhLuyThua {
    public static int mod =1000000007;
    public static long LT(long a, long b){
        if(b==0) return 1;
        long x=LT(a,b/2);
        if(b%2==0) return (x*x)%mod;
        else return (x*((x*a)%mod))%mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long n= sc.nextLong(),k=sc.nextLong();
            if(n==0&&k==0) return ;
            else System.out.println(LT(n,k));
        }
    }
}
