/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.*;
import java.util.*;
/**
 *
 * @author Đặng Cường
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Pair> arr = (ArrayList<Pair>) ois.readObject();
        Collections.sort(arr);
        Map<String,Boolean> m =new HashMap<>();
        for(Pair x : arr){
            if(x.getFirst()<x.getSecond()){
                if(m.containsKey(x.toString())==false){
                    System.out.println(x);
                    m.put(x.toString(),true);
                }
            }
        }
    }
}
