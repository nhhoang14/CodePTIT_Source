/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class SinhVien implements Comparable<SinhVien> {

    private String id, name, sdt, email;

    public SinhVien(String id, String name, String sdt, String email) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien other) {
        if (this.name.equals(other.name)) {
            return this.id.compareTo(other.id);
        }
        String[] pa = this.name.split("\\s+");
        String[] pb = other.name.split("\\s+");

        String ta = pa[pa.length - 1];
        String tb = pb[pb.length - 1];

        String ha = pa[0];
        String hb = pb[0];

        String da = String.join(" ", Arrays.copyOfRange(pa, 1, pa.length - 1));
        String db = String.join(" ", Arrays.copyOfRange(pb, 1, pb.length - 1));

        if (!ta.equals(tb)) {
            return ta.compareTo(tb);
        }
        if (!ha.equals(hb)) {
            return ha.compareTo(hb);
        }
        return da.compareTo(db);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.id, this.name, this.sdt, this.email);
    }
}

public class J07081_SapXepDanhSachSinhVien {

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
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = getFormName(sc.nextLine().trim());
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            ds.add(new SinhVien(id, name, sdt, email));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}
