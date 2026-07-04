
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BBlackslexAndShowering {
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
            int res = 0;
            for (int i = 0; i < n-1; i++) {
                res+=Math.abs(arr[i]-arr[i+1]);

            }

            int ans = res;
            for (int i = 0; i < n; i++) {
                int a=res;
                if (i == 0) {
                    a -= Math.abs(arr[i] - arr[i + 1]);

                   
                } else if (i == n - 1) {
                    a -= Math.abs(arr[i] - arr[i - 1]);
                 
                } else {
                    a-=Math.abs(arr[i] - arr[i - 1]) + Math.abs(arr[i] - arr[i + 1]);
                    a+=Math.abs(arr[i-1]-arr[i+1]);
                   
                }
                 ans = Math.min(a, ans);
            }
            sb.append(ans+"\n");

        }
        System.out.println(sb.toString());

    }
}
