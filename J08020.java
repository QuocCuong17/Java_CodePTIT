
import java.util.Scanner;
import java.util.Stack;
public class J08020 {
    public static int check(String s){
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if(k==')'){
                if(st.empty()||st.peek()!='('){
                    return 0;
                }
                st.pop();
            }
            else if(k==']'){
                if(st.empty()||st.peek()!='['){
                    return 0;
                }
                st.pop();
            }
            else if(k=='}'){
                if(st.empty()||st.peek()!='{'){
                    return 0;
                }
                st.pop();
            }
            else st.push(k);
            
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            if(check(s)==0){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
}
//2
//[()]{}{[()()]()}
//[(])