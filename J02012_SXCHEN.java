
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J02012_SXCHEN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
            System.out.print("Buoc " + i + ": ");
            for (j = 0; j <= i; j++) {
                System.out.print(a[j]+" ");
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
//5 7 3 2
//
//Buoc 0: 5
//
//Buoc 1: 5 7
//
//Buoc 2: 3 5 7
//
//Buoc 3: 2 3 5 7

 