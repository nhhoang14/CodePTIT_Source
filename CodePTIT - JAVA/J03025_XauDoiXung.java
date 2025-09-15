/* @author @nhhoang14 */

import java.util.Scanner;

public class J03025_XauDoiXung {

    public static String check(String s) {
        int cnt = 0, len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                cnt++;
            }
        }
        if ((len % 2 == 0 && cnt == 1) || (len % 2 == 1 && cnt <= 1)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine();
            System.out.println(check(s));
        }
    }
}
