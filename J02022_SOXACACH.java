import java.util.Scanner;

public class J02022_SOXACACH {
    public static int n;
    public static int a[]=new int [15];
    public static boolean ok;
    public static boolean checkk(){
        for(int i=2;i<=n;i++){
            if(Math.abs(a[i]-a[i-1])==1){
                return false;
            }
        }
        return true;
    }
    public static void Sinh(){
        int i=n-1;
        while(i>=1 && a[i]>a[i+1]){
            --i;
        }
        if(i==0) ok=true;
        else{
            int j=n;
            while(a[i]>a[j]){
                --j;
            }
            int tm=a[i];
            a[i]=a[j];
            a[j]=tm;
            int l=i+1,r=n;
            while(l<r){
                int tmp=a[l];
                a[l]=a[r];
                a[r]=tmp;
                ++l;
                --r;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            ok=false;
            n = sc.nextInt();
            a=new int[n+5];
            for (int i = 1; i <= n; i++) {
                a[i] = i;
            }
            while (!ok){
                    for(int i=1;i<=n;i++){
                        if(checkk())
                            System.out.print(a[i]);
                    }
                    System.out.println("");
                    Sinh();    
                }

            System.out.println("");
        }
    }
}
