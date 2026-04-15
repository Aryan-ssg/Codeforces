
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Halloumi_Boxes {
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

            if(k>=2 || n==1){
                sb.append("YES\n");
            }else {
                for(int i=0;i<n-1;i++){
                    if(arr[i]>arr[i+1]){
                        sb.append("NO\n");
                        break;
                    }
                    if(i==n-2){
                        sb.append("YES\n");
                    }
                }
            }


        }
        System.out.println(sb.toString());


    }
}
