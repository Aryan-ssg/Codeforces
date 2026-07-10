
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BYuuKoitoAndMinimumAbsoluteSum {
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

            if(arr[0]==-1 && arr[n-1]==-1){
                arr[0]=0;
                arr[n-1]=0;
            }
            else if(arr[0]==-1 ){
                arr[0]=arr[n-1];
            }else if(arr[n-1]==-1){
                arr[n-1]=arr[0];
            }

            for(int i=0;i<n;i++){
                if(arr[i]==-1){
                    arr[i]=0;
                }
               
            }
            int ans=0;
            for(int i=0;i<n-1;i++){
                ans+=arr[i+1]-arr[i];
            }
            sb.append(Math.abs(ans)+"\n");

            for(int i=0;i<n;i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
}
