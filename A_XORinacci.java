
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_XORinacci {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            // int[] arr = new int[3];
            // for (int i = 0; i < 4; i++) {
            // arr[i] = Integer.parseInt(s[i]);
            // }
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);
            if (n % 3 == 0) {
                sb.append(a + "\n");
            } else if (n % 3 == 1) {
                sb.append(b + "\n");

            } else {
                sb.append((b ^ a) + "\n");
            }

        }
        System.out.println(sb);

    }
}
