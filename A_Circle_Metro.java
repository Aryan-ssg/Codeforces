
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Circle_Metro {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // // int n = Integer.parseInt(br.readLine());
        // StringBuilder sb = new StringBuilder();
        // String input = br.readLine();
        // String[] s = input.split(" ");
        // int[] arr = new int[4];
        // for (int i = 0; i < 4; i++) {
        // arr[i] = Integer.parseInt(s[i]);
        // }

        int n = sc.nextInt(), Dstart = sc.nextInt(), Dfinish = sc.nextInt(), Vstart = sc.nextInt(),
                Vfinish = sc.nextInt();

        int dcurr = Dstart;
        int vcurr = Vstart;
        boolean trig = false;

        while (dcurr != Dfinish && vcurr != Vfinish) {

            dcurr++;
            vcurr--;
            if (dcurr > n) {
                dcurr = 1;
            }
            if (vcurr == 0) {
                vcurr = n;
            }
            if (dcurr == vcurr) {
                System.out.println("YES");
                trig = true;
                break;
            }
        }
        if (trig == false) {
            System.out.println("NO");
        }

    }
}
