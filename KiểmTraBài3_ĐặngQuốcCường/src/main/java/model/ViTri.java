/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Đặng Cường
 */
public class ViTri implements Serializable{
    private int ma;
    private String ten;
    private int heSo;

    public ViTri() {
    }

    public ViTri(int ma, String ten, int heSo) {
        this.ma = ma;
        this.ten = ten;
        this.heSo = heSo;
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

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    
    
  
    public Object[] toObject(){
        return new Object[]{
            ma,ten,heSo
        };
    }
}
