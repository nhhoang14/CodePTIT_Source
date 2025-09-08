import java.util.Scanner;

public class J03007_SoDep2 {

    public static boolean check(String s) {
        int len = s.length();
        int end = len / 2 + 1;
        long sum = 0;
        for (int i = 0; i <= end; i++) {
            long kt = s.charAt(i) - '0';
            if (i == 0 && kt != 8) {
                return false;
            }
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
            sum += kt;
            if (i == end) {
                if (len % 2 == 0) {
                    sum -= 2 * kt;
                } else {
                    sum -= kt;
                }
            }
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
