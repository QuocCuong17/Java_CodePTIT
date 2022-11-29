
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Nhom {
    private int nhomBT;
    private String baiTap ;

    public Nhom(int nhomBT, String baiTap) {
        this.nhomBT = nhomBT;
        this.baiTap = baiTap;
    }

    public int getNhomBT() {
        return nhomBT;
    }

    public String getBaiTap() {
        return baiTap;
    }
    @Override
    public String toString(){
        return String.format("%s",baiTap);
    }
    
}
//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19