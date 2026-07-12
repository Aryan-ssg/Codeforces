import java.io.*;
import java.util.*;

public class BEzraftAndArray {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return br.readLine();
    }

    static long lcmArray(long[] arr) {
        long ans = 1;
        for (long x : arr) {
            ans = lcm(ans, x);
        }
        return ans;
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws Exception {

        int tc = nextInt();
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            int n = nextInt();

            long[] arr = new long[n];
            if (n == 1) {
                sb.append(1 + "\n");
            } else if (n == 2) {
                sb.append("-1\n");

            } else {
                arr[0] = 1;
                arr[1] = 2;
                arr[2] = 3;

                for (int i = 3; i < n ; i++) {
                    
                    arr[i]=3*(long)Math.pow(2, (i+1)-3);
                }

                
                for (int i = 0; i < n; i++) {
                    sb.append(arr[i]+ " ");
                }
                sb.append("\n");

            }

        }

        System.out.print(sb);
    }
}