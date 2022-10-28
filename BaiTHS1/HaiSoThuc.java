/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class HaiSoThuc {
    private Double x,ep;

    public HaiSoThuc(Double x, Double ep) {
        this.x = x;
        this.ep = ep;
    }
    public double gt(double n){
        double i,kq=1;
        for( i=2;i<=n;i++){
            kq*=i;
            
        }
        return kq;
    }
    public void KQCos(){
        double a,n=1,kq=1;
        do{
            a=Math.pow(x,2*n)/gt(2*n);
            kq+=Math.pow(-1, n)*a;
            n++;
        }while(Math.abs(a)>ep);
        System.out.println("Ket qua: "+kq);
    }

}
