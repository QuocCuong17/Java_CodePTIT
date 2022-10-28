/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vinhp
 */
public class HoaDonTheoGio extends HoaDon{

    
    private int soGioThue;

    public HoaDonTheoGio() {
    }

    public HoaDonTheoGio(int soGioThue, String ma, String ngayXuat, String hoVaTen) {
        super(ma, ngayXuat, hoVaTen);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    
    
    @Override
    public double getTienTT() {
        double tien;
        if (soGioThue < 5){
            tien = soGioThue * 50;
        }
        else tien = (5 * 50) + (soGioThue - 5) * 50 * 0.7;
        return tien;
    }
    @Override
    public String toString(){
        return super.toString() + "\t$" + getTienTT();
    }
}
