
import java.util.*;
/* Hello các con vợ  */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class J05062 {

    private String hoTen, HB;
    private double tbc;
    private int rl;
    private int rank;

    public J05062(String hoTen, double tbc, int rl) {
        this.hoTen = hoTen;
        this.tbc = tbc;
        this.rl = rl;
        if (tbc >= 3.6 && (rl >= 90)) {
            HB = "XUATSAC";
        } else if (tbc >= 3.2 && (rl >= 80)) {
            HB = "GIOI";
        } else if (tbc >= 2.5 && (rl >= 70)) {
            HB = "KHA";
        }

    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getTbc() {
        return tbc;
    }

    public void setTbc(double tbc) {
        this.tbc = tbc;
    }

    public int getRl() {
        return rl;
    }

    public void setRl(int rl) {
        this.rl = rl;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<J05062> l = new ArrayList<>();
        List<J05062> l1 = new ArrayList<>();

        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String s = sc.nextLine();
            String arr[] = s.split("\\s+");
            double a = Double.parseDouble(arr[0]);
            int b = Integer.parseInt(arr[1]);
            J05062 x = new J05062(ten, a, b);
            l.add(x);
            l1.add(x);
        }
        Collections.sort(l, new Comparator<J05062>() {
            @Override
            public int compare(J05062 o1, J05062 o2) {
                if (o1.tbc > o2.tbc) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        l.get(0).rank = 1;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i).tbc == l.get(i - 1).tbc) {
                l.get(i).rank = l.get(i - 1).rank;
            } else {
                l.get(i).rank = i + 1;
            }
        }
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l1.size(); j++) {
                l.get(i).rank = l1.get(i).rank;
            }
        }
        for (J05062 x : l1) {
            if (x.rank <= m) {
                System.out.println(x.getHoTen() + ": " + x.HB);
            } else {
                System.out.println(x.getHoTen() + ": " + "KHONG");
            }
        }
    }
}
