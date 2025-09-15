/* @author @nhhoang14 */

import java.util.Scanner;

public class J01024_SoTamPhan {

    public static boolean check(int n) {
        while (n > 0) {
            int a = n % 10;
            if (a != 0 && a != 1 && a != 2) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while (tc-- > 0) {
            int n = ip.nextInt();
            if (check(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
