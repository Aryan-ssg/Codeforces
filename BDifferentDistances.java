
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BDifferentDistances {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n=Integer.parseInt(s[0]);
            if(n==2){
                sb.append("1 2 2 1 2 1 1 2");
            }else {
                for(int i=1;i<=n;i++){
                    sb.append(i+" ");
                }
                for(int i=1;i<=n;i++){
                    sb.append(i+" ");
                }
                sb.append(n+" ");
                for(int i=1;i<n;i++){
                    sb.append(i+" ");
                }
                for(int i=1;i<=n;i++){
                    sb.append(i+" ");
                }

                
            }
            sb.append("\n");

        }
        System.out.println(sb.toString());

    }
}
