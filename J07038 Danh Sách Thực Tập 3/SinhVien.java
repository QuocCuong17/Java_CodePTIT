/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class SinhVien {
    private String maSV ,hoTen,lop,emailString;
    public static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder("");
        String res="";
        String b='a'+" "+s;
        String arr[] =b.split("\\s+");
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
            }
            res+= " ";
        }
        String ar[]=res.split("\\s+");
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public SinhVien(String maSV, String hoTen, String lop, String emailString) {
        this.maSV = maSV;
        this.hoTen = chuanHoa(hoTen);
        this.lop = lop;
        this.emailString = emailString;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }
    
}
