
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class J02005_GIAOCUAHAIDAYSO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> mp = new TreeMap<>();
        int a[] = new int[n];
        int b[] = new int[m];
        int[] cnt1 = new int[10000001];
        int[] cnt2 = new int[10000001];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt1[a[i]]++;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            cnt2[b[i]]++;
        }
        for (int i = 0; i <= 10000000; i++) {
            if (cnt1[i] != 0 && cnt2[i] != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
