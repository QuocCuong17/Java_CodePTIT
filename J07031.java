
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
public class J07031 {

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

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> l1 = (ArrayList<Integer>) ois1.readObject();
        Set<Integer> se1 = new TreeSet<>();
        for (Integer x : l1) {
            if (checkSNT(x)) {
                se1.add(x);
            }
        }
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> se2 = new TreeSet<>();
        for (Integer x : l2) {
            if (checkSNT(x)) {
                se2.add(x);
            }
        }
        for (Integer x : se1) {
            if (x >= 1000000 - x) {
                break;
            }
            if (se1.contains(1000000 - x) && !se2.contains(x) && !se2.contains(1000000 - x)) {
                System.out.println(x + " " + (1000000 - x));
            }
        }
    }
}
