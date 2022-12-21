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
    public static OOPS tongHaiPS(OOPS ps1, OOPS ps2){
        OOPS ps= new OOPS();
        ps1.rutGon();
        ps2.rutGon();
        ps.tu=ps1.tu*ps2.mau+ps1.mau*ps2.tu;
        ps.mau=ps1.mau*ps2.mau;
        ps.rutGon();
        return ps;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long x1=sc.nextLong(),x2=sc.nextLong(),x3=sc.nextLong(),x4=sc.nextLong();
        OOPS x=new OOPS(x1,x2);
        OOPS y=new OOPS(x3,x4);
        OOPS sum=tongHaiPS(x,y);
        System.out.println(sum.tu+"/"+sum.mau);
    }
}
