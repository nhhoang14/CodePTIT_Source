/* @author @nhhoang14 */

import java.io.*;
import java.util.*;

public class J02106_MaTranNhiPhan {

    public static void main(String[] args) throws IOException {
        BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(ip.readLine());
        int res = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(ip.readLine());
            int tokens = st.countTokens();
            while (st.hasMoreTokens()) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1) cnt++;
            }
            if (cnt > tokens - cnt) {
                res++;
            }
        }
        System.out.print(res);
    }
}
