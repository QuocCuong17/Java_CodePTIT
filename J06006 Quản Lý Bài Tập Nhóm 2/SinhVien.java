/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV , hoTen ,sdt ;
    private int sttNhom;
    public static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder("");
        String b='a'+" "+s;
        String res ="";
        String arr[]=b.split("\\s+");
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
            }
            res+=" ";
        }
        String ar[]=res.split("\\s+");
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public SinhVien(String maSV, String hoTen, String sdt, int sttNhom) {
        this.maSV = maSV;
        this.hoTen = chuanHoa(hoTen);
        this.sdt = sdt;
        this.sttNhom = sttNhom;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSttNhom() {
        return sttNhom;
    }

    public void setSttNhom(int sttNhom) {
        this.sttNhom = sttNhom;
    }
    @Override
    public  String toString(){
        return maSV+" "+hoTen+" "+sdt+" "+sttNhom;
    }
    public int compareTo(SinhVien o){
        return this.maSV.compareTo(o.maSV);
    }
}
