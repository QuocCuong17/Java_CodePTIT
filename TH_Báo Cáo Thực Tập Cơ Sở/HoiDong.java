/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class HoiDong {
    private String mHD,mSV,mDT,tenHD;
    private SinhVien S;
    private DeTai D;

    public HoiDong( String mSV, String mDT,String mHD) {
        this.mHD = mHD;
        this.mSV = mSV;
        this.mDT = mDT;
    }

    public String getmHD() {
        return mHD;
    }
    public int getTenHD() {
        return Integer.parseInt(mHD.substring(2,3));
    }
    public void setmHD(String mHD) {
        this.mHD = mHD;
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public String getmDT() {
        return mDT;
    }

    public void setmDT(String mDT) {
        this.mDT = mDT;
    }

    public SinhVien getS() {
        return S;
    }

    public void setS(SinhVien S) {
        this.S = S;
    }

    public DeTai getD() {
        return D;
    }

    public void setD(DeTai D) {
        this.D = D;
    }
    
    public String getMSV() {
        return S.getHoTen();
    }
}
