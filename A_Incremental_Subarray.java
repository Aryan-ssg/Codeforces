
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Incremental_Subarray {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            input = br.readLine();
            s = input.split(" ");
            int[] arrm = new int[m];
            for (int i = 0; i < m; i++) {
                arrm[i] = Integer.parseInt(s[i]);
            }
            int ans = 0;
            for (int i = 0; i < arrm.length - 1; i++) {
                if (arrm[i] >= arrm[i + 1]) {
                    ans = 1;
                    break;
                }
            }

            if (ans != 1) {
                ans = n - arrm[m - 1] + 1;
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb);

    }
}
