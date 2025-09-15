/* @author @nhhoang14 */

import java.util.Scanner;

public class J01001_HinhChuNhat {

    public static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        int d = ip.nextInt();
        int r = ip.nextInt();
        if (d <= 0 || r <= 0) {
            System.out.print(0);
        } else {
            System.out.print((d + r) * 2 + " " + d * r);
        }
    }
}
