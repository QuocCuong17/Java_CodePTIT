/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author Đặng Cường
 */
public class J07040 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(("NHIPHAN.in")));
        List<String> l = (ArrayList<String>) ois.readObject();
        Set<String> se = new TreeSet<>();
        for (String x : l) {
            String w[] = x.trim().toLowerCase().split("\\s+");
            se.addAll(Arrays.asList(w));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String x = sc.next().toLowerCase();
            if (se.contains(x)) {
                System.out.println(x);
                se.remove(x);
            }
        }
    }
}
