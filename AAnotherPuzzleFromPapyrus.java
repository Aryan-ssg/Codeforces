
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class AAnotherPuzzleFromPapyrus {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {
            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int c = Integer.parseInt(s[1]);
            input = br.readLine();
            s = input.split(" ");

            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(s[i]);
            }
            input = br.readLine();
            s = input.split(" ");

            int[] arr2 = new int[n];
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(s[i]);
            }
            int order = Integer.MAX_VALUE;
            int noreorder = Integer.MAX_VALUE;

            int diff = 0;
            boolean allgreater = true;
            for (int i = 0; i < n; i++) {
                if (arr1[i] >= arr2[i]) {
                    diff += arr1[i] - arr2[i];
                } else {
                    allgreater = false;
                    break;

                }

            }

            if (allgreater == true) {
                noreorder = diff;
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            diff = 0;
            allgreater = true;
            for (int i = 0; i < n; i++) {
                if (arr1[i] >= arr2[i]) {
                    diff += arr1[i] - arr2[i];
                } else {
                    allgreater = false;
                    break;

                }

            }
            if(allgreater){
                order=diff+c;
            }
            if (noreorder == Integer.MAX_VALUE && order == Integer.MAX_VALUE) {
                sb.append("-1\n");

            } else {
                sb.append(Math.min(order,noreorder)+"\n");
            }

        }
        System.out.println(sb.toString());

    }
}
