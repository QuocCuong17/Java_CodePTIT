/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07047;

/**
 *
 * @author Đặng Cường
 */
public class KhachSan {
    private String kyHieu,tenPhong;
    private double donGiaNgay,phiPV;

    public KhachSan(String kyHieu, String tenPhong, double donGiaNgay, double phiPV) {
        this.kyHieu = kyHieu;
        this.tenPhong = tenPhong;
        this.donGiaNgay = donGiaNgay;
        this.phiPV = phiPV;
    }

    public String getKyHieu() {
        return kyHieu;
    }

    public void setKyHieu(String kyHieu) {
        this.kyHieu = kyHieu;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDonGiaNgay() {
        return donGiaNgay;
    }

    public void setDonGiaNgay(double donGiaNgay) {
        this.donGiaNgay = donGiaNgay;
    }

    public double getPhiPV() {
        return phiPV;
    }

    public void setPhiPV(double phiPV) {
        this.phiPV = phiPV;
    }
    
}
