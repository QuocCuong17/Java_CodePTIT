/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Acer Gaming
 */
public class Xuong implements Serializable{
    private int ma;
    private String ten;
    private int hoso;

    public Xuong() {
    }

    public Xuong(int ma, String ten, int hoso) {
        this.ma = ma;
        this.ten = ten;
        this.hoso = hoso;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHoso() {
        return hoso;
    }

    public void setHoso(int hoso) {
        this.hoso = hoso;
    }
  
    public Object[] toObject(){
        return new Object[]{
            ma,ten,hoso
        };
    }
}
