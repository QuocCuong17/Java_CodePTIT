
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J02103_TICHMATRANVOICHUYENVICUANO {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int to=t;
        while(t-->0){
            
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[][]=new int [n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Test "+(to-t)+":"); 
            int b[][]=new int [m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=a[j][i];
                }
            }
            long res[][]=new long [n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    res[i][j]=0;
                    for(int k=0;k<m;k++){
                        res[i][j]+=1l*(a[i][k]*b[k][j]);
                    }
                    System.out.print(res[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
