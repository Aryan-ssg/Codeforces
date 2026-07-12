import java.io.*;
import java.util.*;

public class C0MarAndAlternatingSums {

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

    static long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }
    static long MOD=1000000007;

    public static void main(String[] args) throws Exception {

        int tc = nextInt();
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
             int n = nextInt();

            int[] arr = new int[n];
            TreeMap<Integer, Integer> freq = new TreeMap<>();

            long negatives = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();

                if (arr[i] == -1)
                    negatives++;
                else
                    freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }

            // No -1
            if (negatives == 0) {
                long contri = 0;

                for (int c : freq.values())
                    contri += c - 1;

                sb.append(modPow(2, contri, MOD)).append('\n');
                continue;
            }

            // Compute E
            long contri = 0;
            for (int c : freq.values())
                contri += c - 1;

            // Compute Q
            long pospairs = 0;
            Integer prev = null;

            for (int val : freq.keySet()) {
                if (prev != null && val == prev + 1)
                    pospairs++;
                prev = val;
            }

            long ans = (pospairs + 1) % MOD;
            ans = ans * modPow(2, contri + negatives - 1, MOD) % MOD;

            sb.append(ans).append('\n');


        }

        System.out.print(sb);
    }
}