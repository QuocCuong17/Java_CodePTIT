/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
public class GiangVien {
    private String maGV ,tenGV ;
    public static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder("");
        String res ="";
        String b = 'a'+" "+s;
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
    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = chuanHoa(tenGV);
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
    
}
