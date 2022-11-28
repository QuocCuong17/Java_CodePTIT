
import java.util.*;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Data1> ds1= new ArrayList<>();
        List<Data2> ds2= new ArrayList<>();
        Scanner sc = new Scanner(new File("DATA1.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            ds1.add(new Data1(sc.nextLine(), sc.nextLine(),Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        sc = new Scanner(new File("DATA2.in"));
        t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            Data2 p = new Data2(i+1, sc.next(), Integer.parseInt(sc.next()));
            for(Data1 x : ds1){
                if(p.getHdbd().contains(x.getMaLoai())){
                    p.setD(x);
                }
            }
            ds2.add(p);
        }
        for(Data2 x : ds2){
            System.out.println(x);
        }
    }
}
