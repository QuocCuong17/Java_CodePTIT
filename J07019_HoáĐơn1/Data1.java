/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Data1 {
    private String maLoai,tenSanPham ;
    private long donGia1,donGia2;

    public Data1(String maLoai, String tenSanPham, long donGia1, long donGia2) {
        this.maLoai = maLoai;
        this.tenSanPham = tenSanPham;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public long getDonGia1() {
        return donGia1;
    }

    public void setDonGia1(long donGia1) {
        this.donGia1 = donGia1;
    }

    public long getDonGia2() {
        return donGia2;
    }

    public void setDonGia2(long donGia2) {
        this.donGia2 = donGia2;
    }
    
}
