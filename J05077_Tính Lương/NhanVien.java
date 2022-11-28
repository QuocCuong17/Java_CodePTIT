
import java.util.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class NhanVien {
    private String maNV ,tenNV,maP,nhom;
    private int luongCB,ngayCong,nam;
    private PhongBan P;

    public NhanVien(String maNV, String tenNV, int luongCB, int ngayCong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        maP=maNV.substring(3,5);
        nhom=maNV.substring(0,1);
        nam=Integer.parseInt(maNV.substring(1,3));
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }

    public PhongBan getP() {
        return P;
    }

    public void setP(PhongBan P) {
        this.P = P;
    }
    public long getHSN() {
        int heSoNhan=0;
        if(nhom.equals("A")){
            if(nam>=16){
                heSoNhan+=20;
            }
            else if(nam>=9){
                heSoNhan+=14;
            }
            else if(nam>=4){
                heSoNhan+=12;
            }
            else if(nam>=1){
                heSoNhan+=10;
            }
        }
        else if(nhom.equals("B")){
            if(nam>=16){
                heSoNhan+=16;
            }
            else if(nam>=9){
                heSoNhan+=13;
            }
            else if(nam>=4){
                heSoNhan+=11;
            }
            else if(nam>=1){
                heSoNhan+=10;
            }
        }
        else if(nhom.equals("C")){
            if(nam>=16){
                heSoNhan+=14;
            }
            else if(nam>=9){
                heSoNhan+=12;
            }
            else if(nam>=4){
                heSoNhan+=10;
            }
            else if(nam>=1){
                heSoNhan+=9;
            }
        }
        else if(nhom.equals("D")){
            if(nam>=16){
                heSoNhan+=13;
            }
            else if(nam>=9){
                heSoNhan+=11;
            }
            else if(nam>=4){
                heSoNhan+=9;
            }
            else if(nam>=1){
                heSoNhan+=8;
            }
        }
        return heSoNhan;
    }
    public long getLuongThang(){
        return 1l*getHSN()*luongCB*ngayCong*1000;
    }
    @Override
    public String toString(){
        return maNV+" "+tenNV+" "+P.getTenPhong()+" "+getLuongThang();
    }
    public static void main(String[] args) {
        List<NhanVien> dsNV = new ArrayList<>();
        List<PhongBan> dsPB = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            dsPB.add(new PhongBan(sc.next(),sc.nextLine()));
        }
        t=Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            NhanVien p = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            for(PhongBan x : dsPB){
                if(x.getMaPhong().equals(p.maP)){
                    p.setP(x);
                }
            }
            dsNV.add(p);
        }
        for(NhanVien x : dsNV){
            System.out.println(x);
        }
    }
    
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24