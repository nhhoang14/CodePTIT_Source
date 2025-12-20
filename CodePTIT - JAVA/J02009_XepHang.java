/* @author @nhhoang14 */

import java.util.*;

public class J02009_XepHang {

    static class pair {

        public int first, second;

        public pair(int a, int b) {
            first = a;
            second = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<pair> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ds.add(new pair(sc.nextInt(), sc.nextInt()));
        }
        ds.sort((pair x, pair y) -> {
            return x.first - y.first;
        });
        int res = 0;
        for (pair x : ds) {
            if (x.first > res) {
                res = x.first;
            }
            res += x.second;
        }
        System.out.print(res);
    }
}
