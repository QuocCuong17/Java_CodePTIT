
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int dem = 1;
        int i = 0;
        boolean check = true;
        while (i < n){
            while(dem < a[i]){
                System.out.println(dem);
                dem++;
                check = false;
            }
            dem++;
            i++;
        }
        if(check){
            System.out.println("Excellent!");
        }
    }
}
