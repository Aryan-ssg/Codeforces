
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Doremy_s_Paint_3 {
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

            int num1 = arr[0];
            int c1 = 0;
            for (int i = 0; i < n; i++) {
                if (num1 == arr[i]) {
                    c1++;
                }
            }
            int num2 = -1;
            int c2 = 0;
            for (int i = 0; i < n; i++) {
                if (num2 == -1 && arr[i] != num1) {
                    num2 = arr[i];

                }
                if (arr[i] == num2) {

                    c2++;
                }
            }
            int k = Math.ceilDiv(n, 2);
            if (c1 == n) {
                sb.append("Yes\n");
            } else if (c1 == k && c2 == n - k) {
                sb.append("Yes\n");
            } else if (c2 == k && c1 == n - k) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }

        }
        System.out.println(sb.toString());

    }
}
