
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class J07021 {
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
        for(int i=1;i<arr.length;i++){
            sb.append(ar[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) throws FileNotFoundException  {
        Scanner sc= new Scanner(new File("DATA.in"));
        while(true){
            String s=sc.nextLine();
            if(s.compareTo("END")==0) break;
            String a=chuanHoa(s);
            System.out.println(a);
        }
    }
}
