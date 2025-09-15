/* @author @nhhoang14 */

import java.util.*;

public class J01014_UocSoNguyenToLonNhat {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while (tc-- > 0) {
            long n = ip.nextLong();
            long res = 0;
            for (long i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    res = i;
                    n /= i;
                }
            }
            if (n > 1)  res = n;
            System.out.println(res);
        }
    }
}
