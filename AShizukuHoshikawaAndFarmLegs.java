
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AShizukuHoshikawaAndFarmLegs {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            if (n % 2 == 0) {
                ans = Math.floorDiv(n, 4) + 1;
            }
            sb.append(ans + "\n");

        }
        System.out.println(sb.toString());
    }
}
