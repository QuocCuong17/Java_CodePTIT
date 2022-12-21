/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.Collections;
import java.util.Comparator;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class OOPS {
    private int gio,phut,giay;

    public OOPS(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getSort() {
        int a=gio*3600+phut*60+giay;      
        return a;
    }
    @Override
    public String toString(){
        return this.gio+" "+this.phut+" "+this.giay;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List <OOPS> list= new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            OOPS x = new OOPS(a,b,c);
            list.add(x);
        }
        Collections.sort(list, new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                return o1.getSort()-o2.getSort();
            }
            
        });
        for(OOPS x:list){
            System.out.println(x);
        }
    }
}