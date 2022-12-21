/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J05043 {
    private String ma,ten,chucvu;
    private int luongcb,songay,phucap,luongchinh,thunhap;
    private double tamung,conlai;
    public J05043(int ma, String ten, String chucvu, int luongcb, int songay) {
        this.ma = String.format("NV%02d", ma);
        this.ten = ten;
        this.chucvu = chucvu;
        this.luongcb = luongcb;
        this.songay = songay;
        if(chucvu.equals("GD")) phucap=500;
        else if(chucvu.equals("PGD")) phucap=400;
        else if(chucvu.equals("TP")) phucap=300;
        else if(chucvu.equals("KT")) phucap=250;
        else phucap=100;
        luongchinh = luongcb*songay;
        thunhap = luongchinh+phucap;
        double a = (double) ((luongchinh)*2/3);
        if(a<25000){
            tamung = Math.round(a/1000)*1000;
        }
        else tamung=25000;
        conlai=thunhap-tamung;
     }
    @Override
    public String toString(){
        return ma +" "+ten+" "+phucap+" "+luongchinh+" "+String.format("%.0f", tamung)+" "+String.format("%.0f", conlai);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<J05043> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            l.add(new J05043(i+1,sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        for(J05043 x : l){
            System.out.println(x);
        }
    }
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
*/
