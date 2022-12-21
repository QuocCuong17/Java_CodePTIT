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
import java.util.Scanner;

public class OOPS {
    private String taiKhoan,tenNguoi,gioVao,gioRa;
    private int soGio,soPhut,tong;

    public OOPS(String taiKhoan, String tenNguoi, String gioVao, String gioRa) {
        this.taiKhoan = taiKhoan;
        this.tenNguoi = tenNguoi;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        String a1=gioVao.substring(0,2);
        String a2=gioVao.substring(3,5);
        String b1=gioRa.substring(0,2);
        String b2=gioRa.substring(3,5);
        int x1=Integer.parseInt(a1);
        int x2=Integer.parseInt(a2);
        int y1=Integer.parseInt(b1);
        int y2=Integer.parseInt(b2);
        tong=y1*3600+y2*60-x1*3600-x2*60;
        int tong1 = tong;
        while(tong1>=3600){
            soGio=soGio+1;
            tong1-=3600;
            
        }
        while(tong1>=60){
            soPhut=soPhut+1;
            tong1-=60;
        }
        
    }
    public String toString (){
        return this.taiKhoan+" "+this.tenNguoi+" "+this.soGio+" gio "+this.soPhut+" phut";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<OOPS> arr= new ArrayList<>();
        for(int i=0;i<n;i++){
            sc.nextLine();
            String tk=sc.nextLine();
            String nguoi=sc.nextLine();
            String giovao=sc.nextLine();
            String giora=sc.next();
            arr.add(new OOPS(tk,nguoi,giovao,giora) );
        }
        Collections.sort(arr, new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                if(o1.tong>o2.tong){
                    return -1;
                }
                else if(o1.tong<o2.tong){
                    return 1;
                }
                else return o1.taiKhoan.compareTo(o2.taiKhoan);
            }
            
        });
        for(OOPS x : arr){
            System.out.println(x);
        }
        System.out.println("");
    }
    
}
