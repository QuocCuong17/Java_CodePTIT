/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.*;

/**
 *
 * @author Đặng Cường
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CLB> dsCLB = new ArrayList<>();
        List<TranDau> dsTD = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            dsCLB.add(new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String ss = sc.nextLine();
            String arr[]=ss.split("\\s+");
            TranDau p=  new TranDau(arr[0], Integer.parseInt(arr[1]));
            for(CLB x : dsCLB){
                if(x.getMaCLB().equals(p.getmCLB())){
                    p.setC(x);
                }
            }
            dsTD.add(p);
        }
        Collections.sort(dsTD, new Comparator<TranDau>(){
            @Override
            public int compare(TranDau o1, TranDau o2) {
                if(o1.getDoanhThu()==o2.getDoanhThu()){
                    return o1.getTENDOI().compareTo(o2.getTENDOI());
                }
                else return o2.getDoanhThu()-o1.getDoanhThu();
            }
        });
        for(TranDau x : dsTD){
            for(CLB x1 : dsCLB){
                if(x.getmCLB().equals(x1.getMaCLB())){
                    System.out.println(x.getMaTD()+" "+x1.getTenCLB()+" "+x.getDoanhThu());
                }
            }
        }
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
IAC1 80000
EMU2 60000
*/