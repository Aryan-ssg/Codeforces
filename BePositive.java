
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BePositive {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] a = s.split(" ");

        int cv = (int) Math.ceil((double) n / 2);

        int pi = 0;
        int ni = 0;
        for (int i = 0; i < n; i++) {

            if (Integer.parseInt(a[i]) > 0) {
                pi++;
            } else if (Integer.parseInt(a[i]) < 0) {
                ni++;
            }
        }

        if (pi >= cv) {

            System.out.println(2);
        } else if (ni >= cv) {
            System.out.println(-2);

        } else {
            System.out.println(0);
        }

    }

}
