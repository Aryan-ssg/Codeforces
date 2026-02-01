
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Sublime_Sequence {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int x=Integer.parseInt(s[0]);
            int l=Integer.parseInt(s[1]);

            if(l%2==0){
                sb.append(0);

            }else{
                sb.append(x);
            }
            sb.append("\n");
            
            // int[] arr = new int[4];
            // for (int i = 0; i < 4; i++) {
            //     arr[i] = Integer.parseInt(s[i]);
            // }
        }
        System.out.println(sb);

    }
}
