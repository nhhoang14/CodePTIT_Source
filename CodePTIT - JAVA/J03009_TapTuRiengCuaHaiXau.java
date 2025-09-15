/* @author @nhhoang14 */

import java.util.Scanner;
import java.util.Arrays;

public class J03009_TapTuRiengCuaHaiXau {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String a = ip.nextLine();
            String b = ip.nextLine();
            StringBuilder sb = new StringBuilder();
            String[] s1 = a.split("\\s");
            String[] s2 = b.split("\\s");
            Arrays.sort(s1);
            for (String c1 : s1) {
                boolean check = true;
                for (String c2 : s2) {
                    if (c1.equals(c2)) {
                        check = false;
                        break;
                    }
                }
                if (check && !sb.toString().contains(c1)) {
                    sb.append(c1).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
