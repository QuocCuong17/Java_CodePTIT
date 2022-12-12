/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06001;

/**
 *
 * @author Đặng Cường
 */
public class HoaDon {
    private String values,maHD,loaiSP,mHD,ma,maLoai;
    private SanPham S;
    private long soLuong,giamGia,phaiTra,thanhTien;
    public HoaDon(int maHD,String values) {
        
        this.values = values;
        String arr[]=values.split("\\s+");
        ma=arr[0];
        soLuong=Long.parseLong(arr[1]);
        maLoai=ma.substring(0,2);
        loaiSP=ma.substring(2,3);
        this.maHD = ma+String.format("-%03d",maHD );
    }

    public long getThanhTien() {
        long s=0;
        if(loaiSP.equals("1")){
            s += soLuong*S.getDonGiaL1();
        }
        else if(loaiSP.contains("2")){
            s += soLuong*S.getDonGiaL2();
        }
        return s;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public SanPham getS() {
        return S;
    }

    public void setS(SanPham S) {
        this.S = S;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public String getmHD() {
        return mHD;
    }

    public void setmHD(String mHD) {
        this.mHD = mHD;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiamGia() {
        long s=0;
        if(soLuong>=150){
            s+=getThanhTien()*50/100;
        }
        else if(soLuong>=100){
            s+=getThanhTien()*30/100;
        }
        else if(soLuong>=50){
            s+=getThanhTien()*15/100;
        }
        else s=0;
        return s;
    }

    public void setGiamGia(long giamGia) {
        this.giamGia = giamGia;
    }

    public long getPhaiTra() {
        return getThanhTien()-getGiamGia();
    }

    public void setPhaiTra(long phaiTra) {
        this.phaiTra = phaiTra;
    }
    
}
