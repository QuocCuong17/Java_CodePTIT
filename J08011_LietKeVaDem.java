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
public class J08011 {
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max =0;Map<String,Integer> m = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            
            if(check(s)){
                if(m.containsKey(s)==true){
                    m.put(s, m.get(s)+1);
                    if(max<m.get(s)+1){
                        max=m.get(s)+1;
                    }
                }
                else m.put(s, 1);
            }
        }
        Set<String> se = m.keySet();
        while(max>0){
            for(String x : se){
                if(m.get(x)==max){
                    System.out.println(x+" "+m.get(x));
                }
            }
            max--;
        }
    }
}
