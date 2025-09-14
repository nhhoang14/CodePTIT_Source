import java.util.*;

public class J01013_TongUocSo1 {

    public static final int N = (int) 2e6;
    public static int[] prime = new int[N + 5];

    public static void findMinPrime() {
        for (int i = 2; i <= N; i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
    }

    public static long sumPrime(int n) {
        long res = 0;
        while (n > 1) {
            res += prime[n];
            n /= prime[n];
        }
        return res;
    }

    public static void main(String[] args) {
        findMinPrime();
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = ip.nextInt();
            sum += sumPrime(x);
        }
        System.out.print(sum);
    }
}
