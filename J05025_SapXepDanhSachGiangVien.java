/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OOPS {
    private String maGV,hoTen,boMon;

    public OOPS(int maGV, String hoTen, String boMon) {
        this.maGV = "GV"+String.format("%02d",maGV);
        this.hoTen = hoTen;
        String arr[]=boMon.split("\\s+");
        String res="";
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
        }
        this.boMon=res;
    }
    @Override
    public String toString(){
        return this.maGV+" "+this.hoTen+" "+this.boMon;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<OOPS> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            
            String ten=sc.nextLine();
            String bomon=sc.nextLine();
            OOPS x = new OOPS(i+1,ten,bomon);
            arr.add(x);
        }
        Collections.sort(arr,new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                String a[]=o1.hoTen.split("\\s+");
                String b[]=o2.hoTen.split("\\s+"); 
                if(a[a.length-1]!=b[b.length-1]){
                    return a[a.length-1].compareTo(b[b.length-1]);
                }
                else return o1.maGV.compareTo(o2.maGV);
            }
            
        });
        for(OOPS x:arr){
            System.out.println(x);
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin