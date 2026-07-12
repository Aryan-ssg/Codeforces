import java.io.*;
import java.util.*;

public class DAnAlternativeWay {

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

    public static void main(String[] args) throws Exception {

        int tc = nextInt();
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {

            int n = nextInt();

            long[] arr1 = new long[n];
            long[] arr2 = new long[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = nextLong();

            }
            for (int i = 0; i < n; i++) {
                arr2[i] = nextLong();
            }

            for (int i = n - 1; i > 0; i--) {
                if (arr1[i] <= arr2[i])
                    continue;

                long diff=arr1[i]-arr2[i];
                arr1[i]-=diff;
                arr1[i-1]+=diff;

            }

            if(arr1[0]<=arr2[0]){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }

        }

        System.out.print(sb);
    }
}