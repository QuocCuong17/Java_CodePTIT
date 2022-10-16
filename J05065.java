
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J05065 {
    private String Ma,HoTen,MaChucVu,MaTT,MaNhom;
    
    public J05065(String Ma, String HoTen) {
        this.Ma = Ma;
        this.HoTen = HoTen;
        MaChucVu=Ma.substring(0,2);
        MaNhom=Ma.substring(2,4);
        MaTT=Ma.substring(4,7);
        
    }
    public String toString(){
        return this.HoTen+" "+this.MaChucVu+" "+this.MaTT+" "+this.MaNhom;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);     
        int n=sc.nextInt();
        sc.nextLine();     
        ArrayList<J05065> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma=sc.next();
            String ten=sc.nextLine();
            J05065 x = new J05065(ma,ten);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J05065> (){
            @Override
            public int compare(J05065 o1, J05065 o2) {
                if(o1.MaNhom.equals(o2.MaNhom)){
                    return o1.MaTT.compareTo(o2.MaTT);
                }
                else return o1.MaNhom.compareTo(o2.MaNhom);
            }
            
        });
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s=sc.nextLine();
            for(J05065 x : list){
                if(x.MaChucVu.equals(s)){
                    System.out.println(x);
                }
            }
            System.out.println("");
        }
    }
}
//6
//GD08001 Nguyen Kim Loan
//TP05002 Hoang Thanh Tuan
//TP05001 Tran Binh Nguyen
//PP06002 Phan Trung Tuan
//PP06001 Tran Quoc Huy
//NV04003 Vo Van Lan
//2
//TP
//PP