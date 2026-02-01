
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Trippi_Troppi {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            
            String input = br.readLine();
            String[] s = input.split(" ");
            // int[] arr = new int[4];
            // for (int i = 0; i < 4; i++) {
            // arr[i] = Integer.parseInt(s[i]);
            // }

            for (String word : s) {
                sb.append(word.charAt(0));
            }
            sb.append("\n");

        }
        System.out.println(sb);

    }
}
