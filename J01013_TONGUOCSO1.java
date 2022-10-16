import java.util.Scanner;
public class J01013_TONGUOCSO1 {

    static int[] a = new int[2000001];
    public static void main(String[] args) {
        sang();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long m1 = 0;
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            while (n != 1) {
                int tmp = a[n];
                while (n % tmp == 0) {
                    m1 += tmp;
                    n /= tmp;
                }
            }
        }
        System.out.println(m1);
    }

    public static void sang() {
        for (int i = 1; i <= 2000000; i++) {
            a[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(2000000); i++) {
            if (a[i] != 0) {
                for (int j = i * i; j <= 2000000; j += i) {
                    if (a[j] == j) {
                        a[j] = i;
                    }
                }
            }
        }
    }

}
