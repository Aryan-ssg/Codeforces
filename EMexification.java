import java.io.*;
import java.util.*;

public class EMexification {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int tc = nextInt();
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            int n = nextInt();
            int k = nextInt();
            int[] arr = new int[n];
            int zerocount = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
                if (arr[i] == 0)
                    zerocount++;

            }
            int[] ans = new int[n];
            if (zerocount == 0) {
                int filler = (k % 2 == 0) ? 1 : 0;

                for (int i = 0; i < n; i++) {
                    ans[i] = filler;
                }

            } else if (zerocount > 0) {
                if (k == 1) {
                    ans = mexfunc(arr, n, new int[n]);
                } else if (k % 2 == 0) {
                    int[] temp = mexfunc(arr, n, new int[n]);
                    ans = mexfunc(temp, n, new int[n]);

                }

                else {
                    int[] temp1 = mexfunc(arr, n, new int[n]);
                    int[] temp2 = mexfunc(temp1, n, new int[n]);

                    ans = mexfunc(temp2, n, new int[n]);

                }

            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += ans[i];
            }
            sb.append(sum + "\n");

        }

        System.out.print(sb);
    }

    static int[] mexfunc(int[] arr, int n, int[] ans) {
        boolean[] occurr = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                occurr[arr[i]] = true;
            }

        }

        int mex = 0;
        for (int i = 0; i < n + 1; i++) {
            if (!occurr[i]) {
                mex = i;
                break;
            }
        }

        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                freq[arr[i]]++;
            }

        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > mex) {
                ans[i] = mex;

            } else {
                if ((freq[arr[i]] - 1) == 0) {
                    ans[i] = arr[i];
                } else {
                    ans[i] = mex;
                }
            }
        }
        return ans;

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