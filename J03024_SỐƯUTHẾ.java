
import java.util.Scanner;

public class J03024_SỐƯUTHẾ {

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
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.next();
            if(check(s)==1){
                System.out.println("YES");
            }
            else if(check(s)==0){
                System.out.println("NO");
            }
            else System.out.println("INVALID");
        }
    }
}
    