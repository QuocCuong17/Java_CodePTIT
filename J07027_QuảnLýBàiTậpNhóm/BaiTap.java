/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class BaiTap {
    private String tenBT ,maBT;

    public BaiTap(int maBT, String tenBT) {
        this.maBT = String.format("%01d",maBT);
        this.tenBT = tenBT;
    }

    public String getTenBT() {
        return tenBT;
    }

    public void setTenBT(String tenBT) {
        this.tenBT = tenBT;
    }

    public String getMaBT() {
        return maBT;
    }

    public void setMaBT(String maBT) {
        this.maBT = maBT;
    }
    
}
