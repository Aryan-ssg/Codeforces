
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class cloningToys {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        // int[] arr = new int[2];
        // for (int i = 0; i < 2; i++) {
        // arr[i] = Integer.parseInt(s[i]);
        // }
        int c = Integer.parseInt(s[0]);
        int o = Integer.parseInt(s[1]);
        // o=1 c!=0 no
        if (o == 1 && c != 0) {
            System.out.println("NO");
        } else {
            if (c >= o - 1 && (c - (o - 1)) % 2 == 0 && o > 0) {

                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
