
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J03006_SoDep1 {
    public static boolean thuanNghich(String s){
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    public static boolean chia2(String s){
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)-'0')%2!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s=sc.nextLine();
            if(thuanNghich(s) && chia2(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
