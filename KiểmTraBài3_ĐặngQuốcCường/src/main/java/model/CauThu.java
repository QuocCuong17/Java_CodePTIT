/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Đặng Cường
 */
public class CauThu implements Serializable{
    private int ma;
    private String hoTen,tuoi,bangCap;
    private int mucLuong;

    public CauThu() {
    }

    public CauThu(int ma, String hoTen, String tuoi, String bangCap, int mucLuong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.bangCap = bangCap;
        this.mucLuong = mucLuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public int getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(int mucLuong) {
        this.mucLuong = mucLuong;
    }
    
    public Object[] toObject(){
        return new Object[]{
          ma,hoTen,tuoi,bangCap,mucLuong
        };
    }
}  
