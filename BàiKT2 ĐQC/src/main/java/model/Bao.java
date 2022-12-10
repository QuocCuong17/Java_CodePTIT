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
public class Bao extends TaiLieu implements ITaiLieu,Serializable{
    private String ngayPH;

    public Bao() {
    }

    public Bao(String ngayPH, String ma, String tenNhaXB, int soBanPH) {
        super(ma, tenNhaXB, soBanPH);
        this.ngayPH = ngayPH;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }
    
    public int getNam(){
        try {
            return Integer.parseInt(ngayPH.substring(ngayPH.lastIndexOf("/")+1)); 
        } catch (NumberFormatException e) {
            Calendar c =Calendar.getInstance();
            return c.get(Calendar.YEAR);
        }
           
    }
    @Override
    public String getCode() {
        String c=super.getMa().toUpperCase();
        c+=getNam();
        return c;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t"+ngayPH;
    }
}
