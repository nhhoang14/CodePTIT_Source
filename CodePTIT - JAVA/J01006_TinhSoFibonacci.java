/* @author @nhhoang14 */

import java.util.Scanner;

public class J01006_TinhSoFibonacci {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while (tc-- > 0) {
            int n = ip.nextInt();
            long f1 = 1, f2 = 1, f3 = 0;
            if (n == 1 || n == 2) {
                System.out.println(1);
                continue;
            }
            for (int i = 3; i <= n; i++) {
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println(f3);
        }
    }
}
