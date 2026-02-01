
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Ehab_Fails_to_Be_Thanos {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int count = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                sum1 += arr[i];
            }
            if (i >= arr.length / 2) {
                sum2 += arr[i];
            }
            if (arr[0] == arr[i]) {
                count++;
            }
        }
        if (count == arr.length) {
            System.out.println(-1);
        } else {
            if (sum1 != sum2) {
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i] + " ");
                }
                System.out.println(sb);

            } else {
                boolean trig = false;
                for (int i = 0; i < arr.length / 2 && trig == false; i++) {
                    for (int j = arr.length / 2; j < arr.length; j++) {
                        if (arr[i] != arr[j]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            trig = true;
                            break;

                        }
                    }
                }
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i] + " ");
                }
                System.out.println(sb);

            }

        }

    }
}
