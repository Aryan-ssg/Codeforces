
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Collatz_Conjecture {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int k=Integer.parseInt(s[0]);
            int x=Integer.parseInt(s[1]);

            for(int i=0;i<k;i++){
                x=x*2;
            }
            sb.append(x).append("\n");
            

        }
        System.out.println(sb);

    }
}
