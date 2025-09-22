/* @author @nhhoang14 */

import java.util.*;
import java.io.File;
import java.io.IOException;

public class J07007_LietKeTuKhacNhau {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> set = new HashSet<>();
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            set.add(s);
        }
        List<String> lst = new ArrayList<>(set);
        Collections.sort(lst);
        StringBuilder sb = new StringBuilder();
        for (String x : lst) {
            sb.append(x).append("\n");
        }
        System.out.print(sb.toString());
    }
}
