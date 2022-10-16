
import java.io.File;
import java.io.FileNotFoundException;
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
public class J07057 {
    private String maTS,hoTen,danToc,trangThai;
    private int khuVuc;
    private double diemThi,uuTien,tongDiem;
    public static String chuanHoaTen(String s){
        StringBuilder sb = new StringBuilder("");
        String a='a'+" "+s;
        String arr[]=a.split("\\s+");
        String res="";
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
            }
            res+=" ";
        }
        String ar[]=res.split("\\s+");
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public J07057(int maTS, String hoTen, double diemThi, String danToc, int khuVuc) {
        this.maTS ="TS"+String.format("%02d",maTS);
        this.hoTen = chuanHoaTen(hoTen);
        this.diemThi = diemThi;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        uuTien=0;
        if(khuVuc==1){
            uuTien+=1.5;
        }
        else if(khuVuc==2) uuTien+=1;
        else if(khuVuc==3) uuTien+=0;
        if(danToc.equals("Kinh")) uuTien+=0;
        else uuTien+=1.5;
        tongDiem=diemThi+uuTien;
        if(tongDiem>=20.5) trangThai="Do";
        else trangThai="Truot";
    }
    @Override
    public String toString(){
        return this.maTS+" "+this.hoTen+" "+String.format("%.1f",tongDiem)+" "+this.trangThai;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n=sc.nextInt();
        sc.nextLine();

        List<J07057> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            double diem=Double.parseDouble(sc.nextLine());
            String dantoc=sc.nextLine();
            int khuvuc=Integer.parseInt(sc.nextLine());
            J07057 x = new J07057 (i+1,ten,diem,dantoc,khuvuc);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07057>(){
            @Override
            public int compare(J07057 o1, J07057 o2) {
                if(o1.tongDiem>o2.tongDiem){
                    return -1;
                }
                else if(o1.tongDiem<o2.tongDiem){
                    return 1;
                }
                else return o1.maTS.compareTo(o2.maTS);
            }
            
        });
        for(J07057 x : list ){
            System.out.println(x);
        }
    }
}
