/* @author @nhhoang14 */

import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {

    private String name, date;
    private double d1, d2, d3;

    public ThiSinh(String name, String date, double d1, double d2, double d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getTotal() {
        return this.d1 + this.d2 + this.d3;
    }

    @Override
    public int compareTo(ThiSinh other) {
        return Double.compare(this.getTotal(), other.getTotal());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f", this.name, this.date, this.getTotal());
    }
}

public class J05009_TimThuKhoaCuaKyThi {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        ThiSinh[] ds = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String date = ip.nextLine();
            double d1 = ip.nextDouble();
            double d2 = ip.nextDouble();
            double d3 = ip.nextDouble();
            ip.nextLine();
            ds[i] = new ThiSinh(name, date, d1, d2, d3);
        }
        Arrays.sort(ds);
        double maxDiem = ds[n - 1].getTotal();
        for (int i = 0; i < n; i++) {
            if(ds[i].getTotal() == maxDiem){
                System.out.printf("%d %s\n", i + 1, ds[i]);
            }
        }
    }
}
