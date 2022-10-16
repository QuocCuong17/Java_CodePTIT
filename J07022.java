
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("DATA.in"));
        Vector<String> v = new Vector<>();
        while(sc.hasNext()){
            String s=sc.next();
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                v.add(s);
            }
        }
        Collections.sort(v);
        for(String x : v){
            System.out.print(x+" ");
        }
    }
}
