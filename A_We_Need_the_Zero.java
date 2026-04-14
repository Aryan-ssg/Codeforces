
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_We_Need_the_Zero {
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
            int[] temp = new int[n];
            int ans = -1;
            for (int i = 0; i < 256; i++) {
                for (int j = 0; j < n; j++) {
                    temp[j] = arr[j] ^ i;
                }
                int xor = 0;
                for (int j = 0; j < n; j++) {
                    xor = xor ^ temp[j];
                }
                if (xor == 0) {
                    ans = i;
                    break;
                }

            }
            sb.append(ans + "\n");

        }
        System.out.println(sb.toString());
    }
}
