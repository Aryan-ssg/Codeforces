
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BMakeItIncreasing {
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

            int op = 0;
            for (int i = n - 1; i > 0; i--) {
                if (arr[i - 1] >= arr[i]) {
                    while (arr[i - 1] >= arr[i] && arr[i - 1] != 0 && arr[i] != 0) {
                        arr[i - 1] = arr[i - 1] / 2;
                        op++;
                    }
                }
            }

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    op = -1;
                    break;
                }
            }
            sb.append(op + "\n");

        }
        System.out.println(sb.toString());

    }
}
