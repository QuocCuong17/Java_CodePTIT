
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07055 {
    private String maSV,hoTen,trangThai;
    private double DLT,DTH,DT,tongDiem;
    public String chuanHoaTen(String s){
        StringBuilder sb = new StringBuilder("");
        String b='a'+" "+s;
        String arr[]=b.split("\\s+");
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
    public J07055(int maSV,String hoTen, double DLT, double DTH, double DT) {
        this.maSV = "SV"+String.format("%02d", maSV);
        this.hoTen = chuanHoaTen(hoTen);
        this.DLT = DLT;
        this.DTH = DTH;
        this.DT = DT;
        tongDiem=(DLT*0.25+DTH*0.35+DT*0.4);
        if(tongDiem>=8) trangThai="GIOI";
        else if(tongDiem>=6.5) trangThai="KHA";
        else if(tongDiem>=5) trangThai="TRUNG BINH";
        else trangThai="KEM";   
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+String.format("%.2f", tongDiem)+" "+this.trangThai;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("BANGDIEM.in"));
        int n=sc.nextInt();
        sc.nextLine();
        List<J07055> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            J07055 x = new J07055(i+1,ten,d1,d2,d3);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J07055>(){
            @Override
            public int compare(J07055 o1, J07055 o2) {
                if(o1.tongDiem>o2.tongDiem){
                    return -1;
                }
                else return 1;
            }
            
        });
        for(J07055 x : list ){
            System.out.println(x);
        }
    }
}
//2
// ha Thi kieu     anh
//
//7
//6
//7
//Pham    THI  HAO
//6
//7
//6