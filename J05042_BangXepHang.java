/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Đặng Cường
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OOPS {
    private String hoTen;
    private int C,T;
    public static String chuanHoa(String s){
        StringBuilder sb= new StringBuilder("");
        String res="";
        String b='a'+s;
        String arr[]=b.split("\\s+");
        for(int i=0;i<arr.length;i++){
            res+=Character.toUpperCase(arr[i].charAt(0));
            for(int j=1;j<arr[i].length();j++){
                res+=Character.toLowerCase(arr[i].charAt(j));
                
            }
            res+=" ";
        }
        String ar[]=res.split("\\s+");
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public OOPS(String hoTen, int C, int T) {
        this.hoTen = hoTen;
        this.C = C;
        this.T = T;
    }

    
    @Override
    public String toString(){
        return hoTen+" "+C+" "+T;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<OOPS> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ten = sc.nextLine();
            String ct=sc.nextLine();
            String arr[] =ct.split("\\s+");
            int c=Integer.parseInt(arr[0]);
            int t=Integer.parseInt(arr[1]);
            OOPS x = new OOPS(ten, c, t);
            list.add(x);
        }
        Collections.sort(list, new Comparator<OOPS>(){
            @Override
            public int compare(OOPS o1, OOPS o2) {
                if(o1.C != o2.C){
                    return o2.C - o1.C;
                }
                else if(o1.T != o2.T){
                    return o1.T-o2.T;
                }
                else return o1.hoTen.compareTo(o2.hoTen);
            }
            
        });
        for(OOPS x : list){
            System.out.println(x);
        }
    }
}
