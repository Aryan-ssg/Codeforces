
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class prank {
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
        int num = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                count++;
                if (arr[i] == 1000 || arr[i] == 2) {
                    count++;
                }

            }
            if (arr[i] != arr[i - 1] + 1 || i == n - 1) {
                if (count >= 2 && count > num) {
                    num = count;
                    num--;
                }

                count = 0;
            }

        }

        System.out.println(num);

    }
}
