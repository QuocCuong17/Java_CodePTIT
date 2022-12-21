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



public class Tesstt {
    private String maSV,hoTen,lopHoc,ngaySinh;
    private double gpa;
    public static String chuanHoaNgay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0, "0");
        if(sb.charAt(4)=='/') sb.insert(3,"0");
        return sb.toString();
    }
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
    public Tesstt(int maSV, String hoTen, String lopHoc, String ngaySinh, double gpa) {
        this.maSV = "B20DCCN" + String.format("%03d", maSV);
        this.hoTen = chuanHoaTen(hoTen);
        this.lopHoc = lopHoc;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.gpa = gpa;
    }

    public String getMaSV() {
        return maSV;
    }

    public double getGpa() {
        return gpa;
    }
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.ngaySinh+" "+String.format("%.2f",gpa);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Tesstt> list= new ArrayList<>();     
        sc.nextLine();
        for(int i=0;i<n;i++){
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String ngaySinh=sc.nextLine();
            double gpa =Double.parseDouble(sc.nextLine());
            Tesstt x = new Tesstt(i+1,hoTen,lopHoc,ngaySinh,gpa);
            list.add(x);
        }
        Collections.sort(list,new Comparator<Tesstt>(){
            @Override
            public int compare(Tesstt o1, Tesstt o2) {
                if(o1.getGpa()>o2.getGpa()){
                    return -1;
                }
                else if(o1.getGpa()<o2.getGpa()){
                    return 1;  
                }
                else return o1.getMaSV().compareTo(o2.maSV);
            }       
        });
        for(Tesstt x:list){
            System.out.println(x.toString());
        }
    }
}

//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0
