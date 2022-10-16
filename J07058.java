
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07058 {
    private String maMH,tenMH,hinhThucThi;

    public J07058(String maMH, String tenMH, String hinhThucThi) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.hinhThucThi = hinhThucThi;
    }
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" "+this.hinhThucThi;
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc= new Scanner(new File("MONHOC.in"));
        List<J07058> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String ht=sc.nextLine();
            J07058 x = new J07058(ma,ten,ht);
            list.add(x);
            
        }
        Collections.sort(list,new Comparator<J07058>(){
            @Override
            public int compare(J07058 o1, J07058 o2) {
                return o1.maMH.compareTo(o2.maMH);
            }
            
        });
        for(J07058 x: list){
            System.out.println(x);
        }
    }
}
