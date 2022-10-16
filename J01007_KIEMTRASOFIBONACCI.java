
import java.util.Scanner;

public class J01007_KIEMTRASOFIBONACCI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a[] = new long[93];
        a[0] = 0;
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 92; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            Long n = sc.nextLong();
            int ok = 2;
            for(int i=0;i<93;i++){
                if(n.equals(a[i])){
                    ok=3;
                    break;
                }
            }
            if(ok==3) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
