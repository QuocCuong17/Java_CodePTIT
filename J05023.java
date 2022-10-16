
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class J05023 {
    private String maSV,hoTen,lopHoc,email;
    private int khoa;
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
    public J05023(String maSV, String hoTen, String lopHoc, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.email = email;
        String a=lopHoc.substring(1,3);
        khoa=2000+Integer.parseInt(a);
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.email;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<J05023,String> mp = new LinkedHashMap<>();
        List<J05023> list = new ArrayList<>();      
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String email=sc.nextLine();
            J05023 x = new J05023(ma,hoTen,lopHoc,email);
            list.add(x);
        }
        int q=sc.nextInt();
        while(q-->0){
            int te=sc.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA "+te+":");
            for(J05023 x : list){
                if(x.khoa==te){
                    System.out.println(x);
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
//2015