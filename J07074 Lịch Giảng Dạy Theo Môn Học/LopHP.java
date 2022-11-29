/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class LopHP {
    private String maNhom,maMon;
    private int ngayGiangDay,kipHoc;
    private String tenGV,phongHoc;
    private MonHoc M;
    public LopHP(int maNhom, String maMon, int ngayGiangDay, int kipHoc, String tenGV, String phongHoc) {
        this.maNhom = "HP"+String.format("%03d",maNhom);
        this.maMon = maMon;
        this.ngayGiangDay = ngayGiangDay;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(String maNhom) {
        this.maNhom = maNhom;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getNgayGiangDay() {
        return ngayGiangDay;
    }

    public void setNgayGiangDay(int ngayGiangDay) {
        this.ngayGiangDay = ngayGiangDay;
    }

    public int getKipHoc() {
        return kipHoc;
    }

    public void setKipHoc(int kipHoc) {
        this.kipHoc = kipHoc;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public MonHoc getM() {
        return M;
    }

    public void setM(MonHoc M) {
        this.M = M;
    }
    public String getTENMH() {
        return M.getTenMH();
    }
    @Override
    public String toString(){
        return maNhom+" "+ngayGiangDay+" "+kipHoc+" "+tenGV+" "+phongHoc;
    }
}
