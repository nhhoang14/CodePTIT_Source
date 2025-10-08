/* @author @nhhoang14 */

import java.util.*;

public class J02034_BoSungDaySo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ds = new int[201];
        int n = Integer.parseInt(sc.nextLine());
        int maxx = 0;
        while (n > 0) {
            String[] lines = sc.nextLine().split("\\s+");
            n -= lines.length;
            for (String x : lines) {
                int num = Integer.parseInt(x);
                ds[num] = 1;
                maxx = Math.max(maxx, num);
            }
        }
        boolean ok = true;
        for (int i = 1; i < maxx; i++) {
            if (ds[i] == 0) {
                System.out.println(i);
                ok = false;
            }
        }
        if(ok) System.out.print("Excellent!");
    }
}
