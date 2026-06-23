
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CMoveBrackets {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            
            Stack<Character> stack=new Stack<>();

            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(stack.isEmpty()){
                    stack.push(c);
                    continue;
                }
                if(c=='(' && stack.peek()=='('){
                    stack.push(c);
                }else if(c=='(' && stack.peek()==')'){
                    stack.push(c);
                }else if(c==')' && stack.peek()=='('){
                    stack.pop();

                }else if(c==')' && stack.peek()==')'){
                    stack.push(c);
                }
            }
            sb.append(stack.size()/2+"\n");
            
        }
        System.out.println(sb.toString());

    }
}
