/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Đặng Cường
 */

public class OOPS {
    private long tu,mau;

    public OOPS() {
    }

    public OOPS(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public static long gcd(long a,long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public void rutGon(){
        long x=gcd(tu,mau);
        tu/=x;
        mau/=x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        OOPS x = new OOPS(a,b);
        x.rutGon();;
        System.out.println(x.tu+"/"+x.mau);
    }
}
