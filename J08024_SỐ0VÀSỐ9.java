
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class J08024_SỐ0VÀSỐ9 {
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Queue<Integer> q=new LinkedList<>();
            q.add(9);
            while(!q.isEmpty()){
                int k=q.peek();
                q.remove();
                if(k%n==0){
                    System.out.println(k);
                    break;
                }
                q.add(k*10);
                q.add(k*10+9);
            }
        }
    }
}
