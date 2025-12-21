/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07071_TenVietTat {

    static String RutGon(String name) {
        StringBuilder sb = new StringBuilder();
        for (String x : name.split(" ")) {
            sb.append(x.charAt(0)).append(".");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> names = new ArrayList<>();
        while (n-- > 0) {
            names.add(sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String rg = sc.nextLine();
            String pattern = rg.replace(".", "\\.").replace("*", "[A-Z]");
            ArrayList<String> res = new ArrayList<>();

            for (String name : names) {
                if (RutGon(name).matches(pattern)) {
                    res.add(name);
                }
            }
            res.sort((a, b) -> {
                String[] x = a.split(" ");
                String[] y = b.split(" ");
                if (x[x.length - 1].equals(y[y.length - 1])) {
                    return x[0].compareTo(y[0]);
                }
                return x[x.length - 1].compareTo(y[y.length - 1]);
            });

            res.forEach(e -> System.out.println(e));
        }

    }
}
