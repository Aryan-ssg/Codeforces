
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CRedBlackPairs {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String a = br.readLine();
            String b = br.readLine();
            // int repaint=0;
            int [] dp=new int[n+1];
            dp[0]=0;
            for(int i=1;i<=n;i++){

                int costV=a.charAt(i-1)==b.charAt(i-1) ? 0:1;
                dp[i]=dp[i-1]+costV;


                if(i>=2){
                    int costH= (a.charAt(i-2)==a.charAt(i-1) ? 0:1) 
                    + (b.charAt(i-2)==b.charAt(i-1) ? 0:1);

                    dp[i]=Math.min(dp[i],dp[i-2]+costH);
                }

            }



            // for (int i = 0; i < n; i++) {
            //     if (i<n-1 && a.charAt(i) == a.charAt(i + 1) && b.charAt(i) == b.charAt(i + 1)) {
            //         i++;
            //     }else if(a.charAt(i)==b.charAt(i)){
            //         continue;
            //     }else{
            //         repaint++;
            //     }

            // }
            sb.append(dp[n]+"\n");
        }
        System.out.println(sb.toString());

    }
}
