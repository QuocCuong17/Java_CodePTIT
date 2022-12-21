/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author Đặng Cường
 */
public class J07004_SoKhacNhauTrongFile1 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer,Integer> m = new HashMap<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if(m.containsKey(n)==true){
                m.put(n,m.get(n)+1);
            }
            else {
                m.put(n,1);
            }
        }
        Set<Integer> se = m.keySet();
        for(Integer x : se){
            System.out.println(x+" "+m.get(x));
        }
    }
}
