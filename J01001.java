import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class J01001 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(),b=sc.nextInt();
        int chuVi=(a+b)*2;
        int dienTich=a*b;
        if(a<=0 || b<=0){
            System.out.println("0");
        }
        
        else{
            System.out.println(chuVi+" "+dienTich);
        }
    }
}
