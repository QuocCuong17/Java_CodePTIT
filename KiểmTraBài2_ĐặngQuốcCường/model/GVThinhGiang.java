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
public class GVThinhGiang extends GiangVien implements Serializable,IGiangVien{
    private int heSo;

    public GVThinhGiang() {
    }

    public GVThinhGiang(int heSo, String ma, String hoVaTen, int soGioDayTrongThang) {
        super(ma, hoVaTen, soGioDayTrongThang);
        this.heSo = heSo;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    
    
    @Override
    public double getLuong() {
        return getSoGioDayTrongThang()*heSo*100;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+getLuong();
    }
}
