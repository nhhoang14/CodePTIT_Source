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
        return this.msv.compareTo(other.msv);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.msv, this.name, this.lop, this.email);
    }
}

public class J05021_SapXepTheoMaSinhVien {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        SinhVien[] ds = new SinhVien[1000];
        int i = 0;
        while (ip.hasNextLine()) {
            String msv = ip.nextLine();
            if (msv.isEmpty()) break;
            String name = ip.nextLine();
            String lop = ip.nextLine();
            String email = ip.nextLine();
            ds[i] = new SinhVien(msv, name, lop, email);
            i++;
        }
        Arrays.sort(ds, 0, i);
        for (int j = 0; j < i; j++) {
            System.out.println(ds[j]);
        }
    }
}
