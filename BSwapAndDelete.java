
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BSwapAndDelete {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            char[] arr = input.toCharArray();

            int zero = 0;
            int one = 0;

            for (char c : arr) {
                if (c == '1') {
                    one++;
                } else if (c == '0') {
                    zero++;
                }
            }

            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '1' && zero > 0) {
                    count++;
                    zero--;
                } else if (arr[i] == '0' && one > 0) {
                    count++;
                    one--;

                } else {
                    break;
                }
            }
            sb.append(arr.length-count+"\n");

        }
        System.out.println(sb.toString());

    }
}
