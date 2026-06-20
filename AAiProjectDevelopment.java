
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AAiProjectDevelopment {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            long n = Integer.parseInt(s[0]);
            long x = Integer.parseInt(s[1]);
            long y = Integer.parseInt(s[2]);
            long z = Integer.parseInt(s[3]);

            long a = Math.ceilDiv(n, x + y);
            long b = Math.ceilDiv(n - (x * z), x + (10 * y)) + z;
            sb.append(Math.min(a, b) + "\n");
        }
        System.out.println(sb.toString());
    }

}
