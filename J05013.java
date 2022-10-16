
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J05013 {
    private String maTS,hoTen,ketQua;
    private double diemLT,diemTH,diemTB;

    public J05013(int maTS, String hoTen, double diemLT, double diemTH) {
        this.maTS = "TS"+String.format("%02d", maTS);
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        if(diemLT>10){
            diemLT/=10;
        }
        if(diemTH>10){
            diemTH/=10;
        }
        diemTB=(diemTH+diemLT)/2;
        if(diemTB>9.5) ketQua="XUAT SAC";
        else if(diemTB>=8) ketQua="DAT";
        else if(diemTB>5) ketQua="CAN NHAC";
        else ketQua="TRUOT";
    }
    public String toString(){
        return this.maTS+" "+this.hoTen+" "+String.format("%.2f", diemTB)+" "+this.ketQua;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<J05013> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            J05013 x = new J05013(i+1,ten,d1,d2);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J05013>(){
            @Override
            public int compare(J05013 o1, J05013 o2) {
                if(o1.diemTB>o2.diemTB){
                    return -1;
                }
                else return 1;
            }
            
        });
        for(J05013 x : list ){
            System.out.println(x);
        }
    }
}
//3
//Nguyen Thai Binh
//45
//75
//Le Cong Hoa
//4
//4.5
//Phan Van Duc
//56
//56