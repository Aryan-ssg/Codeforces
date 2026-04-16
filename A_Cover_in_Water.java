
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Cover_in_Water {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            // String[] s = input.split(" ");
            // int[] arr = new int[4];
            // for (int i = 0; i < 4; i++) {
            // arr[i] = Integer.parseInt(s[i]);
            // }
            int consec = 0;
            int ans = 0;
            for (char i : input.toCharArray()) {
                if (i == '.') {
                    consec++;
                } else {
                    if (consec < 3) {
                        ans += consec;
                    }
                    consec = 0;
                }
                if (consec >= 3) {
                    ans = 2;
                    break;
                }
            }
            if(consec>0 && consec<3){
                ans+=consec;
            }
            sb.append(ans + "\n");

        }
        System.out.println(sb.toString());

    }
}
