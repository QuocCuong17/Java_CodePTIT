import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J07053 {
    private String maSV,hoTen,ngaySinh,ketQua;
    private double diemLT,diemTH,diemThuong,tongDiem;
    private int tuoi;
    
    public static String chuanHoa(String s){
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
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static String chuanHoaNgay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1)=='/') sb.insert(0,"0");
        if(sb.charAt(4)=='/') sb.insert(3,"0");
        return sb.toString();
    }
    public J07053(int maSV,String hoTen, String ngaySinh, double diemLT, double diemTH) {
        this.maSV = "PH"+String.format("%02d",maSV);
        this.hoTen = chuanHoa(hoTen);
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        String dd=chuanHoaNgay(ngaySinh);
        String b = dd.substring(6, 10);
        int a=Integer.parseInt(b);
        tuoi=2021-a;
        if(diemLT>= 8 && diemTH>=8){
            diemThuong=1;
        }
        else if(diemLT>=7.5 && diemTH>=7.5){
            diemThuong=0.5;
        }
        else diemThuong=0;
        tongDiem=(double)((double)(diemLT+diemTH)/2+(double)diemThuong);
        
        if(tongDiem>=10) tongDiem=10;
        tongDiem=Math.round(tongDiem);
        if(tongDiem>=9){
            ketQua="Xuat sac";
        }
        else if(tongDiem>=8){
            ketQua="Gioi";
        }
        else if(tongDiem>=7){
            ketQua="Kha";
        }
        else if(tongDiem>=5){
            ketQua="Trung binh";
        }
        else ketQua="Truot";
        
    }
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.tuoi+" "+String.format("%.0f",tongDiem)+" "+this.ketQua;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("XETTUYEN.in"));
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String ngaysinh=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            J07053 x = new J07053(i+1,ten,ngaysinh,d1,d2);  
            System.out.println(x);
            
            }
    }
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9