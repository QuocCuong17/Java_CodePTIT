
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J03005_CHUANHOAHOTEN2 {
    public static String vietHoa(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            res+=Character.toUpperCase(s.charAt(i));
        }
        return res; 
    }
    public static String chuanHoa(String s){
        StringBuilder sb =new StringBuilder("");
        String res="";
        String b='a'+ " "+s;
        String arr[]=b.split("\\s+");
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
            }
            res+=" ";
            
        }
        String ar[]=res.split("\\s+");
        for(int i=2;i<arr.length;i++){
            sb.append(ar[i]);
            if(i!=arr.length-1){
                sb.append(" ");
            }
            else sb.append(", ");
            
        }
        sb.append(vietHoa(arr[1]));
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
           
            String a=chuanHoa(s);
            System.out.println(a);
        }
    }
}

//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH



