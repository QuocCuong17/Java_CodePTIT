/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinhp
 */
public class IOFile {
    
    // doc tu file - luu vao danh sach
    public static <T> List<T> read(String fname){
        List<T> list = new ArrayList<>();
        
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            list = (List<T>)o.readObject();
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e){
            System.out.println(e);
        }
        
        
        return list;
    }

    // tu danh sach viet vao file
    public static <T> void write(String fname, List<T> arr) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
            o.writeObject(arr);
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

