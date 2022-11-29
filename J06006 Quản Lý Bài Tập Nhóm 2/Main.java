/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Đặng Cường
 */
public class Main {

    public static void main(String[] args) {
        List<SinhVien> dsSV = new ArrayList<>();
        List<Nhom> dsN = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()));
            s.compareTo(s);
            dsSV.add(s);
        }
        Collections.sort(dsSV);
        for(int i=0;i<m;i++){
            Nhom x = new Nhom(i+1, sc.nextLine());
            dsN.add(x);
        }
        for(int i=0;i<dsSV.size();i++){
            for(int j=0;j<dsN.size();j++){
                if(dsSV.get(i).getSttNhom()==dsN.get(j).getNhomBT()){
                    System.out.println(dsSV.get(i)+" "+dsN.get(j));
                }
            }
        }
    }

}
