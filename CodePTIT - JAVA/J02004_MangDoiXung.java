/* @author @nhhoang14 */

import java.util.Scanner;

public class J02004_MangDoiXung {

    public static Scanner ip = new Scanner(System.in);

    public static boolean check(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int tc = ip.nextInt();
        while (tc-- > 0) {
            int n = ip.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = ip.nextInt();
            }
            if (check(arr)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
