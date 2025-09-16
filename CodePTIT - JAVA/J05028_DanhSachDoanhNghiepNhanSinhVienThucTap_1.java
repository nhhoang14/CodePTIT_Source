/* @author @nhhoang14 */

import java.util.*;

class DoanhNghiep implements Comparable<DoanhNghiep> {

    private String id, name;
    private int sl;

    public DoanhNghiep(String id, String name, int sl) {
        this.id = id;
        this.name = name;
        this.sl = sl;
    }

    @Override
    public int compareTo(DoanhNghiep other) {
        if(this.sl == other.sl){
            return this.id.compareTo(other.id);
        }
        return other.sl - this.sl;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.id, this.name, this.sl);
    }
}

public class J05028_DanhSachDoanhNghiepNhanSinhVienThucTap_1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        DoanhNghiep[] ds = new DoanhNghiep[n];
        for (int i = 0; i < n; i++) {
            String id = ip.nextLine();
            String name = ip.nextLine();
            int sl = ip.nextInt();
            ip.nextLine();
            ds[i] = new DoanhNghiep(id, name, sl);
        }
        Arrays.sort(ds);
        for (DoanhNghiep dn : ds) {
            System.out.println(dn);
        }
    }
}
