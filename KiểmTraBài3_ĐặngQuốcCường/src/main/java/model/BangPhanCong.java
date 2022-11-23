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
public class BangPhanCong implements Serializable{
    private CauThu cauThu;
    private ViTri viTri;
    private String ngayChoi;

    public BangPhanCong() {
    }

    public BangPhanCong(CauThu cauThu, ViTri viTri, String ngayChoi) {
        this.cauThu = cauThu;
        this.viTri = viTri;
        this.ngayChoi = ngayChoi;
    }

    public CauThu getCauThu() {
        return cauThu;
    }

    public void setCauThu(CauThu cauThu) {
        this.cauThu = cauThu;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public String getNgayChoi() {
        return ngayChoi;
    }

    public void setNgayChoi(String ngayChoi) {
        this.ngayChoi = ngayChoi;
    }

    
    
    public String vietTK(){
        return cauThu.getMa()+":"+cauThu.getHoTen();
    }
    public int getThuNhap(){
        return cauThu.getMucLuong()*viTri.getHeSo();
    }
//    public int getSoNgay(int soNgay) {
//        
//    }
    public Object[] toObject(){
        return new Object[]{
          cauThu.getMa(),cauThu.getHoTen(),cauThu.getMucLuong(),
            viTri.getMa(),ngayChoi
        };
    }
}
