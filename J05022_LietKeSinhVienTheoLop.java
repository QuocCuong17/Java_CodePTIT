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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class OOPS {
    private String maSV,hoTen,lopHoc,email;
//    public static String chuanHoaTen(String s){
//        StringBuilder sb = new StringBuilder("");
//        String arr[]=s.split("\\s+");
//        for(int i=0;i<arr.length;i++){
//            sb.append(Character.toUpperCase(arr[i].charAt(0)));
//            for(int j=1;j<arr[i].length();j++){
//                sb.append(Character.toLowerCase(arr[i].charAt(j)));
//            }
//            sb.append(" ");
//        }
//        sb.deleteCharAt(sb.length()-1);
//        return sb.toString();
//    }
    public OOPS(String maSV, String hoTen, String lopHoc, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }
    
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.email;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<OOPS> list = new ArrayList<>();
        int n=sc.nextInt();
        Map<OOPS,String>mp=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            String maSV=sc.next();
            sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String email=sc.nextLine();
            OOPS x = new OOPS(maSV,hoTen,lopHoc,email);
            mp.put(x,lopHoc);
        }
        int q=sc.nextInt();
        while(q-->0){
            String s=sc.next();
            System.out.println("DANH SACH SINH VIEN LOP "+s+":");
            Set<Map.Entry<OOPS,String>> entry = mp.entrySet();
            for(Map.Entry<OOPS,String> x:entry){
                if(x.getValue().equals(s)){
                    System.out.println(x.getKey());
                }
            }
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
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B

