
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */

public class Matrix {

    private int n, m;
    private int a[][];

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public Matrix trans(){
        Matrix T= new Matrix(this.m,this.n);
        for(int i=0;i<this.m;i++){
            for(int j=0;j<this.n;j++){
                T.a[i][j]=this.a[j][i];
            }
        }
        return T;
    }
    public Matrix mul(Matrix other) {
        Matrix res = new Matrix(this.n, other.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < other.m; j++) {
                res.a[i][j] = 0;
                for (int k = 0; k < this.m; k++) {
                    res.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        return res;
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                s += this.a[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
    public static void main8272174(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n, m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }

}


