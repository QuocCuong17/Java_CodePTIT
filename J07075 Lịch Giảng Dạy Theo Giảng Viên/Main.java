
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<MonHoc> dsMH = new ArrayList<>();
        List<LopHP> dsHP = new ArrayList<>();
        Scanner sc = new Scanner(new File("MONHOC.in"));
        //Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-->0){
            dsMH.add(new MonHoc(sc.nextLine().trim(), sc.nextLine().trim(), Integer.parseInt(sc.nextLine().trim())));
        }
        sc = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(sc.nextLine().trim());
        for(int i=0;i<t;i++){
            String ma=sc.nextLine().trim();
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            String ten=sc.nextLine().trim();
            String ph =sc.nextLine().trim();
            LopHP p = new LopHP(i+1,ma,a, b, ten, ph);
            
            for(MonHoc x : dsMH){
                if(x.getMaMH().equals(p.getMaMon())){
                    p.setM(x);
                }
            }
            dsHP.add(p);
        }
        Collections.sort(dsHP,new Comparator<LopHP>(){
            @Override
            public int compare(LopHP o1, LopHP o2) {
                if(o1.getNgayGiangDay()==o2.getNgayGiangDay() && o1.getKipHoc()!=o2.getKipHoc()){
                    return o1.getKipHoc()-o2.getKipHoc();
                }
                else if(o1.getNgayGiangDay()!=o2.getNgayGiangDay() ){
                    return o1.getNgayGiangDay()-o2.getNgayGiangDay();
                }
                else return o1.getTenGV().compareTo(o2.getTenGV());
            }
            
        });
        String s=sc.nextLine().trim();
        System.out.println("LICH GIANG DAY GIANG VIEN "+s+":");
        for(LopHP x :dsHP){
            if(x.getTenGV().equals(s)){
                for(MonHoc x1 : dsMH){
                    if(x.getMaMon().equals(x1.getMaMH()))    
                        System.out.println(x.getMaNhom()+" "+x.getTENMH()+" "+x.getNgayGiangDay()+" "+x.getKipHoc()+" "+x.getPhongHoc());
                }
            }
        }
//        for(LopHP x : dsHP){
//            System.out.println(x.getTenGV());
//        }
    }
}
//2
//INT1449 
//Phat trien ung dung cho cac thiet bi di dong
//3
//INT13162
//Lap trinh voi Python
//3
//3
//INT13162
//5
//4
//Nguyen Trong Khanh
//102-A2
//INT1449
//2
//2
//Nguyen Hoang Anh
//105-A2
//INT13162
//5
//1
//Nguyen Hoang Anh
//102-A2
//Nguyen Hoang Anh