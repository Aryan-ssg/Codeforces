
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BCrimsonTriples {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(tc-->0){
            long n = Long.parseLong(br.readLine());
            
            long ans = 0;

            for (long b = 1; b <= n; b++) {
                long multiplesOfB = n / b;
                ans += multiplesOfB * multiplesOfB;

            }
            sb.append(ans+"\n");
        }
        System.out.println(sb.toString());


        

    }
}
