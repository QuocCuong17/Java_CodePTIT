
import java.util.ArrayList;
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
public class J05075_ĐIỂMDANH2 {
    private String maSV,hoTen,lopHoc;
    private int diem;
    public J05075_ĐIỂMDANH2(String maSV, String hoTen, String lopHoc,int diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.diem=diem;
    }

    public J05075_ĐIỂMDANH2() {
        diem=10;
    }

    public void setDiem(String t) {
        for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == 'v')
                    diem -= 2;
                if (t.charAt(i) == 'm')
                    diem -= 1;
                if(diem<=0){
                    diem=0;
                }
            }
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.lopHoc+" "+this.diem+" ";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int m=n;
        List<J05075_ĐIỂMDANH2> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            J05075_ĐIỂMDANH2 x = new J05075_ĐIỂMDANH2(ma,ten,lop,10);
            list.add(x);
        }
        for(int i=0;i<m;i++){
            String sma=sc.next();
            String sdiemdanh=sc.next();
            for(J05075_ĐIỂMDANH2 x : list){
                if(x.maSV.equals(sma)){
                    x.setDiem(sdiemdanh);
                    break;
                }
            }
        }
        String hello=sc.next();
        for(J05075_ĐIỂMDANH2 x : list){
            if(hello.equals(x.lopHoc)){
                System.out.print(x);
                if(x.diem==0){
                    System.out.print("KDDK");
                }

                System.out.println("");
            }
        }
    }
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm
//D19CQAT02-B
