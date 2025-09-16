/* @author @nhhoang14 */

import java.util.*;

class SinhVien implements Comparable<SinhVien> {

    private String msv, name, lop, email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public int compareTo(SinhVien other) {
        if (!this.lop.equals(other.lop)) {
            return this.lop.compareTo(other.lop);
        } else {
            return this.msv.compareTo(other.msv);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.msv, this.name, this.lop, this.email);
    }
}

public class J05020_SapXepSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String msv = ip.nextLine();
            String name = ip.nextLine();
            String lop = ip.nextLine();
            String email = ip.nextLine();
            ds[i] = new SinhVien(msv, name, lop, email);
        }
        Arrays.sort(ds);
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
