/* @author @nhhoang14 */

import java.util.Scanner;

public class J03032_DaoTu {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine();
            String[] res = s.split("\\s");
            for (String x : res) {
                x = new StringBuilder(x).reverse().toString();
                System.out.printf("%s ", x);
            }
            System.out.println("");
        }
    }
}
