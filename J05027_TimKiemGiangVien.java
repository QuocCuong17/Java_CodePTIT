/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OOPS {

    private String maGV, hoTen, boMon, viettat, hoTenThuong;

    public OOPS(int maGV, String hoTen, String boMon) {
        this.maGV = "GV" + String.format("%02d", maGV);
        this.hoTen = hoTen;
        String arr[] = boMon.split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
        }
        this.boMon = boMon;
        String arr1[] = boMon.split("\\s+");
        String res1 = "";
        res1 += hoTen.toLowerCase();
//        for(int i=0;i<hoTen.length();i++){
//            res+=hoTen.charAt(i);
//        }
        hoTenThuong = res1;
        viettat = res;
    }

    @Override
    public String toString() {
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<OOPS> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String bomon = sc.nextLine();
            String ans = "";
            OOPS x = new OOPS(i + 1, ten, bomon);
            arr.add(x);
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ": ");
            String res11 = "";
            res11 += s.toLowerCase();
            for (OOPS x : arr) {
                String ans = "";

                if (x.hoTenThuong.contains(res11)) {

                    System.out.println(x.maGV + " " + x.hoTen + " " + x.viettat);
                }
            }
        }

    }
}
