/* @author @nhhoang14 */

import java.util.*;
import static java.lang.Math.*;

public class J01008_PhanTichThuaSoNguyenTo {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        for (int t = 1; t <= tc; t++) {
            System.out.printf("Test %d:", t);
            int n = ip.nextInt();
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    int cnt = 0;
                    while (n % i == 0) {
                        cnt++;
                        n /= i;
                    }
                    System.out.printf(" %d(%d)", i, cnt);
                }
            }
            if (n > 1) {
                System.out.printf(" %d(1)", n);
            }
            System.out.println();
        }
    }
}
