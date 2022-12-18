
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Đặng Cường
 */
public class J07052 {

    private String maTS, tenTS;
    private int rank;
    private double diemToan, diemLy, diemHoa, diemUT, diemXT;

    public static String chuanHoaTen(String s) {
        StringBuilder sb = new StringBuilder("");
        String b = 'a' + " " + s;
        String res = "";
        String arr[] = b.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            res += Character.toUpperCase(arr[i].charAt(0));
            for (int j = 1; j < arr[i].length(); j++) {
                res += Character.toLowerCase(arr[i].charAt(j));
            }
            res += " ";
        }
        String ar[] = res.split("\\s+");
        for (int i = 1; i < ar.length; i++) {
            sb.append(ar[i]);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public J07052(String maTS, String tenTS, double diemToan, double diemLy, double diemHoa) {
        this.maTS = maTS;
        this.tenTS = chuanHoaTen(tenTS);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        if (maTS.substring(0, 3).equals("KV1")) {
            diemUT = 0.5;
        } else if (maTS.substring(0, 3).equals("KV2")) {
            diemUT = 1.0;
        } else if (maTS.substring(0, 3).equals("KV3")) {
            diemUT = 2.5;
        }
        diemXT = diemToan * 2 + diemLy + diemHoa + diemUT;
    }

    public String getDUT() {
        if ((int) diemUT == diemUT) {
            return String.format("%.0f", diemUT);
        } else {
            return String.format("%.1f", diemUT);
        }
    }

    public String getDXT() {
        if ((int) diemXT == diemXT) {
            return String.format("%.0f", diemXT);
        } else {
            return String.format("%.1f", diemXT);
        }
    }

    @Override
    public String toString() {
        return maTS + " " + tenTS + " " + getDUT() + " " + getDXT() + " ";
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        List<J07052> l = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            l.add(new J07052(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        double diemChuan = 0;
        Collections.sort(l, new Comparator<J07052>() {
            @Override
            public int compare(J07052 o1, J07052 o2) {
                if (o1.diemXT > o2.diemXT) {
                    return -1;
                } else if (o1.diemXT < o2.diemXT) {
                    return 1;
                } else {
                    return o1.maTS.compareTo(o2.maTS);
                }
            }
        });
        l.get(0).rank = 1;
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i).diemXT == l.get(i - 1).diemXT) {
                l.get(i).rank = l.get(i - 1).rank;
            } else {
                l.get(i).rank = i + 1;
            }
        }
        int q = Integer.parseInt(sc.nextLine());
        for (J07052 x : l) {
            if (x.rank == q) {
                diemChuan = x.diemXT;
                System.out.println(x.diemXT);
                break;
            }
        }
        for (J07052 x : l) {
            System.out.print(x);
            if (x.diemXT >= diemChuan) {
                System.out.println("TRUNG TUYEN");
            } else {
                System.out.println("TRUOT");
            }
        }
    }
}
/*
2
KV2A002
Hoang THAnh tuan
5
6
5
KV3B123
 LY Thi   THU ha
8
6.5
7
1
*/
