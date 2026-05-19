
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AMakeItZero {
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
            if (n % 2 == 0) {
                sb.append("2\n");
                sb.append("1 " + n + "\n");
                sb.append("1 " + n + "\n");

            } else {
                sb.append("4\n");
                sb.append("1 " + n + "\n");
                sb.append("1 " + (n-1) + "\n");
                sb.append((n-1)+" " + n + "\n");
                sb.append((n-1)+" " + n + "\n");


            }


        }
        System.out.println(sb.toString());

    }
}
