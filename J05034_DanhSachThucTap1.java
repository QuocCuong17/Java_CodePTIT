/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
public class OOPS {
    private String STT,maSV,hoTen,lopHoc,email,cty;
    
    
    public static String chuanHoaTen(String s){
        StringBuilder sb = new StringBuilder("");
        String arr[]= s.split("\\s+");
        for(int i=0;i<arr.length;i++){
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            for(int j=1;j<arr[i].length();j++){
                sb.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0,"0");
        if(sb.charAt(4)=='/') sb.insert(3, "0");
        return sb.toString();
    }

    public OOPS(int STT, String maSV, String hoTen, String lopHoc, String email, String cty) {
        this.STT = String.format("%01d", STT);
        this.maSV = maSV;
        this.hoTen = chuanHoaTen(hoTen);
        this.lopHoc = lopHoc;
        this.email = email;
        this.cty = cty;
    }
    @Override
    public String toString(){
        return this.STT+" "+this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.email+" "+this.cty;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       
        List<OOPS> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String maSV=sc.next();
            sc.nextLine();
            
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String email=sc.nextLine();
            String cty=sc.nextLine();
            OOPS x = new OOPS(i+1,  maSV,  hoTen,  lopHoc,  email,  cty);
            list.add(x);
        }
        Collections.sort(list, new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                return o1.hoTen.compareTo(o2.hoTen);
            }
            
        });
        int q=sc.nextInt();
        while(q-->0){
            String s=sc.next();
            
            
            for(OOPS x : list){
                if(x.cty.equals(s)){
                    System.out.println(x);
                }
            }
        }
        
    }
}
//6
//B17DCCN016 
//Le Khac Tuan Anh 
//D17HTTT2   
//test1@stu.ptit.edu.vn
//VIETTEL
//B17DCCN107 
//Dao Thanh Dat    
//D17CNPM5   
//test2@stu.ptit.edu.vn
//FPT
//B17DCAT092 
//Cao Danh Huy     
//D17CQAT04-B
//test3@stu.ptit.edu.vn
//FPT
//B17DCCN388 
//Cao Sy Hai Long  
//D17CNPM2   
//test4@stu.ptit.edu.vn
//VNPT
//B17DCCN461 
//Dinh Quang Nghia 
//D17CNPM2   
//test5@stu.ptit.edu.vn
//FPT
//B17DCCN554 
//Bui Xuan Thai    
//D17CNPM1   
//test6@stu.ptit.edu.vn
//GAMELOFT
//1
//FPT
