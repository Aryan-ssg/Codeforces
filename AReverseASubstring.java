
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AReverseASubstring {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) > input.charAt(i + 1)) {
                sb.append("YES\n");
                sb.append((i + 1) + " " + (i + 2) + "\n");
                break;
            }
            if (i == input.length() - 2) {
                sb.append("NO\n");
            }

        }
        System.out.println(sb.toString());

    }
}
