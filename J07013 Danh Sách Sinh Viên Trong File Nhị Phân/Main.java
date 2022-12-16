/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachsinhvien1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Đặng Cường
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> ds = (ArrayList<SinhVien> ) in.readObject();
        for (SinhVien x : ds) System.out.println(x);
    }
}
