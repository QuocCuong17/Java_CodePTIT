/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Acer Gaming
 */
public class Sach extends TaiLieu implements Serializable,ITaiLieu{
    private String tenTG,tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenTG, String tenSach, int soTrang, String ma, String tenNhaXB, int soBanPH) {
        super(ma, tenNhaXB, soBanPH);
        this.tenTG = tenTG;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    @Override
    public String getCode() {
        String c=super.getMa().toUpperCase();
        StringTokenizer s = new StringTokenizer(tenSach.trim().toUpperCase());
        while(s.hasMoreTokens()){
            c+=s.nextToken().charAt(0);
        }
        return c;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t"+tenTG+"\t"+tenSach+"\t"+soTrang;
    }
}
