
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class B_No_Casino_in_the_Mountains {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        // arr[i] = Integer.parseInt(s[i]);
        // }
        for (int q = 0; q < tc; q++) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            input = br.readLine();
            s = input.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int noh = 0;

            for (int i = 0; i < n; i++) {

                if(arr[i]==1 && (i + 1) % (k + 1) != 0){
                    break;
                }
                if ((i + 1) % (k + 1) == 0 ) {
                    noh++;
                    
                }
                

            }
            sb.append(noh + "\n");

        }
        System.out.println(sb);

    }
}
