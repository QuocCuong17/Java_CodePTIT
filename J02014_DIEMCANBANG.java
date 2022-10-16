
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class J02014_DIEMCANBANG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int a[] = new int[n];
            long s = 0, k = 0, ans = -1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                s += a[i];
            }
            for (int i = 0; i < n; i++) {
                if (k * 2 + a[i] == s) {
                    ans = i + 1;
                    break;
                }
                k += a[i];
            }
            System.out.println(ans);
        }
    }

    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
//Input:
//
//Output
//
//2
//
//7
//
//-7 1 5 2 -4 3 0
//
//5
//
//1 2 3 4 5
//
// 
//
//4
//
//-1