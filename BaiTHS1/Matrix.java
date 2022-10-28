
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class Matrix {
    private int a[][];
    public Matrix(int r,int c){
        a=new int [r][c];
    }
    public int getHang(){
        return a.length;
    }
    public int getCot(){
        return a[0].length;
    }
    public int [][] getMatrix(){
        return a;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma tran co so hang la "+a.length+" va so cot la "+a[0].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
    }
    public void ChuyenVi(){
        System.out.println("Ma tran ban dau: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Ma tran chuyen vi: ");
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
    }
    public boolean checksnt(int n){
        if(n<2) return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public void HangNT(){
        int check=0;
        for(int i=0;i<a.length;i++){
            int ok=1;
            for(int j=0;j<a[0].length;j++){
                if(checksnt(a[i][j])==false){
                    ok=0;
                    break;
                }
            }
            if(ok==1){
                check =1;
                System.out.println(i);
            }
        }
        if(check==0){
            System.out.println("Khong co hang nao chi co cac so nguyen to!!!");
        }
    }
}
