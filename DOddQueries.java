
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class DOddQueries {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);

            input = br.readLine();
            s = input.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int [] sumarr=new int [n];
            sumarr[0]=arr[0];
            for(int i=1;i<n;i++){
                sumarr[i]=sumarr[i-1]+arr[i];
                // System.out.println(sumarr[i]);
            }
            int sum=sumarr[n-1];
            while (q-- > 0) {
                input = br.readLine();
                s = input.split(" ");
                int l = Integer.parseInt(s[0]);
                int r = Integer.parseInt(s[1]);
                int k = Integer.parseInt(s[2]);
                int subarrsum=0;
                
                if(l==1){
                    subarrsum=sumarr[r-1];

                }else{
                    subarrsum=sumarr[r-1]-sumarr[l-2];
                }
                long aftop=((r-l)+1)*(long)k;

                long check=(sum-subarrsum)+aftop;
                if(check%2==0){
                    sb.append("NO\n");
                }else{
                    sb.append("YES\n");
                }

            }

        }
        System.out.println(sb.toString());

    }
}
