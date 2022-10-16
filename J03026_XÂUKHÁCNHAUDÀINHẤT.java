
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J03026_XÂUKHÁCNHAUDÀINHẤT {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0){
                
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            if(s1.equals(s2)){
                System.out.println("-1");
                //break;
            }
            else{
                System.out.println(Math.max(s1.length(),s2.length()));
            }
        }
    }
}