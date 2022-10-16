
import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BỘISỐCHUNGNHỎNHẤT {

    public static int check(String s) {
        int n = s.length();
        if (s.charAt(0) == '0') {
            return -1;
        }
        int sc = 0, sl = 0;
        for (int i = 0; i < n; i++) {
            int k = s.charAt(i) - '0';
            if (k >= 0 && k <= 9) {
                if (k % 2 == 0) {
                    sc++;
                } else if (k % 2 != 0) {
                    sl++;
                }
            } else {
                return -1;
            }

        }
        if (sc > sl && n % 2 == 0) {
            return 1;
        }
        if (sl > sc && n % 2 == 1) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            BigInteger b1=sc.nextBigInteger();
            BigInteger b2=sc.nextBigInteger();
            System.out.println(b1.multiply(b2).divide(b1.gcd(b2)));
        }
    }
}
    