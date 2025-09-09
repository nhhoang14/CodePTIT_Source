import java.util.Scanner;
import java.math.BigInteger;

public class J03013_HieuSoNguyenLon1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while (tc-- > 0) {
            BigInteger a = ip.nextBigInteger();
            BigInteger b = ip.nextBigInteger();
            BigInteger c = a.subtract(b).abs();

            StringBuilder sb = new StringBuilder(c.toString());
            int maxLen = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < maxLen) {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
    }
}
