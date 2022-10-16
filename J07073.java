
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer Gaming
 */
public class J07073 {
    private String maMH,tenMH;
    private int soTC;
    private String HTGDLT,HTGDTH;

    public J07073(String maMH, String tenMH, int soTC, String HTGDLT, String HTGDTH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
        this.HTGDLT = HTGDLT;
        this.HTGDTH = HTGDTH;
    }
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" "+this.soTC+" "+this.HTGDLT+" "+this.HTGDTH;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MONHOC.in"));
        List<J07073> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sotc=Integer.parseInt(sc.nextLine());
            String lt=sc.nextLine();
            String th=sc.nextLine();
            J07073 x = new J07073(ma,ten,sotc,lt,th);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07073>(){
            @Override
            public int compare(J07073 o1, J07073 o2) {
                return o1.maMH.compareTo(o2.maMH);
            }
            
        });
        for(J07073 x : list){
            if(x.HTGDTH.contains(".ptit.edu.vn")||x.HTGDTH.contains("Truc tuyen"))
                System.out.println(x);
        }
    }
}
//3
//INT1306
//Cau truc du lieu va giai thuat
//3
//Truc tiep
//code.ptit.edu.vn
//INT13110
//Lap trinh mang voi C++
//3
//Truc tiep
//Truc tuyen
//INT1155
//Tin hoc co so 2
//2
//Truc tiep
//code.ptit.edu.vn