import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class J03016_CHIAHẾTCHO11 {
    public static boolean check(String s){
        long res=0;
        for(int i=0;i<s.length();i++){
            res=res*10+s.charAt(i)-'0';
            res%=11;
        }
        if(res==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==true) System.out.println("1");
            else System.out.println("0");
        }
        System.out.println("");
    }
}
