/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class DeTai implements Comparable<DeTai>{
    private String maDT,tenGV,tenDT;

    public DeTai(int maDT, String tenGV, String tenDT) {
        this.maDT = "DT"+String.format("%03d", maDT);
        this.tenGV = tenGV;
        this.tenDT = tenDT;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }
    public int compareTo(DeTai o){
        return this.getTenDT().compareTo(o.getTenDT());
    }
}
