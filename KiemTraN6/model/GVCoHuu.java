/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Acer Gaming
 */
public class GVCoHuu extends GiangVien implements Serializable,IGiangVien{
    private int soGioDinhMuc;

    public GVCoHuu() {
    }

    public GVCoHuu(int soGioDinhMuc, String ma, String hoVaTen, int soGioDayTrongThang) {
        super(ma, hoVaTen, soGioDayTrongThang);
        this.soGioDinhMuc = soGioDinhMuc;
    }

    public int getSoGioDinhMuc() {
        return soGioDinhMuc;
    }

    public void setSoGioDinhMuc(int soGioDinhMuc) {
        this.soGioDinhMuc = soGioDinhMuc;
    }   
    
    @Override
    public double getLuong() {
        return (soGioDinhMuc*140)+(getSoGioDayTrongThang()-soGioDinhMuc)*50;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\t"+getLuong();
    }
}
