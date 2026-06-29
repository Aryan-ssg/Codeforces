
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AAnotherPopcountProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);


            int i=1;
            int ans=0;
            
            while((n/i)>0){
                
                int bits=Math.min(n/i , k);
                ans+=bits;
                n=n-(i*bits);
                i=i*2;
            }

            sb.append(ans+"\n");
        }
        System.out.println(sb.toString());

    }
}
