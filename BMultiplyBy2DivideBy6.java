
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BMultiplyBy2DivideBy6 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int two = 0;
            int three = 0;

            while (n % 2 == 0 ) {
                n = n / 2;
                two++;
            }
            while (n % 3 == 0 ) {
                n = n / 3;
                three++;
            }
            if (n != 1 || three < two) {
                sb.append(-1 + "\n");
            } else {
                int count = two + (2 * (three - two));

                sb.append(count + "\n");
            }

        }
        System.out.println(sb.toString());

    }
}
