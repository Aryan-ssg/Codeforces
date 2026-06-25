
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BRemiliaPlaysSoku {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            String input = br.readLine();
            String[] s = input.split(" ");

            long n = Long.parseLong(s[0]);
            long x1 = Long.parseLong(s[1]);
            long x2 = Long.parseLong(s[2]);
            long k = Long.parseLong(s[3]);

            long mindiff = Math.abs(x1 - x2);

            if (n == 2 || n == 3) {
                sb.append("1\n");
            } else {
                if (mindiff > n / 2) {
                    mindiff = n - mindiff;
                }

                long mintime = mindiff + k;
                sb.append(mintime + "\n");
            }

        }
        System.out.println(sb.toString());
    }
}
