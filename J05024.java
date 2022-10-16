
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class J05024 {
    private String maSV,hoTen,lopHoc,email;
    private String nganh;
    public J05024(String maSV, String hoTen, String lopHoc, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.email = email;
        nganh=maSV.substring(3,7);
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.email;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<J05024,String> mp = new LinkedHashMap<>();
        List<J05024> list = new ArrayList<>();      
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String hoTen=sc.nextLine();
            String lopHoc=sc.nextLine();
            String email=sc.nextLine();
            J05024 x = new J05024(ma,hoTen,lopHoc,email);
            list.add(x);
        }
        int q=sc.nextInt();
        sc.nextLine();
        while(q-->0){
            String s=sc.nextLine();
            String in="";
            String in1="";
            if(s.equals("Ke toan")) {
                in="KE TOAN";
                in1="DCKT";
            }
            else if(s.equals("Cong nghe thong tin")) {
                in="CONG NGHE THONG TIN";
                in1="DCCN";
            }
            else if(s.equals("An toan thong tin")) {
                in="AN TOAN THONG TIN";
                in1="DCAT";
            }
            else if(s.equals("Vien thong")){
                in="VIEN THONG";
                in1="DCVT";
            }
            else {
                in="Dien tu";
                in1="DIEN TU";
            }
            System.out.println("DANH SACH SINH VIEN NGANH "+in+":");
            for(J05024 x : list){
                if(x.nganh.equals(in1)){
                    if(in1.equals("DCCN")||in1.equals("DCAT")){
                        if(x.lopHoc.charAt(0)!='E'){
                            System.out.println(x);
                        }
                    }
                    else System.out.println(x);
                }
            }
        }
    }
}
//7
//B16DCAT087
//Nguyen Trung Anh
//E16CNPM1
//sv11@stu.ptit.edu.vn
//B16DCAT081
//Dang Quoc Cuong
//B16ATBM1
//sv12@stu.ptit.edu.vn
//B16DCCN087
//Nguyen Trong Trung Anh
//E16CNPM1
//sv10@stu.ptit.edu.vn
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
//3
//Ke toan
//Cong nghe thong tin
//An toan thong tin