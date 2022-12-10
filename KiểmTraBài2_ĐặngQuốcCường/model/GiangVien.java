/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;


/**
 *
 * @author Acer Gaming
 */
import java.io.Serializable;
import java.util.Calendar;

public class GiangVien implements Serializable,IGiangVien{
    private String ma,hoVaTen;
    private int soGioDayTrongThang;
   // private double luong;

    public GiangVien() {
    }

    public GiangVien(String ma, String hoVaTen, int soGioDayTrongThang) {
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.soGioDayTrongThang = soGioDayTrongThang;
        
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getSoGioDayTrongThang() {
        return soGioDayTrongThang;
    }

    public void setSoGioDayTrongThang(int soGioDayTrongThang) {
        this.soGioDayTrongThang = soGioDayTrongThang;
    }
    
    

//    @Override
//    public double getLuong() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    @Override
    public String toString(){
        return ma+"\t"+hoVaTen+"\t"+soGioDayTrongThang;
    }

    @Override
    public double getLuong() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
