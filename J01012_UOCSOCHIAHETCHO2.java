
import java.util.Scanner;

public class J01012_UOCSOCHIAHETCHO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int dem=0;
            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0 ){
                    if(i%2==0)
                            dem++;
                    if((n/i)!=i && (n/i)%2==0)
                        dem++;
                }
            }
            System.out.println(dem);
        }
    }
}
