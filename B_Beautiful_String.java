
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Beautiful_String {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.charAt(i)-'0';
            }
            int zeroes=0;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    zeroes++;
                    
                }
            }
            sb.append(zeroes).append("\n");
            
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    sb.append(i+1).append(" ");
                    
                }
            }
            sb.append("\n");


        }
        System.out.println(sb);

    }
}

















