/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J06001;

/**
 *
 * @author Đặng Cường
 */
public class SanPham {
    private String maSP,tenSP;
    private long donGiaL1,donGiaL2;

    public SanPham(String maSP, String tenSP, long donGiaL1, long donGiaL2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGiaL1 = donGiaL1;
        this.donGiaL2 = donGiaL2;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public long getDonGiaL1() {
        return donGiaL1;
    }

    public void setDonGiaL1(long donGiaL1) {
        this.donGiaL1 = donGiaL1;
    }

    public long getDonGiaL2() {
        return donGiaL2;
    }

    public void setDonGiaL2(long donGiaL2) {
        this.donGiaL2 = donGiaL2;
    }
    
}
