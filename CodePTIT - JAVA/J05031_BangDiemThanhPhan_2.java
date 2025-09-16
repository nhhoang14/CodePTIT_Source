/* @author @nhhoang14 */

import java.util.*;

class SinhVien implements Comparable<SinhVien> {

    private String msv, name, lop;
    private double d1, d2, d3;

    public SinhVien(String msv, String name, String lop, double d1, double d2, double d3) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public int compareTo(SinhVien other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %.1f %.1f", this.msv, this.name, this.lop, this.d1, this.d2, this.d3);
    }
}

public class J05031_BangDiemThanhPhan_2 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String msv = ip.nextLine();
            String name = ip.nextLine();
            String lop = ip.nextLine();
            double d1 = ip.nextDouble();
            double d2 = ip.nextDouble();
            double d3 = ip.nextDouble();
            ip.nextLine();
            ds[i] = new SinhVien(msv, name, lop, d1, d2, d3);
        }
        Arrays.sort(ds);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %s\n", i + 1, ds[i]);
        }
    }
}