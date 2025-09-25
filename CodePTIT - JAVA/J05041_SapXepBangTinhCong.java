/* @author @nhhoang14 */

import java.util.*;

class NhanVien implements Comparable<NhanVien> {

    private String id, name, pos;
    private int day, ipd;

    public NhanVien(int id, String name, int ipd, int day, String pos) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.ipd = ipd;
        this.day = day;
        this.pos = pos;
    }

    public long getSalary() {
        return this.day * this.ipd;
    }

    public long getBonus() {
        if (this.day >= 25) return Math.round(this.getSalary() * 0.2);
        else if (this.day >= 22) return Math.round(this.getSalary() * 0.1);
        else return 0;
    }

    public long getAllowance() {
        switch (this.pos) {
            case "GD": return 250000;
            case "PGD": return 200000;
            case "TP": return 180000;
            default: return 150000;
        }
    }

    public long getTotal() {
        return this.getSalary() + this.getBonus() + this.getAllowance();
    }

    @Override
    public int compareTo(NhanVien other) {
        return Long.compare(other.getTotal(), this.getTotal());
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", this.id, this.name, this.getSalary(), this.getBonus(), this.getAllowance(), this.getTotal());
    }
}

public class J05041_SapXepBangTinhCong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] ds = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int ipd = Integer.parseInt(sc.nextLine());
            int day = Integer.parseInt(sc.nextLine());
            String pos = sc.nextLine();
            ds[i] = new NhanVien(i + 1, name, ipd, day, pos);
        }
        Arrays.sort(ds);
        for (NhanVien x : ds) {
            System.out.println(x);
        }
    }
}
