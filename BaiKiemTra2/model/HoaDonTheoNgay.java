/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vinhp
 */
public class HoaDonTheoNgay extends HoaDon {
    
    
    
    int soNgayThue;

    public HoaDonTheoNgay() {
    }

    public HoaDonTheoNgay(int soNgayThue, String ma, String ngayXuat, String hoVaTen) {
        super(ma, ngayXuat, hoVaTen);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    
    
    @Override
    public double getTienTT() {
        double tien;
        if (soNgayThue > 7){
            tien = 300 * 7 + (this.soNgayThue - 7) * 300 * 0.9;
        }
        else tien = 300 * 7;
        return tien;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\t$" + getTienTT();
    }
    
}
