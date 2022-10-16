
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07048 {
    private String maSP,tenSP;
    private int giaBan,thoiHan;

    public J07048(String maSP, String tenSP, int giaBan, int thoiHan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHan = thoiHan;
    }
    @Override
    public String toString(){
        return this.maSP+" "+this.tenSP+" "+this.giaBan+" "+this.thoiHan;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("SANPHAM.in"));
        List<J07048> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int gia=Integer.parseInt(sc.nextLine());
            int han=Integer.parseInt(sc.nextLine());
            J07048 x = new J07048(ma,ten,gia,han);
            list.add(x);
        }
        Collections.sort(list,new Comparator<J07048>(){
            @Override
            public int compare(J07048 o1, J07048 o2) {
                if(o1.giaBan>o2.giaBan){
                    return -1;
                }
                else if(o1.giaBan<o2.giaBan){
                    return 1;
                }
                else return o1.maSP.compareTo(o2.maSP);
            }
            
        });
        for(J07048 x : list ){
            System.out.println(x);
        }
    }
}
