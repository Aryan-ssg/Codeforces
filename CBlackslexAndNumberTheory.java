
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class CBlackslexAndNumberTheory {
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
            int smallest=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                smallest=Math.min(smallest,arr[i]);
            }

            boolean flag=false;
            int divisor=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]==smallest) continue;

                if((arr[i]-smallest)<=smallest){
                    flag=true;
                    break;
                } else{
                    divisor=Math.min(arr[i]-smallest,divisor);
                }
            }

            if(flag){
                sb.append(smallest+"\n");
            }else{
                sb.append(divisor+"\n");
            }





        }
        System.out.println(sb.toString());
        
    }
}
