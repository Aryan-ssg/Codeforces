
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class C1RenakoAmaoriAndXorGameEasyVersion {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String input = br.readLine();
            String[] s = input.split(" ");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(s[i]);
            }
            input = br.readLine();
            s = input.split(" ");
            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(s[i]);
            }
            int totalxor=0;
            for(int i=0;i<n;i++){
                totalxor^=arr1[i];
                totalxor^=arr2[i];

            }
            if(totalxor==0){
                sb.append("Tie\n");
            }else{

                for(int i=n-1;i>=0;i--){
                    if(arr1[i]!=arr2[i]){
                        if(i%2==0){
                            sb.append("Ajisai\n");
                        }else{
                            sb.append("Mai\n");
                        }
                        break;
                    }
                }
            }
            

        }
        System.out.println(sb.toString());

    }
}
