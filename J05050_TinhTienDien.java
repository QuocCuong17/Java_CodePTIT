/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class OOPS {
    private String maKH,loaiSD;
    private long chiSoCu,chiSoMoi,heSo,thanhTien;
    private double phuTroi,tongTienPhaiTra;

    public OOPS(int maKH, String loaiSD, long chiSoCu, long chiSoMoi) {
        this.maKH = "KH"+String.format("%02d", maKH);
        this.loaiSD = loaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        if(loaiSD.equals("KD")) heSo=3;
        else if(loaiSD.equals("NN")) heSo=5;
        else if(loaiSD.equals("TT")) heSo=4;
        else if(loaiSD.equals("CN")) heSo=2;
        thanhTien=(chiSoMoi-chiSoCu)*heSo*550;
        if(chiSoMoi-chiSoCu > 100){
            phuTroi=thanhTien;
        }
        else if(chiSoMoi-chiSoCu>=50){
            phuTroi=thanhTien/100.0*35;
        }
        
        else phuTroi=0;
        tongTienPhaiTra=phuTroi+thanhTien;
    }
    @Override
    public String toString(){
        return this.maKH+" "+this.heSo+" "+this.thanhTien+" "+String.format("%.0f", phuTroi)+" "+String.format("%.0f", tongTienPhaiTra);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            sc.nextLine();
            String loaiSD=sc.nextLine();
            long chiSoCu = sc.nextLong();
            long chiSoMoi=sc.nextLong();
            OOPS x = new OOPS(i+1, loaiSD,  chiSoCu,  chiSoMoi);
            System.out.println(x.toString());
        }
    }
}

//KD
//400
//555
//NN
//58
//400
//CN
//150
//700
