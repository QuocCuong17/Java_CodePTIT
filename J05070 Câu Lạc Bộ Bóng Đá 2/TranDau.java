/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Đặng Cường
 */
public class TranDau {
    private CLB C;
    private String maTD,mCLB;
    private int soCDV;
    
    public TranDau(String maTD, int soCDV) {
        this.maTD = maTD;
        this.soCDV = soCDV;
        mCLB=maTD.substring(1,3);
    }

    public CLB getC() {
        return C;
    }

    public void setC(CLB C) {
        this.C = C;
    }

    public String getMaTD() {
        return maTD;
    }

    public void setMaTD(String maTD) {
        this.maTD = maTD;
    }

    public String getmCLB() {
        return mCLB;
    }

    public void setmCLB(String mCLB) {
        this.mCLB = mCLB;
    }

    public int getSoCDV() {
        return soCDV;
    }

    public void setSoCDV(int soCDV) {
        this.soCDV = soCDV;
    }
    
    public int getDoanhThu() {
        return soCDV*C.getGiaVe();
    }
    public String getTENDOI() {
        return C.getTenCLB();
    }
}
