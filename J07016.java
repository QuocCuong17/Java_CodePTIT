
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
public class J07016 {

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
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> l2 = (ArrayList<Integer>) ois2.readObject();
        Map<Integer, Integer> m1 = new TreeMap<>();
        Map<Integer, Integer> m2 = new TreeMap<>();
        for (Integer x : l1) {
            if (checkSNT(x)) {
                if (m1.containsKey(x) == true) {
                    m1.put(x, m1.get(x) + 1);
                } else {
                    m1.put(x, 1);
                }
            }

        }
        for (Integer x : l2) {
            if (checkSNT(x)) {
                if (m2.containsKey(x) == true) {
                    m2.put(x, m2.get(x) + 1);
                } else {
                    m2.put(x, 1);
                }
            }
        }
        Set<Integer> se = m1.keySet();
        for (Integer x : se) {
            if (m2.containsKey(x)) {
                System.out.println(x + " " + m1.get(x) + " " + m2.get(x));
            }
        }
    }
}
