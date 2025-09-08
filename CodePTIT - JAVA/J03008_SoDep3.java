import java.util.Scanner;

public class J03008_SoDep3 {

    public static boolean check(String s) {
        int len = s.length();
        int end = len / 2 + 1;
        for (int i = 0; i <= end; i++) {
            long kt = s.charAt(i) - '0';
            if (kt != 2 && kt != 3 && kt != 5 && kt != 7) {
                return false;
            }
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
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