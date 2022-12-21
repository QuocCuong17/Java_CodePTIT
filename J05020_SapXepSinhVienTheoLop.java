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
import java.util.TreeSet;

public class OOPS {
    private String maSV,hoTen,lopHoc,email;
    public static String chuanHoaTen(String s){
        StringBuilder sb =new StringBuilder("");
        String res="";
        String b='a'+ " "+s;
        String arr[]=b.split("\\s+");
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
            }
            res+=" ";
            
        }
        String ar[]=res.split("\\s+");
        for(int i=1;i<arr.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    
    public OOPS(String maSV, String hoTen, String lopHoc, String email) {
        this.maSV = maSV;
        this.hoTen =(hoTen);
        this.lopHoc = lopHoc;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLopHoc() {
        return lopHoc;
    }
    
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.email;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        List<OOPS> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            
            String ma=sc.next();
            sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String email=sc.next();
            arr.add(new OOPS(ma,ten,lop,email));
        }
        Collections.sort(arr, new Comparator <OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                if(o1.lopHoc.equals(o2.lopHoc)){
                    return o1.maSV.compareTo(o2.maSV);
                }
                else return o1.lopHoc.compareTo(o2.lopHoc);
            }
            
        });
        for(OOPS x : arr){
            System.out.println(x);
        }
    }
}

//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT03-B
//sv4@stu.ptit.edu.vn
