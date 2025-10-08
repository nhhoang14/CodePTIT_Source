/* @author @nhhoang14 */

import java.util.*;

public class J02016_BoBaSoPytago {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                a[i] = x * x;
            }
            Arrays.sort(a);
            boolean ok = false;
            for (int i = n - 1; i >= 2; i--) {
                int l = 0, r = i - 1;
                while (l < r) {
                    long sum = a[l] + a[r];
                    if (sum == a[i]) {
                        ok = true;
                        break;
                    }
                    if (sum < a[i])l++; 
                    else r--;
                }
                if (ok) break;
            }
            System.out.println(ok ? "YES" : "NO");
        }

    }
}
