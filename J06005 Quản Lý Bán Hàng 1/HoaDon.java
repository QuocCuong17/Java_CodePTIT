/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class HoaDon {
    private String maHD ,maKH ,maMH;
    private int soLuong;
    private KhachHang K;
    private MatHang M;
    public HoaDon(int maHD, String maKH, String maMH, int soLuong) {
        this.maHD = "HD"+String.format("%03d", maHD);
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
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
    public long getThanhTien(){
        return soLuong*M.getGiaBan();
    }
    @Override
    public String toString(){
        return maHD+" "+K.getTenKH()+" "+K.getDiaChi()+" "+M.getTenMH()+" "+M.getDonViTinh()+" "+M.getGiaMua()+" "+M.getGiaBan()+" "+soLuong+" "+getThanhTien();
    }
}
