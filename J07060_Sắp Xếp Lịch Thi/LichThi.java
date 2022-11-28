/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class LichThi {
    private String mCT,mMH,mNhom;
    private String soSV;
    private MonHoc M;
    private CaThi C;

    public LichThi(String mCT, String mMH, String mNhom, String soSV) {
        this.mCT = mCT;
        this.mMH = mMH;
        this.mNhom = mNhom;
        this.soSV = soSV;
    }

    public String getmCT() {
        return mCT;
    }

    public void setmCT(String mCT) {
        this.mCT = mCT;
    }

    public String getmMH() {
        return mMH;
    }

    public void setmMH(String mMH) {
        this.mMH = mMH;
    }

    public String getmNhom() {
        return mNhom;
    }

    public void setmNhom(String mNhom) {
        this.mNhom = mNhom;
    }

    public String getSoSV() {
        return soSV;
    }

    public void setSoSV(String soSV) {
        this.soSV = soSV;
    }

    public MonHoc getM() {
        return M;
    }

    public void setM(MonHoc m) {
        M = m;
    }

    public CaThi getC() {
        return C;
    }

    public void setC(CaThi c) {
        C = c;
    }
    public String getMaMonHoc(){
        return M.getMaMH();
    }
    public String getMaCaThi(){
        return C.getMaCT();
    }
    public String getNgayThi(){
        return C.getNgayThi();
    }
    public String getPhongThi(){
        return C.getPhongThi();
    }
    public String getTenMonHoc(){
        return M.getTenMH();
    }
    public String getGioThi(){
        return C.getGioThi();
    }
    @Override
    public String toString(){
        return C.getNgayThi()+" "+C.getGioThi()+" "+C.getPhongThi()+" "+M.getTenMH()+" "+mNhom+" "+soSV;
    }
}
