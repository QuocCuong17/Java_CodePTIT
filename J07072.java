
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class J07072 {
    private String hoTen,ten,ho,dem;
    
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
        for(int i=1;i<ar.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    public J07072(String hoTen) {
        this.hoTen=chuanHoa(hoTen);
        String a=chuanHoa(hoTen);
        String arr[]=a.split("\\s+");
        ten=arr[arr.length-1];
        ho=arr[0];
        for(int  i=0;i<arr.length-1;i++){
            dem+=arr[i];
        }
    }
    @Override
    public String toString(){
        return this.hoTen;
    }
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner sc= new Scanner(new File("DANHSACH.in"));
        List<J07072> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            J07072 x = new J07072(s);
            list.add(x);
        }
        Collections.sort(list, new Comparator<J07072>(){
            @Override
            public int compare(J07072 o1, J07072 o2) {
               if(o1.ten.equals(o2.ten)){
                   return o1.dem.compareTo(o2.dem);
               }
//               else if(o1.ten.equals(o2.ten) && !o1.ho.equals(o2.ho)){
//                   return o1.ho.compareTo(o2.ho);
//               }
               else return o1.ten.compareTo(o2.ten);
            }
            
        });
        for(J07072 x : list){
            System.out.println(x);
        }
    }
}
