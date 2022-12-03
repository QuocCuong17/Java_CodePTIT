/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class NhiemVu {
    private String mSV,mDT;
    private SinhVien S;
    private DeTai D;

    public NhiemVu(String mSV, String mDT) {
        this.mSV = mSV;
        this.mDT = mDT;
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
    public String getTENDT() {
        return D.getTenDT();
    }
    @Override
    public String toString(){
        return S.getMaSV()+" "+S.getHoTen()+" "+S.getSdt()+" "+S.getEmail()+" "+D.getTenGV()+" "+D.getTenDT();
    }
}
