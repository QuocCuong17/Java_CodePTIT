/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class ThucTap {
    private String mSV,mDN;
    private DoanhNghiep D;
    private SinhVien S;

    public ThucTap(String mSV, String mDN) {
        this.mSV = mSV;
        this.mDN = mDN;
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public String getmDN() {
        return mDN;
    }

    public void setmDN(String mDN) {
        this.mDN = mDN;
    }

    public DoanhNghiep getD() {
        return D;
    }

    public void setD(DoanhNghiep D) {
        this.D = D;
    }

    public SinhVien getS() {
        return S;
    }

    public void setS(SinhVien S) {
        this.S = S;
    }
    
}
