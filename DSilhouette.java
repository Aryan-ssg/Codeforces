import java.io.*;
import java.util.*;

public class DSilhouette {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int tc = nextInt();
        StringBuilder sb = new StringBuilder();

        while (tc-- > 0) {
            int n = nextInt();
            long[] b = new long[n];
            for (int i = 0; i < n; i++)
                b[i] = nextLong();

            TreeMap<Long, Integer> freq = new TreeMap<>();
            for (long val : b)
                freq.put(val, freq.getOrDefault(val, 0) + 1);

            if (!freq.containsKey(0L)) {
                sb.append("-1\n");
                continue;
            }

            if (freq.size() == 1) {
              
                for (int i = 0; i < n; i++) {
                    if (i > 0)
                        sb.append(" ");
                    sb.append("1");
                }
                sb.append("\n");
                continue;
            }

            List<Long> keys = new ArrayList<>(freq.keySet());
            int m = keys.size();
            long[] v = new long[m];
            boolean possible = true;

            for (int i = 0; i < m - 1; i++) {
                long diff = keys.get(i + 1) - keys.get(i);
                int cnt = freq.get(keys.get(i));

                if (diff % cnt != 0) {
                    possible = false;
                    break;
                }
                long vi = diff / cnt;
                if (vi <= 0 || (i > 0 && vi <= v[i - 1])) {
                    possible = false;
                    break;
                }
                v[i] = vi;
            }

            if (!possible) {
                sb.append("-1\n");
                continue;
            }

            v[m - 1] = v[m - 2] + 1;
            HashMap<Long, Long> map = new HashMap<>();
            for (int i = 0; i < m; i++)
                map.put(keys.get(i), v[i]);

            for (int i = 0; i < n; i++) {
                if (i > 0)
                    sb.append(" ");
                sb.append(map.get(b[i]));
            }
            sb.append("\n");
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