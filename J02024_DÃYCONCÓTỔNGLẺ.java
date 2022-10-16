import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02024_DÃYCONCÓTỔNGLẺ {

    static int t, n;
    static int[] a = new int[100];
    static int[] b = new int[100];
    static int[] x = new int[100];

    public static void ql(int i) {
        for (int j = 0; j <= 1; j++) {
            x[i] = j;
            if (i == n) {
                ArrayList<Integer> ds = new ArrayList<>();
                int sum = 0;
                for (int k = 1; k <= n; k++) {
                    if (x[k] == 1) {
                        sum += a[k];
                        ds.add(a[k]);
                    }
                }
                if (sum % 2 == 1) {
                    for (int k = 0; k < ds.size(); k++) {
                        System.out.print(ds.get(k) + " ");
                    }
                    System.out.println();
                }
            } else {
                ql(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(b, 1, n + 1);

            for (int i = 1; i <= n; i++) {
                a[i] = b[n - i + 1];
            }
            ql(1);
        }
    }
}