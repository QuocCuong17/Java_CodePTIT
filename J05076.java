
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
public class J05076 {
    private String maMH,tenMH,xepLoai;
    public J05076(String maMH, String tenMH, String xepLoai) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.xepLoai = xepLoai;
    }
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" ";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<J05076> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String xeploai=sc.nextLine();
            J05076 x = new J05076(ma,ten,xeploai);
            list.add(x);
        }   
        int q=Integer.parseInt(sc.nextLine());
        while(q-->0){
            String ma=sc.next();
            long slnhap=sc.nextLong();
            long dgnhap=sc.nextLong();
            long slxuat=sc.nextLong();
            System.out.print(ma+" ");
            for(J05076 x : list){
                long hi=0;
                if(x.maMH.equals(ma)){
                    System.out.print(x.tenMH+" ");
                    System.out.print(slnhap*dgnhap+" ");
                    if(x.xepLoai.equals("A")){
                        hi=Math.round((dgnhap*slxuat)*1.08);
                    }
                    else if(x.xepLoai.equals("B")){
                        hi=Math.round((dgnhap*slxuat)*1.05);
                    }
                    else if(x.xepLoai.equals("C")){
                        hi=Math.round((dgnhap*slxuat)*1.02);
                    }
                    System.out.println(hi);
                }
            }
        }
    }
}
//2
//A001
//Tu lanh
//A
//P002
//May giat
//B
//2
//A001 500 100 300
//P002 1000 1000 500