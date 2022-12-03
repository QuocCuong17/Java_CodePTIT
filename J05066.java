
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class J05066 {

    private String values, chucVu, heSoLuong, soHieuNV, tenNV;

    public J05066(String values, String ten) {
        this.tenNV = ten;
        this.values = values;
        String arr[] = values.split("\\s+");
        chucVu = arr[0].substring(0, 2);
        heSoLuong = arr[0].substring(2, 4);
        soHieuNV = arr[0].substring(4, 7);
    }


    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    @Override
    public String toString() {
        return tenNV + " " + chucVu + " " + soHieuNV + " " + heSoLuong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<J05066> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int gd = 0, tp = 0, pp = 0;
        for (int i = 0; i < n; i++) {
            String a =sc.next();
            String b =sc.nextLine().trim();        
            J05066 x = new J05066(a,b);  
            l.add(x);
        }
        for(J05066 x : l){
            if (x.chucVu.equals("GD")) {
                if (Integer.parseInt(x.soHieuNV) > 1) {
                    x.setChucVu("NV");
                }
            }
            else if (x.chucVu.equals("TP")) {
                if (Integer.parseInt(x.soHieuNV) > 3) {
                    x.setChucVu("NV");
                }
            }
            else if (x.chucVu.equals("PP")) {
                if (Integer.parseInt(x.soHieuNV) > 3) {
                    x.setChucVu("NV");
                }
            }
        }
        Collections.sort(l, new Comparator<J05066>() {
            @Override
            public int compare(J05066 o1, J05066 o2) {
                if (o1.heSoLuong.equals(o2.heSoLuong)) {
                    return o1.soHieuNV.compareTo(o2.soHieuNV);
                } else {
                    return o2.heSoLuong.compareTo(o1.heSoLuong);
                }
            }

        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String se = sc.nextLine().toLowerCase();
            for (J05066 x : l) {
                if (x.tenNV.toLowerCase().contains(se)) {
                    System.out.println(x);
                }
            }
            System.out.println("");
        }
    }
}

//6
//GD08001 Nguyen Kim Loan
//TP05002 Hoang Thanh Tuan
//TP05001 Tran Binh Nguyen
//PP06002 Phan Trung Tuan
//PP06001 Tran Quoc Huy
//NV04003 Vo Van Lan
//2
//OA
//aN