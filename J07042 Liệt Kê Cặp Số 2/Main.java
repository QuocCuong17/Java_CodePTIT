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
    public static int UCLN(int a , int b){
        if(b==0) return a;
        else return UCLN(b,a%b);
    }
    public static boolean check(int a, int b){
        if(UCLN(a, b)==1) return true;
        else return false;
    }
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Pair>l= (ArrayList<Pair>)ois.readObject();
        Collections.sort(l);
        Map<String,Boolean> m = new HashMap<>();
        for(Pair x : l){
            if(x.getFirst()<x.getSecond()&&check(x.getFirst(),x.getSecond())){
                if(m.containsKey(x.toString())==false){
                    System.out.println(x);
                    m.put(x.toString(), Boolean.FALSE);
                }
            }
        }
    }
}
