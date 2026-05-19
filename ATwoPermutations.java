
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class ATwoPermutations {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);

            if (n == a && n == b) {
                sb.append("Yes\n");
            } else if ((n - (a + b)) > 1) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }

        }
        System.out.println(sb.toString());

    }
}
