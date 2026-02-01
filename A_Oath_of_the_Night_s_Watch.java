
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Oath_of_the_Night_s_Watch {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        int min = arr[0];
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int cmin = 0;
        int cmax = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                cmin++;
            }
            if (arr[i] == max) {
                cmax++;
            }

        }
        // int result=(n-cmin-cmax>=0)? n-cmin-cmax:0;
        if (min == max) {
            System.out.println(0);
        } else {
            System.out.println(n - cmin - cmax);
        }

    }
}
