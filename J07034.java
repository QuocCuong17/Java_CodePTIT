import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J07034 {
    private String maMH,tenMH,soTC;

    public J07034(String maMH, String tenMH, String soTC) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" "+this.soTC;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MONHOC.in"));
        List<J07034> list = new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String sotc=sc.nextLine();
            J07034 x = new J07034 (ma,ten,sotc);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07034>(){
            @Override
            public int compare(J07034 o1, J07034 o2) {
                return o1.tenMH.compareTo(o2.tenMH);
            }
            
        });
        for(J07034 x : list ){
            System.out.println(x);
        }
    }
}
