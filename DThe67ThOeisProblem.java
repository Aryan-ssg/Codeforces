
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class DThe67ThOeisProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = 110000;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            int n = Integer.parseInt(br.readLine());
            int[] num = new int[n + 1];

            int primes = 0;
            for (int i = 2; i < limit + 1; i++) {

                if (isPrime[i]) {
                    num[primes] = i;
                    primes++;

                }
                if (primes > n)
                    break;
            }

            for (int i = 0; i < n; i++) {
                sb.append(((long) num[i] * num[i + 1]) + " ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
}
