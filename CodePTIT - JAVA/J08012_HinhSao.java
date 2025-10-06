/* @author @nhhoang14 */

import java.util.*;

public class J08012_HinhSao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dsCanh = new int[n + 1];
        for (int i = 1; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            dsCanh[u]++;
            dsCanh[v]++;
        }
        boolean found = true;
        for (int i = 1; i <= n; i++) {
            if (dsCanh[i] != 1 && dsCanh[i] != n - 1) {
                found = false;
                break;
            }
        }
        System.out.print(found ? "Yes" : "No");
    }
}
