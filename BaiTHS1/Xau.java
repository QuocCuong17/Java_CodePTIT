/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class Xau {
    private String s;

    public Xau(String s) {
        this.s = s;
    }
    public void KTMSV(){
        if(s.matches("B[0-9]{2}DC[A-Z]{2}[0-9]{3}")){
            System.out.println("Dung dinh dang ma sinh vien PTIT!");
        }
        else System.out.println("Sai dinh dang ma sinh vien PTIT!");
        
    }
    public void TachTu(){
        String t[]=s.split("[^a-zA-Z0-9]+");
        System.out.println("So tu trong xau: "+t.length);
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
    public void ChuanHoa(){
        String []t=s.toLowerCase().split("[^a-zA-Z0-9\\.,!?]+");
        System.out.print("Sau khi chuan hoa: ");
        System.out.print(t[0].substring(0, 1).toUpperCase()+t[0].substring(1, t[0].length()));
        for(int i=1;i<t.length;i++){
            System.out.print(" "+t[i]);
        }
        System.out.print(".");
        System.out.println("");
    }
    
}
