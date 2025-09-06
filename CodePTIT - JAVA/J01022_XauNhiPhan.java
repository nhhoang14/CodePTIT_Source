import java.util.Scanner;

public class J01022_XauNhiPhan {

    static long[] len = new long[93];

    static char find(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= len[n - 2]) {
            return find(n - 2, k);
        } else {
            return find(n - 1, k - len[n - 2]);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        len[1] = 1;
        len[2] = 1;
        for (int i = 3; i <= 92; i++) {
            len[i] = len[i - 2] + len[i - 1];
        }

        int tc = ip.nextInt();
        while (tc-- > 0) {
            int n = ip.nextInt();
            long k = ip.nextLong();
            System.out.println(find(n, k));
        }
    }

}
