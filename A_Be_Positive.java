
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Be_Positive {
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
            int oper=0;
            int mone=0;
            int zeroes=0;           
            for(int i=0;i<n;i++){
                if(arr[i]==-1){
                    mone++;
                }else if(arr[i]==0){
                    zeroes++;
                }
            }
            if(mone%2!=0){
                oper+=2;
            }
            oper+=zeroes;

            sb.append(oper).append("\n");
        }
        System.out.println(sb);

    }
}
