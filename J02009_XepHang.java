
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J02009_XepHang {
    private int t1,t2;

    public J02009_XepHang(int t1, int t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<J02009_XepHang> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            J02009_XepHang x = new J02009_XepHang(t1,t2);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J02009_XepHang>(){
            @Override
            public int compare(J02009_XepHang o1, J02009_XepHang o2) {
                if(o1.t1>o2.t1){
                    return 1;
                }
                else return -1;
            }
            
        });
       
        int s=list.get(0).t1+list.get(0).t2;
        for(int i=1;i<list.size();i++){
            if(s>=list.get(i).t1){
                s+=list.get(i).t2;
            }
            else s=list.get(i).t2+list.get(i).t1;
        } 
        System.out.println(s);
    }
}
