/* @author @nhhoang14 */

import java.util.*;

public class J02021_LietKeToHop_2 {

    public static boolean sinh(int[] ds, int n, int k) {
        int i = k - 1;
        while (i >= 0 && ds[i] == n - k + 1 + i) {
            i--;
        }
        if (i < 0) return false;
        ds[i]++;
        for (int j = i + 1; j < k; j++) {
            ds[j] = ds[i] + j - i;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        int[] ds = new int[k];
        for (int i = 0; i < k; i++) {
            ds[i] = i + 1;
        }
        int cnt = 0;
        do {
            cnt++;
            for (int i = 0; i < k; i++) {
                System.out.printf("%d", ds[i]);
            }
            System.out.print(" ");
        } while (sinh(ds, n, k));
        System.out.printf("\nTong cong co %d to hop", cnt);
    }
}
