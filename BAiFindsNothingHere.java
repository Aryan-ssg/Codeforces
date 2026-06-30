
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class BAiFindsNothingHere {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long MOD=998244353l;
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");

            long n = Long.parseLong(s[0]);
            long m = Long.parseLong(s[1]);
            long r = Long.parseLong(s[2]);
            long c = Long.parseLong(s[3]);

            // Math.pow(2,m*n-((m-c+1)*(n-r+1)));
            long base=2;
            long num=m*n-((m-c+1)*(n-r+1));
            long ans=1;
            while(num>0){

                if((num & 1)==1){
                    ans=(ans*base) % MOD;
                }
                base=(base*base) % MOD;
                num= num >>1;
        
            }
            sb.append(ans+"\n");





        }
        System.out.println(sb.toString());
    }
}
