
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
public class J05054 {
    private String maSV,hoTen,trangThai;
    private double gpa;
    private int rank;

    public J05054(int maSV, String hoTen, double gpa) {
        this.maSV = "HS"+String.format("%02d", maSV);
        this.hoTen = hoTen;
        this.gpa = gpa;
        if(gpa>=9){
            trangThai="Gioi";
        }
        else if(gpa>=7){
            trangThai="Kha";
        }
        else if(gpa>=5){
            trangThai="Trung Binh";
        }
        else trangThai="Yeu";
    }
    
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.gpa+" "+this.trangThai+" "+this.rank;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<J05054> list1 = new ArrayList<>();
        List<J05054> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            double d=Double.parseDouble(sc.nextLine());
            J05054 x = new J05054(i+1,ten,d);
            list1.add(x);
            list2.add(x);
        }
        Collections.sort(list1, new Comparator<J05054>(){
            @Override
            public int compare(J05054 o1, J05054 o2) {
                if(o1.gpa>o2.gpa){
                    return -1;
                }
                else return 1;
            }
            
        });
        list1.get(0).rank=1;
        for(int i=1;i<list1.size();i++){
            if(list1.get(i).gpa==list1.get(i-1).gpa){
                list1.get(i).rank=list1.get(i-1).rank;
            }
            else list1.get(i).rank=i+1;
        }
        Collections.sort(list1,new Comparator<J05054>(){
            @Override
            public int compare(J05054 o1, J05054 o2) {
                return o1.maSV.compareTo(o2.maSV);
            }
            
        });
        for(J05054 x : list1){
            System.out.println(x);
        }
    }
}
//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2