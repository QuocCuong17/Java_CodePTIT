/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class GIOCHUAN {
    private GiangVien G;
    private MonHoc M;
    private String mGV,mMH;
    private double gio;

    public GIOCHUAN(String mGV, String mMH, double gio) {
        this.mGV = mGV;
        this.mMH = mMH;
        this.gio = gio;
    }
    public double getTongGio(){
        double a=0;
        a+=gio;
        return a;
    }
    public GiangVien getG() {
        return G;
    }

    public void setG(GiangVien G) {
        this.G = G;
    }

    public MonHoc getM() {
        return M;
    }

    public void setM(MonHoc M) {
        this.M = M;
    }

    public String getmGV() {
        return mGV;
    }

    public void setmGV(String mGV) {
        this.mGV = mGV;
    }

    public String getmMH() {
        return mMH;
    }

    public void setmMH(String mMH) {
        this.mMH = mMH;
    }

    public double getGio() {
        return gio;
    }

    public void setGio(double gio) {
        this.gio = gio;
    }
    @Override
    public String toString(){
        return G.getTenGV()+" "+String.format("%.2f", getTongGio());
    }
}
