
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
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            dsMH.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
         sc = new Scanner(new File("LICHGD.in"));
        t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            String ma=sc.nextLine();
            int a=sc.nextInt();
            int b=sc.nextInt();
            sc.nextLine();
            String ten=sc.nextLine();
            String ph =sc.nextLine();
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
        String s=sc.nextLine();
        for(LopHP x : dsHP){
            if(s.equals(x.getMaMon())){
                System.out.println("LICH GIANG DAY MON "+x.getTENMH()+":");
                break;
            }
        }
        for(LopHP x :dsHP){
            if(s.equals(x.getMaMon())){
                System.out.println(x);
            }
        }
    }
}
//2
//INT1155
//Tin hoc co so 2
//2
//INT13162
//Lap trinh voi Python
//3
//4
//INT13162
//5
//1
//Nguyen Hoang Anh
//102-A2
//INT1155
//3
//1
//Nguyen Dinh Hien
//201A-A3
//INT1155
//4
//1
//Nguyen Quy Sy
//201A-A3
//INT1155
//5
//1
//Tran Quy Nam
//201A-A3
//INT1155