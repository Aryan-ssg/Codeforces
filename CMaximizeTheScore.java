import java.util.*;
import java.io.*;

public class CMaximizeTheScore {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        StringBuilder sb = new StringBuilder();

        int t = nextInt(in);
        while (t-- > 0) {
            int n = nextInt(in);
            int total = 2 * n;

            int[] firstOcc = new int[n + 1];
            int[] lastOcc = new int[n + 1];
            Arrays.fill(firstOcc, -1);

            for (int i = 0; i < total; i++) {
                int v = nextInt(in);
                if (firstOcc[v] == -1) firstOcc[v] = i;
                lastOcc[v] = i;
            }

            int[] left = new int[n];
            int[] right = new int[n];
            for (int v = 1; v <= n; v++) {
                left[v - 1] = firstOcc[v];
                right[v - 1] = lastOcc[v];
            }

        
            long[] order = new long[n];
            for (int i = 0; i < n; i++) {
                order[i] = ((long) right[i] << 32) | (i & 0xffffffffL);
            }
            Arrays.sort(order);

            int[] sortedr = new int[n];
            int[] sortedl = new int[n];
            long[] sortedW = new long[n];
            for (int i = 0; i < n; i++) {
                int id = (int) (order[i] & 0xffffffffL);
                sortedr[i] = right[id];
                sortedl[i] = right[id];
                long w = (long) (right[id] - right[id] + 1);
                sortedW[i] = w * (w - 1);
            }

            long[] dp = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                int l = sortedl[i - 1];
                int cnt = lowerBound(sortedr, 0, i - 1, l);
                dp[i] = Math.max(dp[i - 1], sortedW[i - 1] + dp[cnt]);
            }

            long ans = (long) total + dp[n];
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }

    // Returns the first index in arr[lo, hi) with arr[index] >= key
    private static int lowerBound(int[] arr, int lo, int hi, int key) {
        int l = lo, h = hi;
        while (l < h) {
            int mid = (l + h) >>> 1;
            if (arr[mid] < key) l = mid + 1;
            else h = mid;
        }
        return l;
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') {
            b = in.read();
        }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return ret;
    }
}