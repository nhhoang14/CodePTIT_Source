/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.text.ParseException;

class DoanhNghiep implements Comparable<DoanhNghiep> {

    private String id, name;
    private int sl;

    public DoanhNghiep(String id, String name, int sl) throws ParseException {
        this.id = id;
        this.name = name;
        this.sl = sl;
    }

    @Override
    public int compareTo(DoanhNghiep other) {
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.id, this.name, this.sl);
    }
}

public class J07037_DanhSachDoanhNghiep {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        DoanhNghiep[] ds = new DoanhNghiep[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            ds[i] = new DoanhNghiep(id, name, sl);
        }
        Arrays.sort(ds);
        for (DoanhNghiep dn : ds) {
            System.out.println(dn);
        }
    }
}
