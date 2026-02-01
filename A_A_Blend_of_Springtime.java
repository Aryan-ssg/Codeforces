
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_A_Blend_of_Springtime {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        char[] s = input.toCharArray();
        int trig = 0;
        for (int i = 0; i < s.length - 2; i++) {
            if (s[i] == '.' || s[i + 1] == '.' || s[i + 2] == '.') {
                continue;
            }
            if (s[i + 1] != s[i] && s[i + 2] != s[i + 1] && s[i] != s[i + 2]) {
                System.out.println("Yes");
                trig = 1;
                break;
            }
        }
        if (trig == 0) {
            System.out.println("No");
        }

    }
}
