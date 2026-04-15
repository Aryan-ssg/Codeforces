
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Line_Trip {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);

            input = br.readLine();
            s = input.split(" ");

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int max=arr[0];
            for(int i=0;i<n-1;i++){
                max=Math.max(arr[i+1]-arr[i],max);
            }
            max=Math.max(2*(k-arr[n-1]),max);
            sb.append(max+"\n");
        }
        System.out.println(sb.toString());
    }
}
