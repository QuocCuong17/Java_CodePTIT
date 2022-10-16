import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class LoaiPhong  implements Comparable<LoaiPhong>  {
    String name;
    String value;

    public LoaiPhong(String value) {
        this.name = value.split(" ")[1];
        this.value = value;
    }
    @Override
    public int compareTo(LoaiPhong x) {
        return this.name.compareTo(x.name);
    }

    @Override
    public String toString() {
        return value;
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.IN"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
