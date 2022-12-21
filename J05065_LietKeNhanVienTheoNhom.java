/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Đặng Cường
 */
public class J05065 {
    private String values,hoTen,chucVu,heSo,soHieu;
    
    public J05065(String values, String hoTen) {
        this.values = values;
        this.hoTen = hoTen;
        chucVu=values.substring(0,2);
        heSo=values.substring(2,4);
        soHieu=values.substring(4);
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<J05065> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int gd=0,tp=0,pp=0;
        while(n-->0){ 
            String a = sc. next();
            String b = sc.nextLine().trim();
            
            J05065 x = new J05065(a,b);
            if(x.values.substring(0,2).equals("GD")){
                if(gd<1){
                    gd++;
                }
                else {
                    x.setChucVu("NV");
                }
            }
            else if(x.values.substring(0,2).equals("TP")){
                if(tp<3){
                    tp++;
                }
                else {
                    x.setChucVu("NV");
                }
            }
            else if(x.values.substring(0,2).equals("PP")){
                if(pp<3){
                    pp++;
                }
                else {
                    x.setChucVu("NV");
                }
            }
            else x.setChucVu("NV");
            l.add(x);
        }
        Collections.sort(l, new Comparator<J05065>(){
            @Override
            public int compare(J05065 o1, J05065 o2) {
                if(o1.heSo.equals(o2.heSo)){
                    return o1.soHieu.compareTo(o2.soHieu);
                }
                else return o2.heSo.compareTo(o1.heSo);
            }
            
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String ss = sc.next().toLowerCase();
            for(J05065 x : l){
                if(x.chucVu.toLowerCase().equals(ss)){
                    System.out.println(x.hoTen+" "+x.chucVu+" "+x.soHieu+" "+x.heSo);
                }
            }
            System.out.println("");
        }
    }
}
/*
7
GD08001 Nguyen Kim Loan
TP05002  Hoang Thanh Tuan
GD05002  Hoang Thanh Tuan
TP05001 Tran Binh Nguyen
PP06002 Phan Trung Tuan
PP06001 Tran Quoc Huy
NV04003 Vo Van Lan
2
GD
NV
*/