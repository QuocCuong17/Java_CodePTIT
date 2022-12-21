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
public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws Exception {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        int a[]= new int [1000];
        Map<Integer,Integer> m = new TreeMap<>();
        for(int i=0;i<100000;i++){
            a[dt.readInt()]++;
        }
        for(int i=0;i<1000;i++){
            if(a[i]>0){
                System.out.println(i+" "+a[i]);
            }
        }
    }
}
