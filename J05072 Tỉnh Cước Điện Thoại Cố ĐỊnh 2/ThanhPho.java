/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J05072;

/**
 *
 * @author Đặng Cường
 */
public class ThanhPho {
    private String maTP,tenTP;
    private int gia;

    public ThanhPho(String maTP, String tenTP, int gia) {
        this.maTP = maTP;
        this.tenTP = tenTP;
        this.gia = gia;
    }

    public String getMaTP() {
        return maTP;
    }

    public void setMaTP(String maTP) {
        this.maTP = maTP;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
