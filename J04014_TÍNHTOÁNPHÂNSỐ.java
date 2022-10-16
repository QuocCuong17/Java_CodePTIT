

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J04014_TÍNHTOÁNPHÂNSỐ {
    private long tu,mau;

    public J04014_TÍNHTOÁNPHÂNSỐ() {
    }

    public J04014_TÍNHTOÁNPHÂNSỐ(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public  void rutGon(){
        long x=gcd(tu,mau);
        tu/=x;
        mau/=x;
    }
    public static  J04014_TÍNHTOÁNPHÂNSỐ tongBinhPhuong(J04014_TÍNHTOÁNPHÂNSỐ ps1,J04014_TÍNHTOÁNPHÂNSỐ ps2){
        J04014_TÍNHTOÁNPHÂNSỐ ps= new J04014_TÍNHTOÁNPHÂNSỐ();
        ps1.rutGon();
        ps2.rutGon();
        ps.tu=ps1.tu*ps2.mau+ps1.mau*ps2.tu;
        ps.mau=ps1.mau*ps2.mau;
        ps.rutGon();
        ps.tu*=ps.tu;
        ps.mau*=ps.mau;
        return ps;
    }
    public static J04014_TÍNHTOÁNPHÂNSỐ tich3PhanSo(J04014_TÍNHTOÁNPHÂNSỐ ps1,J04014_TÍNHTOÁNPHÂNSỐ ps2,J04014_TÍNHTOÁNPHÂNSỐ ps3){
        ps1.rutGon();ps2.rutGon();ps3.rutGon();
        J04014_TÍNHTOÁNPHÂNSỐ ps = new J04014_TÍNHTOÁNPHÂNSỐ();
        ps.tu=ps1.tu*ps2.tu*ps3.tu;
        ps.mau=ps1.mau*ps2.mau*ps3.mau;
        ps.rutGon();
        return ps;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x1=sc.nextLong();
            long x2=sc.nextLong();
            long x3=sc.nextLong();
            long x4=sc.nextLong();
            J04014_TÍNHTOÁNPHÂNSỐ a = new J04014_TÍNHTOÁNPHÂNSỐ(x1,x2);
            J04014_TÍNHTOÁNPHÂNSỐ b = new J04014_TÍNHTOÁNPHÂNSỐ(x3,x4);
            J04014_TÍNHTOÁNPHÂNSỐ sum = tongBinhPhuong(a,b);
            System.out.print(sum.tu+"/"+sum.mau+" ");
            J04014_TÍNHTOÁNPHÂNSỐ tich = tich3PhanSo(sum,a,b);
            System.out.println(tich.tu+"/"+tich.mau);
        }
    }
}
