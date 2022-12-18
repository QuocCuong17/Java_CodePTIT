
import java.io.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J07029 {

    public static boolean checkSNT(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        int a[] = new int[1000001];
        for (Integer x : l) {
            if (checkSNT(x)) {
                a[x]++;
            }
        }
        int dem = 0;
        for (int i = 1000000; i > 1; i--) {
            if (a[i] > 0) {
                System.out.println(i + " " + a[i]);
                dem++;
                if (dem >= 10) {
                    break;
                }
            }
        }
    }
}
