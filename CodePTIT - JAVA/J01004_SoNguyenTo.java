/* @author @nhhoang14 */

import java.util.Scanner;

public class J01004_SoNguyenTo {

    public static Scanner ip = new Scanner(System.in);

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        long tc = ip.nextLong();
        while (tc-- > 0) {
            int num = ip.nextInt();
            if (isPrime(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
