/* @author @nhhoang14 */

import java.util.*;

public class JKT013_SoLocPhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.offer("6");
            q.offer("8");
            ArrayList<String> ds = new ArrayList<>();
            while (!q.isEmpty()) {
                String tmp = q.poll();
                if (tmp.length() <= n) {
                    ds.add(tmp);
                } else {
                    break;
                }
                q.offer(tmp + "6");
                q.offer(tmp + "8");
            }
            Collections.reverse(ds);
            System.out.println(ds.size());
            ds.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }
    }
}
