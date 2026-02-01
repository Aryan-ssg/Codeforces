
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_Your_Name {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            String[] s = input.split(" ");
            String a=s[0];
            String b=s[1];
            char[] a1=a.toCharArray();
            char[] b1=b.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(b1);

            a=new String(a1);
            b=new String(b1);

            if(a.compareTo(b)==0){
                sb.append("YES\n");
            }else{sb.append("NO\n");}
            

        }
        System.out.println(sb);
    }

}
