
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J03011_ƯỚCSỐCHUNGLỚNNHẤTCỦASỐNGUYÊNLỚN {
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            sc.nextLine();
            String m=sc.nextLine();
            long ans=0;
            for(int i=0;i<m.length();i++){
                ans=ans*10+(m.charAt(i)-'0');
                ans%=n;
            }
            System.out.println(gcd(n,ans));
        }
    }
}
//Input
//
//Output
//
//1
//
//1221
//
//1234567891011121314151617181920212223242526272829
//
//3
//
// 