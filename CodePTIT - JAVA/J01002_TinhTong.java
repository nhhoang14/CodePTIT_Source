/* @author @nhhoang14 */

import java.util.Scanner;

public class J01002_TinhTong {

    public static Scanner ip = new Scanner(System.in);

    public static void testcase() {
        long n = ip.nextLong();
        long res = (n + 1) * n / 2;
        System.out.println(res);
    }

    public static void main(String[] args) {
        int tc = ip.nextInt();
        while (tc-- > 0) {
            testcase();
        }
    }
}
