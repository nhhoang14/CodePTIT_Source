/* @author @nhhoang14 */

import java.util.*;

public class J02017_ThuGonDaySo {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int x = ip.nextInt();
            if (!st.isEmpty() && (st.peek() + x) % 2 == 0) {
                st.pop();
            } else {
                st.push(x);
            }
        }
        System.out.print(st.size());
    }
}
