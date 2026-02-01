
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Left_and_Down {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int x = 0;
            int y = 0;
            int oper = 0;

            while (a != 0 || b != 0) {
                if (a >= k && b >= k) {
                    if (x != k || y != k) {
                        oper++;

                    }

                    a = a - k;
                    b = b - k;

                    x = k;
                    y = k;
                } else if (a >= k && b <= k) {
                    if (x != k || y != b) {
                        oper++;
                    }
                    a = a - k;
                    b = 0;

                    x = k;
                    y = b;
                }else if(a<=k && b<=k){
                    if(x!=a || y!=b){
                        oper++;
                    }
                    a=0;
                    b=0;

                    x=a;
                    y=b;
                }else if(a<=k && b>=k){
                    if(x!=a || x!=k){
                        oper++;
                    }
                    a=0;
                    b=b-k;
                    x=a;
                    y=k;
                }
            }
            sb.append(oper+"\n");

        }
        System.out.println(sb);

    }
}
