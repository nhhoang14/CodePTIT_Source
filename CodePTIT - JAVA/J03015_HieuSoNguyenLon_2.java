/* @author @nhhoang14 */

import java.util.Scanner;
import java.math.BigInteger;

public class J03015_HieuSoNguyenLon_2 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        BigInteger a = ip.nextBigInteger();
        BigInteger b = ip.nextBigInteger();
        BigInteger c = a.subtract(b);
        System.out.println(c.toString());
    }
}
