
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
public class J05080 {
    private String maMH,tenMH,nhomLop,tenGV;

    public J05080(String maMH, String tenMH, String nhomLop, String tenGV) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomLop = nhomLop;
        this.tenGV = tenGV;
    }
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" "+this.nhomLop;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<J05080> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String maMH=sc.nextLine();
            String tenMH=sc.nextLine();
            String nhomLop=sc.nextLine();
            String tenGV=sc.nextLine();
            J05080 x = new J05080(maMH,tenMH,nhomLop,tenGV);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J05080>(){
            @Override
            public int compare(J05080 o1, J05080 o2) {
                if(o1.maMH.equals(o2.maMH)){
                    return o1.nhomLop.compareTo(o2.nhomLop);
                }
                else return o1.maMH.compareTo(o2.maMH);
            }
            
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s=sc.nextLine();
            System.out.println("Danh sach cho giang vien "+s+":");
            for(J05080 x: list){
                if(x.tenGV.equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//Nguyen Binh An