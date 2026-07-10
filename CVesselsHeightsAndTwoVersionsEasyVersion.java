
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CVesselsHeightsAndTwoVersionsEasyVersion {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] s = input.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            for (int i = 0; i < n; i++) {
                int[] clock = new int[n];
                int[] cclock = new int[n];
                clock[i] = 0;
                cclock[i] = 0;
                for (int j = i; (j%n) != (((i - 1)+n)%n); j++) {

                    clock[(j + 1) % n] = Math.max(clock[j % n], arr[j % n]);
                }
                for (int j = i; (j + n) % n != ((i + 1)%n); j--) {

                    cclock[(((j -1) % n)+n)%n] = Math.max(cclock[(j + n) % n], arr[(((j -1) % n)+n)%n]);

                }
                long ans = 0;
                for (int j = 0; j < n; j++) {
                    ans += Math.min(clock[j], cclock[j]);
                }
                sb.append(ans + " ");

            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
}
