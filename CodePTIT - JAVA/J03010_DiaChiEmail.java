/* @author @nhhoang14 */

import java.util.Scanner;

public class J03010_DiaChiEmail {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        String[] ds = new String[1005];
        int pos = 0;
        while (tc-- > 0) {
            String s = ip.nextLine().trim().toLowerCase();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length - 1; i++) {
                sb.append(arr[i].charAt(0));
            }
            String tmp = arr[arr.length - 1] + sb.toString();
            int cnt = 0;
            for (int i = 0; i < pos; i++) {
                if (ds[i].startsWith(tmp)) cnt++;
            }
            if (cnt > 0) tmp = tmp + (cnt + 1);
            ds[pos++] = tmp + "@ptit.edu.vn";
        }
        for (int i = 0; i < pos; i++) {
            System.out.println(ds[i]);
        }
    }
}
