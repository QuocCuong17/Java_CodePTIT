

import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class J05019 {
    private String ma,tenTram,batDau,ketThuc;
    private int luongMua,thoiGian;
    private double luongMuaTB;
    
    public J05019(int ma, String tenTram, String batDau, String ketThuc, int luongMua) {
        this.ma = "T"+String.format("%02d",ma);
        this.tenTram = tenTram;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.luongMua = luongMua;
    }
    
    public void setLuongMua(int luongMua) {
        this.luongMua += luongMua;
    }
    
    public String getTenTram() {
        return tenTram;
    }

    public void setThoiGian(String batDau, String ketThuc) {
        String a[]=batDau.split(":");
        String b[]=ketThuc.split(":");
        this.thoiGian += (Integer.parseInt(b[0])*60+Integer.parseInt(b[1])-Integer.parseInt(a[0])*60-Integer.parseInt(a[1]));
    }

    public void setLuongMuaTB() {
        double time =(double)thoiGian/60;
        this.luongMuaTB = luongMua/time;
    }
    
    @Override
    public String toString(){
        return ma+" "+tenTram+" "+String.format("%.2f", luongMuaTB);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> se = new TreeSet<>();
        List<J05019> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String tenTram = sc.nextLine();
            String timeStart = sc.nextLine();
            String timeEnd = sc.nextLine();
            int luongMua = Integer.parseInt(sc.nextLine());
            if(!se.contains(tenTram)){
                se.add(tenTram);
                list.add(new J05019(i+1, tenTram, timeStart, timeEnd, luongMua));
                list.get(list.size()-1).setThoiGian(timeStart, timeEnd);
            }
            else {
                for(J05019 x : list){
                    if(x.getTenTram().equals(tenTram)){
                        x.setLuongMua(luongMua);
                        x.setThoiGian(timeStart, timeEnd);
                    }
                }
            }
        }
        for(J05019 x : list){
            x.setLuongMuaTB();
            System.out.println(x);
        }
    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
*/