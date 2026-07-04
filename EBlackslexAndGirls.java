
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class EBlackslexAndGirls {

    static boolean allzeroes(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                return false;
            }

        }
        return true;

    } 

    static boolean allones(String s){
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                return false;
            }

        }
        return true;


    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-- > 0) {

            String input = br.readLine();
            String[] s = input.split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            int y = Integer.parseInt(s[2]);
            String binary = br.readLine();
            input = br.readLine();
            s = input.split(" ");

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            int[] a = new int[n];
            int[] b = new int[n];
         
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            if ((x + y) >= sum) {
                int sumA = 0;
                int sumB = 0;
                for (int i = 0; i < n; i++) {
                    if (binary.charAt(i) == '0') {
                        a[i] = (int) Math.floor(arr[i] / 2) + 1;
                        sumA += a[i];
                    } else {
                        b[i] = (int) Math.floor(arr[i] / 2) + 1;
                        sumB += b[i];
                    }
                }

                if (sumA <= x && sumB <= y) {
                    if (allzeroes(binary)) {
                        if (x >= (y + n)) {
                            sb.append("YES\n");
                        } else {
                            sb.append("NO\n");
                        }
                    } else if (allones(binary)) {
                        if (y >= (x + n)) {
                            sb.append("Yes\n");

                        } else {
                            sb.append("NO\n");
                        }
                    }else{
                        sb.append("YES\n");
                    }

                }else{
                    sb.append("NO\n");
                }

            } else {
                sb.append("NO\n");
            }

        }
        System.out.println(sb.toString());

    }
}
