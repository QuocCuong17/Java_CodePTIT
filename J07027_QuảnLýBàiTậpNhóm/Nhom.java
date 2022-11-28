/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Nhom {
    private String mSV ,mN;
    private BaiTap B;
    private SinhVien S;

    public Nhom(String mSV, String mN) {
        this.mSV = mSV;
        this.mN = mN;
    }

    public String getmSV() {
        return mSV;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public String getmN() {
        return mN;
    }

    public void setmN(String mN) {
        this.mN = mN;
    }

    public BaiTap getB() {
        return B;
    }

    public void setB(BaiTap B) {
        this.B = B;
    }

    public SinhVien getS() {
        return S;
    }

    public void setS(SinhVien S) {
        this.S = S;
    }
    @Override
    public String toString(){
        return S.getMaSV()+" "+S.getHoTen()+" "+S.getSdt()+" "+mN+" "+B.getTenBT();
    }
}
