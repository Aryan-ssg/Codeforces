
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Unconventional_Pairs {
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

            Arrays.sort(arr);
            int maxdiff=0;
            for(int i=0;i<n-1;i+=2){
                if(arr[i+1]-arr[i]>maxdiff){
                    maxdiff=arr[i+1]-arr[i];
                }

            }
            sb.append(maxdiff).append("\n");

        }
        System.out.println(sb);

    }
}
