/* @author @nhhoang14 */

import java.util.Scanner;

public class J01017_SoLienKe {

    public static Scanner ip = new Scanner(System.in);

    public static boolean check(long num) {
        long a = num % 10;
        while (num > 10) {
            num /= 10;
            long b = num % 10;
            if (Math.abs(a - b) != 1) {
                return false;
            } else {
                a = b;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int tc = ip.nextInt();
        while (tc-- > 0) {
            long num = ip.nextLong();
            if (check(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
