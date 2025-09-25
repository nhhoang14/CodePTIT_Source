/* @author @nhhoang14 */

import java.util.*;

class SinhVien implements Comparable<SinhVien> {

    private String name;
    private int ac, sub;

    public SinhVien(String name, int ac, int sub) {
        this.name = name;
        this.ac = ac;
        this.sub = sub;
    }

    @Override
    public int compareTo(SinhVien other) {
        if (this.ac != other.ac) {
            return other.ac - this.ac;
        }
        if (this.sub != other.sub) {
            return this.sub - other.sub;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.ac, this.sub);
    }
}

public class J05042_BangXepHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int ac = sc.nextInt();
            int sub = sc.nextInt();
            sc.nextLine();
            ds[i] = new SinhVien(name, ac, sub);
        }
        Arrays.sort(ds);
        for (SinhVien x : ds) {
            System.out.println(x);
        }
    }
}
