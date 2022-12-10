/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Acer Gaming
 */
public class TaiLieu implements ITaiLieu,Serializable,Comparable<TaiLieu>{
    private String ma,tenNhaXB;
    private int soBanPH;
    
    public TaiLieu() {
    }

    public TaiLieu(String ma, String tenNhaXB, int soBanPH) {
        this.ma = ma;
        this.tenNhaXB = tenNhaXB;
        this.soBanPH = soBanPH;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNhaXB() {
        return tenNhaXB;
    }

    public void setTenNhaXB(String tenNhaXB) {
        this.tenNhaXB = tenNhaXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    
    
//    public int getNam(){
//        try {
//            return Integer.parseInt(ngayXuat.substring(ngayXuat.lastIndexOf("/")+1));
//        } catch (NumberFormatException e) {
//            Calendar c = Calendar.getInstance();
//            return c.get(Calendar.YEAR);
//        }
//    }

    @Override
    public String toString() {
        return ma+"\t"+tenNhaXB+"\t"+soBanPH;
    }

    @Override
    public int compareTo(TaiLieu o) {
        return soBanPH-o.getSoBanPH();
    }

    @Override
    public String getCode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
