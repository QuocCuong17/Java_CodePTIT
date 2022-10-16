import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J05056 {

    private String maGV, hoTen, boMon;

    public J05056(int maGV, String hoTen, String boMon) {
        this.maGV = "GV" + String.format("%02d", maGV);
        this.hoTen = hoTen;
        String arr[] = boMon.split("\\s+");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
        }
        this.boMon = res;
    }

    @Override
    public String toString() {
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<J05056> arr = new ArrayList<>();
        Map<J05056, String> mp = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String bomon = sc.nextLine();
            
            String a[]=bomon.split("\\s+");
            String res = "";
            for(int j=0;j<a.length;j++){
                res+=Character.toUpperCase(a[j].charAt(0));
            }
            J05056 x = new J05056(i + 1, ten, bomon);
            mp.put(x, res);
        }
        int q =Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s1 = sc.nextLine();
            String a[] = s1.split("\\s+");
            String res = "";
            for (int i = 0; i < a.length; i++) {
                res += Character.toUpperCase(a[i].charAt(0));
            }
            String haizz = res;
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            Set<Map.Entry<J05056, String>> entry = mp.entrySet();
            for (Map.Entry<J05056, String> x : entry) {
                if (x.getValue().equals(res)) {
                    System.out.println(x.getKey());
                }
            }
        }
    }
}
//7
//Hoang Quoc Viet
//An toan thong tin
//Tran Phu
//Cong nghe phan mem
//Bac Tu Liem
//Khoa hoc may tinh
//Cao Xuan Thanh
//Cong nghe phan mem
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//An toan thong tin
//Cong nghe phan mem
//Khoa hoc may tinh