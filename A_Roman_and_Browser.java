
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Roman_and_Browser {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] s = input.split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        //StringBuilder sb = new StringBuilder();
        input = br.readLine();
        s = input.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int most=0;
        for(int b=0;b<n;b++){
            int sum=0;
            for(int i=0;i<n;i++){
                if(i%k!=b%k){
                    sum+=arr[i];

                }
            }
            most=Math.max(most,Math.abs(sum));

        }
        System.out.println(most);
        
        
        


        

    }
}
