/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05072;

import java.util.*;

/**
 *
 * @author Đặng Cường
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CuocGoi> dsCG = new ArrayList<>();
        List<ThanhPho> dsTP = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            dsTP.add(new ThanhPho(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String ss = sc.nextLine();
            String arr[] = ss.split("\\s+");
            CuocGoi p = new CuocGoi(arr[0], arr[1], arr[2]);
            String a = arr[0];
            if (a.charAt(0) == '0') {
                for (ThanhPho x : dsTP) {
                    if(x.getMaTP().equals(p.getMaCG())){
                        p.setT(x);
                    }
                }
            }
            dsCG.add(p);
        }
        Collections.sort(dsCG,new Comparator<CuocGoi>(){
            @Override
            public int compare(CuocGoi o1, CuocGoi o2) {
                return o2.getTien()-o1.getTien();
            }
            
        });
        for(CuocGoi x : dsCG){
            if(x.getThueBao().charAt(0)=='0'){
                for(ThanhPho x1 : dsTP){
                    if(x1.getMaTP().equals(x.getMaCG())){
                        System.out.println(x.getThueBao()+" "+x1.getTenTP()+" "+x.getTG()+" "+x.getTien());
                    }
                }
            }
            else {
                System.out.println(x.getThueBao()+" Noi mang "+x.getTG()+" "+x.getTien());
            }
        }
    }
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
*/