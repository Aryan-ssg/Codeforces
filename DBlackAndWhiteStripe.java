
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class DBlackAndWhiteStripe {
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

            input =br.readLine();
            // System.out.println(input);

            char[] arr = input.toCharArray();

            int white=0;
            int black=0;
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<=n-k;i++){
                if(i==0){
                    for(int j=0;j<k;j++){
                        if(arr[j]=='B'){
                            black++;
                        }else{
                            white++;
                        }
                    }
                }else{
                    if(arr[i-1]=='B'){
                        black--;
                    }else{
                        white--;
                    }

                    if(arr[i+k-1]=='B'){
                        black++;
                    }else{
                        white++;
                    }
                }
                ans=Math.min(ans, white);
                // System.out.println(white);
            }
            sb.append(ans+"\n");
            

        }
        System.out.println(sb.toString());

    }
}
