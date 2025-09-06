import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {

    public static Scanner ip = new Scanner(System.in);

    public static boolean check(long num) {
        int cnt = 0;
        while (num > 0) {
            long a = num % 10;
            num /= 10;
            if (a == 4 || a == 7) {
                cnt++;
            }
        }
        return cnt == 4 || cnt == 7;
    }

    public static void main(String[] args) {
        long num = ip.nextLong();
        if (check(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
