/* @author @nhhoang14 */

import java.util.*;

public class J01021_TichLuyThua {

    public static long Pow(long a, long b) {
        long res = 1;
        long MOD = 1000000007;
        a %= MOD;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] tmp = sc.nextLine().trim().split("\\s+");
            long a = Long.parseLong(tmp[0]);
            long b = Long.parseLong(tmp[1]);
            if (a == b && a == 0) {
                break;
            }
            System.out.println(Pow(a, b));
        }
    }
}
