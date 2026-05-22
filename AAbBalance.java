
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AAbBalance {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String s = br.readLine();
            int n = s.length();
            int ab = 0;
            int ba = 0;
            int minab = Integer.MAX_VALUE;
            int minba = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
                    ab++;
                    if (minab == Integer.MAX_VALUE) {
                        minab = i;
                    }

                }

                if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'a') {
                    ba++;
                    if (minba == Integer.MAX_VALUE) {
                        minba = i;
                    }

                }
            }
            if (ab == ba) {
                sb.append(s + "\n");
            } else {
                char[] arr = s.toCharArray();
                if(arr[0]=='a'){
                    arr[n-1]='a';
                }else{
                    arr[n-1]='b';
                }
                String str=new String(arr);
                sb.append(str+"\n");
            }


        }
        System.out.println(sb.toString());

    }
}
