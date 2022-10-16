import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J02013_SXNOIBOT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean k = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tm = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tm;
                    k = true;
                }
            }
            if (k == false) {
                break;
            }
            System.out.print("Buoc " + (b++) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
//Input
//
//Output
//
//4
//
//5 3 2 7
//
//Buoc 1: 3 2 5 7
//
//Buoc 2: 2 3 5 7