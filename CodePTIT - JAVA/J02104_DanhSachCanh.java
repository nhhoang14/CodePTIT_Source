/* @author @nhhoang14 */

import java.io.*;
import java.util.*;

public class J02104_DanhSachCanh {

    public static void main(String[] args) throws IOException {
        BufferedReader ip = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(ip.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(ip.readLine());
            for (int j = 0; j < n; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1 && j > i) {
                    sb.append("(").append(i + 1).append(",").append(j + 1).append(")\n");
                }
            }
        }
        System.out.print(sb);
    }
}
