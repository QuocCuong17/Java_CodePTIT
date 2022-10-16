
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
public class J07081 {
    private String maSV,hoTen,SDT,email,TEN,HODEM;

    public J07081(String maSV, String hoTen, String SDT, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.email = email;
        String arr[]=hoTen.split("\\s+");
        TEN=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            HODEM+=arr[i].charAt(0);
            for(int j=1;j<arr[i].length();j++){
                HODEM+=arr[i].charAt(j);
            }
        }
        
    }
    @Override
    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.SDT+" "+this.email;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("SINHVIEN.in"));
        List<J07081> list = new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String sdt=sc.nextLine();
            String email=sc.nextLine();
            J07081 x= new J07081(ma,ten,sdt,email);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07081>(){
            @Override
            public int compare(J07081 o1, J07081 o2) {
                if(o1.hoTen.equals(o2.hoTen)){
                    return o1.maSV.compareTo(o2.maSV);
                }
                else if(o1.TEN.equals(o2.TEN)){
                    return o1.HODEM.compareTo(o2.HODEM);
                }
                else return o1.TEN.compareTo(o2.TEN);
            }
            
        });
        for(J07081 x: list){
            System.out.println(x);
        }
    }
}
//4
//B19DCCN999
//Ngo Quang Huy
//0976544443
//B19DCCN999@stu.ptit.edu.vn
//B19DCCN998
//Nguyen Le Tu
//0345678999
//B19DCCN998@stu.ptit.edu.vn
//B19DCCN997
//Nguyen Manh Cuong
//0987654321
//B19DCCN997@stu.ptit.edu.vn
//B19DCCN912
//Ngo Duc Huy
//0976544455
//B19DCCN912@stu.ptit.edu.vn