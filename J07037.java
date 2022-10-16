
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07037 {
    private String maDN,tenDN;
    private int soSV;

    public J07037(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }
    @Override
    public String toString(){
        return this.maDN+" "+this.tenDN+" "+this.soSV;
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n=sc.nextInt();
        List<J07037> list = new ArrayList<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int sosv=Integer.parseInt(sc.nextLine());
            J07037 x = new J07037(ma,ten,sosv);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07037>(){
            @Override
            public int compare(J07037 o1, J07037 o2) {
                return o1.maDN.compareTo(o2.maDN);
            }
            
        });
        for(J07037 x : list){
            System.out.println(x);
        }
    }
}
