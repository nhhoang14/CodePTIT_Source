/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07072_ChuanHoaVaSapXep {

    public static String getFormName(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : parts) {
            sb.append(x.substring(0, 1).toUpperCase())
                    .append(x.substring(1).toLowerCase())
                    .append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<String> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            String name = getFormName(sc.nextLine().trim());
            ds.add(name);
        }
        Collections.sort(ds, (a, b) -> {
            String[] pa = a.split("\\s+");
            String[] pb = b.split("\\s+");
            
            String ta = pa[pa.length - 1];
            String tb = pb[pb.length - 1];
            
            String ha = pa[0];
            String hb = pb[0];
            
            String da = String.join(" ", Arrays.copyOfRange(pa, 1, pa.length - 1));
            String db = String.join(" ", Arrays.copyOfRange(pb, 1, pb.length - 1));
            
            if (!ta.equals(tb)) return ta.compareTo(tb);
            if (!ha.equals(hb)) return ha.compareTo(hb);
            return da.compareTo(db);
        });
        ds.forEach(e -> System.out.println(e));
    }
}
