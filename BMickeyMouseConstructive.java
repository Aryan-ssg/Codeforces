import java.io.*;
import java.util.*;

public class BMickeyMouseConstructive {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int tc = nextInt();
        StringBuilder sb = new StringBuilder();
        // int[] spf = smallestPrimeFactor(200001);

        while (tc-- > 0) {

            int x = nextInt();
            int y = nextInt();
            int[] arr = new int[x + y];
            for (int i = 0; i < x; i++) {
                arr[i] = 1;
            }
            for (int i = x; i < x + y; i++) {
                arr[i] = -1;
            }
            int diff = Math.abs(x - y);

            if (diff == 0) {
                sb.append(1 + "\n");
            } else {

                // int divisors = countDivisors(diff, spf);
                int divisors = 0;
                for (int i = 1; i * i <= diff; i++) {
                    if (diff % i == 0) {
                        if (i * i == diff) {
                            divisors ++;

                        } else {
                            divisors+=2;
                        }

                    }
                }
                sb.append(divisors + "\n");
            }
            for (int i = 0; i < x + y; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");

            // long[] prefix = new long[x + y];
            // long[] suffix = new long[x + y];

            // long prefixsum = 0;
            // long suffixsum = 0;
            // for (int i = 0; i < x + y; i++) {
            // prefixsum += arr[i];
            // prefix[i] = prefixsum;
            // }
            // for (int i = x + y-1; i >= 0; i--) {
            // suffixsum += arr[i];
            // suffix[i] = suffixsum;
            // }

            // long equal = 0;
            // for (int i = 0; i < x + y - 1; i++) {
            // if (prefix[i] == suffix[i + 1]) {
            // equal++;
            // }
            // }

            // long ans = modPow(2, equal, 676767677l);

            // sb.append(ans + "\n");
            // for (int i = 0; i < x + y; i++) {
            // sb.append(arr[i]+" ");
            // }
            // sb.append("\n");

        }

        System.out.print(sb);
    }

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

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    static long lcm(long a, long b) {
        return Math.abs(a / gcd(a, b) * b);
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

    static long modAdd(long a, long b, long mod) {
        return ((a % mod) + (b % mod)) % mod;
    }

    static long modSub(long a, long b, long mod) {
        return ((a % mod) - (b % mod) + mod) % mod;
    }

    static long modMul(long a, long b, long mod) {
        return ((a % mod) * (b % mod)) % mod;
    }

    static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0)
            isPrime[0] = false;
        if (n >= 1)
            isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }

        return isPrime;
    }

    static int[] smallestPrimeFactor(int n) {
        int[] spf = new int[n + 1];

        for (int i = 0; i <= n; i++)
            spf[i] = i;

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j)
                        spf[j] = i;
                }
            }
        }

        return spf;
    }

    static List<Integer> primeFactors(int n, int[] spf) {
        List<Integer> factors = new ArrayList<>();

        while (n > 1) {
            factors.add(spf[n]);
            n /= spf[n];
        }

        return factors;
    }

    static List<Integer> divisors(int n) {
        List<Integer> divs = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divs.add(i);

                if (i != n / i)
                    divs.add(n / i);
            }
        }

        Collections.sort(divs);
        return divs;
    }

    static int countDivisors(int n, int[] spf) {
        int ans = 1;

        while (n > 1) {
            int prime = spf[n];
            int cnt = 0;

            while (n > 1 && spf[n] == prime) {
                cnt++;
                n /= prime;
            }

            ans *= (cnt + 1);
        }

        return ans;
    }

    static int phi(int n, int[] spf) {
        int result = n;

        while (n > 1) {
            int prime = spf[n];
            result -= result / prime;

            while (n > 1 && spf[n] == prime)
                n /= prime;
        }

        return result;
    }
}