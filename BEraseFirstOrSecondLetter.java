
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BEraseFirstOrSecondLetter {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            boolean[] arr = new boolean[26];
            
            long ans = 0;
            int distinct = 0;
            for (int i = n - 1; i >= 0; i--) {
                int ind = s.charAt(i) - 'a';

                if (arr[ind] == false) {
                    arr[ind] = true;
                    distinct++;
                }

                ans += distinct;
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb.toString());

    }
}
