
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
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
public class J07051 {
    private String maKH,hoTen,soPhong;
    private Date ngayNhan,ngayTra;
    private int tienDV;
    private long soNgay,tongTien;
    public static String chuanHoaTen(String s){
        StringBuilder sb= new StringBuilder("");
        String res="";
        String a='a'+" "+s;
        String arr[]=a.split("\\s+");
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
            }
            res+=" ";
        }
        String res1="";
        String ar[]=res.split("\\s+");
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static String chuanHoa(String s){
        StringBuilder sb= new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0,"0");
        if(sb.charAt(4)=='/') sb.insert(3,"0");
        return sb.toString();
    }
    public J07051(int maKH, String hoTen, String soPhong, Date ngayNhan, Date ngayTra, int tienDV) {
        this.maKH = "KH"+String.format("%02d", maKH);
        this.hoTen = chuanHoaTen(hoTen);
        this.soPhong = soPhong;
        this.ngayNhan = (ngayNhan);
        this.ngayTra = (ngayTra);
        long a=ngayTra.getTime();
        long b=ngayNhan.getTime();
        soNgay=(long)(a-b)/86400000+1;
        this.tienDV = tienDV;
        char hello=soPhong.charAt(0);
        if(hello=='1'){
            tongTien=tienDV+soNgay*25;
        }
        else if(hello=='2'){
            tongTien=tienDV+soNgay*34;
        }
        else if(hello=='3'){
            tongTien=tienDV+soNgay*50;
        }
        else if(hello=='4'){
            tongTien=tienDV+soNgay*80;
        }   
    }
    @Override
    public String toString(){
        return this.maKH+" "+this.hoTen+this.soPhong+" "+this.soNgay+" "+this.tongTien;
    }
    public static void main(String[] args)  {
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc=new Scanner (System.in);
        
        try {
            int n=sc.nextInt();
            sc.nextLine();
            List<J07051> list = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                String ten=sc.nextLine();
                String sophong=sc.nextLine();
                String ngaynhan=sc.nextLine();
                ngaynhan=chuanHoa(ngaynhan);
                String ngaytra=sc.nextLine();
                ngaytra=chuanHoa(ngaytra);
                int tiendv=Integer.parseInt(sc.nextLine());
                Date d1=df.parse(ngaynhan);
                Date d2=df.parse(ngaytra);
                J07051 x =new J07051(i+1,ten,sophong,d1,d2,tiendv);
                list.add(x);
            }
            Collections.sort(list,new Comparator<J07051>(){
                @Override
                public int compare(J07051 o1, J07051 o2) {
                    if(o1.tongTien>o2.tongTien){
                        return -1;
                    }
                    else return 1;
                }
                
            });
            for(J07051 x : list ){
                System.out.println(x);
            }
        } catch (Exception e) {
        }
    }
    
}
//3
//Huynh VAN Thanh   
//103 
//5/6/2010   
//5/6/2010   
//15
//le   DUC cong  
//106 
//08/3/2010   
//1/5/2010   
//220
//Tran Thi Bich Tuyen   
//207
//10/4/2010   
//21/4/2010   
//96