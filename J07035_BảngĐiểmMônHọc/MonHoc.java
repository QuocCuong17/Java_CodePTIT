/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class MonHoc {
    private String ma, name;
    private int soTin;

    public MonHoc(String ma, String name, int soTin) {
        this.ma = ma;
        this.name = name;
        this.soTin = soTin;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public int getSoTin() {
        return soTin;
    }
}