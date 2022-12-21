/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.math.*;
import java.util.*;
/*
 *
 * @author Đặng Cường
 */
public class J08024_So0VaSo9 {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            q.add(9);
            while (!q.isEmpty()) {
                int k = q.peek();
                q.remove();
                if (k % n == 0) {
                    System.out.println(k);
                    break;
                }
                q.add(k * 10);
                q.add(k * 10 + 9);
            }
        }
    }
}
