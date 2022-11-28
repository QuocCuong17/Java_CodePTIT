/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class Data2 {
    private Data1 D;
    private String Mahdbd;
    private int slmua,heSo;
    private String maHD;

    public Data2(int maHD,String Mahdbd, int slmua ) {
        this.maHD = "-"+String.format("%03d", maHD);
        this.Mahdbd = Mahdbd;
        this.slmua = slmua;
        heSo=Integer.parseInt(Mahdbd.substring(2, 3));
    }
    
    public Data1 getD() {
        return D;
    }

    public void setD(Data1 D) {
        this.D = D;
    }

    public String getHdbd() {
        return Mahdbd;
    }

    public void setHdbd(String hdbd) {
        this.Mahdbd = hdbd;
    }

    public int getSlmua() {
        return slmua;
    }

    public void setSlmua(int slmua) {
        this.slmua = slmua;
    }
    public long getDG1() {
        return D.getDonGia1();
    }
    public long getDG2() {
        return D.getDonGia2();
    }
    public String getTen() {
        return D.getTenSanPham();
    }
    public long getNhan(){
        if(heSo==1)
            return (long)1l*slmua*getDG1();
        else return (long)1l*slmua*getDG2();
    }
    public long getTGiamGia() {
        long helo=0;
        if(heSo==1){
            if(slmua>=150)
                helo+= (long) 1l*getNhan()*0.5;
            else if(slmua>=100)
                helo+= (long) 1l*getNhan()*0.3;
            else if(slmua>=50)
                helo+= (long) 1l*getNhan()*0.15;;
        }
        else {
            if(slmua>=150)
                helo+= (long) 1l*getNhan()*0.5;
            else if(slmua>=100)
                helo+= (long) 1l*getNhan()*0.3;
            else if(slmua>=50)
                helo+= (long) 1l*getNhan()*0.15;;
        }
        return helo;
    }
    public long getThanhTien() {
        long helo=0;
        helo+= (long) 1l*getNhan()-getTGiamGia();
        return helo;
    }
    @Override
    public String toString(){
        return Mahdbd+maHD+" "+D.getTenSanPham()+" "+getTGiamGia()+" "+getThanhTien();
    }
}
