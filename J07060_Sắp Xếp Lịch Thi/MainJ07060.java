
import java.util.*;
import java.io.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class MainJ07060 {
    public static void main(String[] args) throws FileNotFoundException {
        List<MonHoc> dsMT = new ArrayList<>();
        List<CaThi> dsCT = new ArrayList<>();
        List<LichThi> dsLT = new ArrayList<>();
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            dsMT.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("CATHI.in"));
        t = Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            dsCT.add(new CaThi(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc = new Scanner(new File("LICHTHI.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            LichThi p = new  LichThi(sc.next(), sc.next(), sc.next(),sc.next());
            for(MonHoc x : dsMT){
                if(x.getMaMH().equals(p.getmMH())){
                    p.setM(x);
                }
            }
            for(CaThi x : dsCT){
                if(x.getMaCT().equals(p.getmCT())){
                    p.setC(x);
                }
            }
            dsLT.add(p);
        }
        Collections.sort(dsLT,new Comparator<LichThi>(){
            @Override
            public int compare(LichThi o1, LichThi o2) {
                if(o1.getNgayThi().equals(o2.getNgayThi())){
                    return o1.getGioThi().compareTo(o2.getGioThi());
                }
                else if(o1.getNgayThi().equals(o2.getNgayThi())&&o1.getGioThi().equals(o2.getGioThi())){
                    return o1.getMaCaThi().compareTo(o2.getMaCaThi());
                }
                else return o1.getNgayThi().compareTo(o2.getNgayThi());
            }
            
        });
        for(LichThi x : dsLT){
            System.out.println(x);
        }
    }
}
