import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class J02006_HOPCUAHAIDAYSO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Set<Integer> se = new TreeSet<>();
        int a[]=new int [n];
        int b[]=new int [m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            se.add(a[i]);
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            se.add(b[i]);
        }
        for(Integer x:se){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
}
