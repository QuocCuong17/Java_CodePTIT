
import java.util.*;
import java.io.*;

/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J07032 {

    public static boolean check(String s) {
        if (s.length() % 2 == 0 || s.length() == 1) {
            return false;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
            if ((s.charAt(i) - '0') % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> l1 = (ArrayList<Integer>) ois1.readObject();
        int f1[] = new int[1000001];
        for (Integer x : l1) {
            if (check(x.toString())) {
                f1[x]++;
            }
        }
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l2 = (ArrayList<Integer>) ois2.readObject();
        int f2[] = new int[1000001];
        for (Integer x : l2) {
            if (check(x.toString())) {
                f2[x]++;
            }
        }
        int dem = 0;
        for (int i = 0; i <= 1000000; i++) {
            if (f1[i] > 0 && f2[i] > 0) {
                dem++;
                System.out.println(i + " " + (f1[i] + f2[i]));
            }
            if (dem == 10) {
                break;
            }
        }
    }
}
