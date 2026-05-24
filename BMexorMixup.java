
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BMexorMixup {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int mex = Integer.parseInt(s[0]);
            int xor = Integer.parseInt(s[1]);

            int length = mex;
            int start = 0;
            if ((mex - 1) % 4 == 0) {
                start = mex - 1;
            } else if ((mex - 1) % 4 == 1) {
                start = 1;
            } else if ((mex - 1) % 4 == 2) {
                start = mex;
            } else {
                start = 0;
            }
            if (start == xor) {
                sb.append(length + "\n");
            } else if ((start ^ xor) != mex) {
                sb.append(length + 1 + "\n");

            } else if ((start ^ xor) == mex) {
                sb.append(length + 2 + "\n");

            }

        }
        System.out.println(sb.toString());

    }
}
