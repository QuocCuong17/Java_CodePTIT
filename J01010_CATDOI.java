
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J01010_CATDOI {
    public static void CatDoi(String s){
        if(s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("6")||s.contains("7")){
            System.out.println("INVALID");
        }else {
            s = s.replace('8','0');
            s = s.replace('9','0');
            int i = 0;
            while (i < s.length() && s.charAt(i) == '0') i++;
            if(i == s.length()){
                System.out.println("INVALID");
            }else {
                System.out.println(s.substring(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            CatDoi(s);
        }
    }
}
