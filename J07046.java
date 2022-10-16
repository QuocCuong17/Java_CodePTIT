import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07046 {
    private String maKH,hoTen,maPhong;
    private Date date1,date2;
    private long soNgayLuuTru;

    public J07046(int maKH, String hoTen, String maPhong, Date date1, Date date2) {
        this.maKH = "KH"+String.format("%02d", maKH);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.date1 = date1;
        this.date2 = date2;
        long a=date2.getTime();
        long b=date1.getTime();
        soNgayLuuTru=(long)(a-b)/86400000;
    }
    @Override
    public String toString(){
        return this.maKH+" "+this.hoTen+" "+this.maPhong+" "+this.soNgayLuuTru;
    }
    public static void main(String[] args) throws ParseException , FileNotFoundException  {
        Scanner sc= new Scanner(new File("KHACH.IN"));
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        List<J07046> list = new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String ten=sc.nextLine();
            String ma=sc.nextLine();
            Date date1=df.parse(sc.nextLine());
            Date date2=df.parse(sc.nextLine());
            J07046 x = new J07046(i+1,ten,ma,date1,date2);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J07046>(){
            @Override
            public int compare(J07046 o1, J07046 o2) {
                if(o1.soNgayLuuTru>o2.soNgayLuuTru){
                    return -1;
                }
                else return 1;
            }
            
        });
        for(J07046 x: list){
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Hoang
//55B1
//01/01/2021
//05/01/2021
//Nguyen Trung Dung
//04C6
//01/01/2021
//10/01/2021