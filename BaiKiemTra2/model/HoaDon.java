/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author vinhp
 */
public class HoaDon implements IHoaDon, Serializable{
    private String ma, ngayXuat, hoVaTen;
    double tienThanhToan;

    public HoaDon() {
    }

    public HoaDon(String ma, String ngayXuat, String hoVaTen) {
        this.ma = ma;
        this.ngayXuat = ngayXuat;
        this.hoVaTen = hoVaTen;
        this.tienThanhToan = 0;
    }
    
    public int getNam(){
        try {
            return Integer.parseInt(ngayXuat.substring(ngayXuat.lastIndexOf("/") + 1));
            
        } catch (NumberFormatException e){
            Calendar c = Calendar.getInstance();
            return c.get(Calendar.YEAR);
        }
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(double tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }
    
    @Override
    public String toString(){
        return ma + "\t" + ngayXuat + "\t" + hoVaTen;
    }

    @Override
    public double getTienTT() {
        return 0;
    }
    
}
