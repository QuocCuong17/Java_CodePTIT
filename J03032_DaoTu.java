
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J03032_DaoTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String arr[] = s.split("\\s+");
            String res = "";
            for (int i = arr.length - 1; i >= 0; i--) {
                res += arr[i] + " ";
            }
            StringBuilder sb = new StringBuilder(res);
            System.out.println(sb.reverse() + " ");
        }
    }
}
