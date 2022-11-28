/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class HoaDon {
    private String mKH,mMH,maHD;
    private int soLuong;
    private KhachHang K;
    private MatHang M;

    public HoaDon(int maHD,String mKH, String mMH, int soLuong) {
        this.maHD = "HD"+String.format("%03d",maHD);
        this.mKH = mKH;
        this.mMH = mMH;
        this.soLuong = soLuong;
    }

    public String getmKH() {
        return mKH;
    }

    public void setmKH(String mKH) {
        this.mKH = mKH;
    }

    public String getmMH() {
        return mMH;
    }

    public void setmMH(String mMH) {
        this.mMH = mMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public KhachHang getK() {
        return K;
    }

    public void setK(KhachHang K) {
        this.K = K;
    }

    public MatHang getM() {
        return M;
    }

    public void setM(MatHang M) {
        this.M = M;
    }
    public long getTien() {
        return soLuong*M.getGiaBan();
    }
    @Override
    public String toString(){
        return maHD+" "+K.getTenKH()+" "+K.getDiaChi()+" "+
                M.getTenMH()+" "+M.getDonViTinh()+" "+
                M.getGiaMua()+" "+M.getGiaBan()+" "+soLuong+" "+getTien();
    }
}
