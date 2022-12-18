
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
public class J07015 {

    public static boolean snt(int n) {
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
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> m = new TreeMap<>();
        for (Integer x : l) {
            if (snt(x)) {
                if (m.containsKey(x) == true) {
                    m.put(x, m.get(x) + 1);
                } else {
                    m.put(1, x);
                }
            }
        }
        Set<Integer> se = m.keySet();
        for (Integer x : se) {
            System.out.println(x + " " + m.get(x));
        }
    }
}
