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
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OOPS {
    private String maDN,tenDN;
    private int soSV;

    public OOPS(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }
    
    @Override
    public String toString(){
        return this.maDN+" "+this.tenDN+" "+this.soSV;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<OOPS,Integer> mp = new TreeMap<>();
        int n = sc.nextInt();
        List<OOPS> list= new ArrayList<>();   
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            OOPS x = new OOPS(ma,ten,sl);
            list.add(x);
        }
        Collections.sort(list,new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                if(o1.soSV!=o2.soSV){
                    return o2.soSV-o1.soSV;
                }
                else return o1.maDN.compareTo(o2.maDN);
            }
            
        });
        int q=sc.nextInt();
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(OOPS x : list){
                if(x.soSV>=a && x.soSV<=b){
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
