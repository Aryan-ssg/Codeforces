
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class A_Palindrome_Dance {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String[] s = input.split(" ");
        int n = Integer.parseInt(s[0]);
        int cw = Integer.parseInt(s[1]);
        int cb = Integer.parseInt(s[2]);
        input = br.readLine();
        s = input.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int cost = 0;
        for (int i = 0; i < n / 2; i++) {
            int left = arr[i];
            int right = arr[n - i - 1];
            if (left == right && left != 2) {
                continue;
            } else if (left == right && left == 2) {
                cost += Math.min(cw, cb) * 2;
                
            } else if (Math.max(left, right) == 1 && Math.min(left, right) == 0) {
                cost=-1;
                break;
            } else if (Math.max(left, right) == 2) {
                if (Math.min(left, right) == 1) {
                    cost += cb;
                } else if (Math.min(left, right) == 0) {
                    cost += cw;
                }
            }
        }
        if(n%2==1 && cost!=-1){
            int num=arr[n/2];
            if(num==2 ){
                cost+=Math.min(cw,cb);

            }
        }
        System.out.println(cost);

    }
}
