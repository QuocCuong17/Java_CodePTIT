
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Acer Gaming
 */
public class J07054 {

    private String hoTen, maSV;
    private double d1, d2, d3, dtb;
    private int rank;

    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder("");
        String res = "";
        String b = 'a' + " " + s;
        String arr[] = b.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) {
                res += Character.toLowerCase(arr[i].charAt(j));
            }
            res += " ";

        }
        String ar[] = res.split("\\s+");
        for (int i = 1; i < arr.length; i++) {
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public J07054(int maSV, String hoTen, double d1, double d2, double d3) {
        this.maSV = "SV" + String.format("%02d", maSV);
        this.hoTen = chuanHoa(hoTen);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        dtb = (d1 * 3 + d2 * 3 + d3 * 2) / 8;
    }

    @Override
    public String toString() {
        return this.maSV + " " + this.hoTen + " " + String.format("%.2f",dtb) + " " + this.rank;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        List<J07054> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            J07054 x = new J07054(i + 1, ten, d1, d2, d3);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07054>() {
            @Override
            public int compare(J07054 o1, J07054 o2) {
                if (o1.dtb > o2.dtb) {
                    return -1;
                } else {
                    return 1;
                }
            }

        });
        list.get(0).rank = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).dtb==(list.get(i - 1).dtb)) {
                list.get(i).rank = list.get(i - 1).rank;
            } else {
                list.get(i).rank = i + 1;
            }
        }
        Collections.sort(list, new Comparator<J07054>() {
            @Override
            public int compare(J07054 o1, J07054 o2) {
                if(o1.rank>o2.rank) {
                    return 1;
                }
                else if(o1.rank<o2.rank){
                    return -1;
                }
                else return o1.maSV.compareTo(o2.maSV);
            }

        });
        for(J07054 x : list){
            System.out.println(x);
        }
    }
}
//2
// ha Thi kieu     anh
//7
//6
//7
//Pham    THI  HAO
//6
//7
//6