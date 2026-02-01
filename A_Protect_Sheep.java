
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Protect_Sheep {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] s = input.split(" ");
        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        StringBuilder sb = new StringBuilder();

        char[][] arr = new char[r][c];
        for (int i = 0; i < r; i++) {
            input = br.readLine();

            for (int j = 0; j < c; j++) {
                arr[i][j] = input.charAt(j);

            }

        }
        boolean trig = true;

        for (int i = 0; i < r && trig == true; i++) {

            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 'S') {
                    if (i + 1 <= r - 1 && arr[i + 1][j] == 'W') {
                        trig = false;
                        System.out.println("No");

                        break;

                    } else if (i - 1 >= 0 && arr[i - 1][j] == 'W') {
                        trig = false;
                        System.out.println("No");

                        break;
                    } else if (j + 1 <= c - 1 && arr[i][j + 1] == 'W') {
                        trig = false;
                        System.out.println("No");

                        break;
                    } else if (j - 1 >= 0 && arr[i][j - 1] == 'W') {
                        trig = false;
                        System.out.println("No");

                        break;
                    }
                } else if (arr[i][j] == '.') {
                    arr[i][j] = 'D';
                }
            }
        }

        if (trig) {
            sb.append("Yes\n");
            for (char[] row : arr) {
                for (char col : row) {
                    sb.append(col);
                }
                sb.append("\n");

            }
            System.out.println(sb);

        }

    }
}
