
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class JKT013_SỐLỘCPHÁT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=0;
            Queue<String> q=new LinkedList<>();
            Stack<String> st = new Stack<>();
            q.add("6");
            q.add("8");
            for(int i=1;i<=n;i++){
                s+=Math.pow(2, i);
            }
            System.out.println(s);
            while(!q.isEmpty()){
                String k=q.peek();
                if(k.length()<=n){
                    st.push(k);
                }
                q.remove();
                if(k.length()!=n){
                    q.add(k+"6");
                    q.add(k+"8");
                }
            }
            while(!st.isEmpty()){
                System.out.print(st.peek()+" ");
                st.pop();
            }
            System.out.println("");
        }
    }
}
