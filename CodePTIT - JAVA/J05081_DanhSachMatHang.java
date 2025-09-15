/* @author @nhhoang14 */

import java.util.*;

class MatHang implements Comparable<MatHang> {

    private String id, name, unit;
    private int pur, sell;

    public MatHang(int id, String name, String unit, int pur, int sell) {
        this.id = "MH" + String.format("%03d", id);
        this.name = name;
        this.unit = unit;
        this.pur = pur;
        this.sell = sell;
    }

    public int getProfit() {
        return this.sell - this.pur;
    }

    @Override
    public int compareTo(MatHang other) {
        if (this.getProfit() != other.getProfit()) {
            return other.getProfit() - this.getProfit();
        }
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", this.id, this.name, this.unit, this.pur, this.sell, this.getProfit());
    }
}

public class J05081_DanhSachMatHang {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        MatHang[] ds = new MatHang[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String unit = ip.nextLine();
            int pur = ip.nextInt();
            int sell = ip.nextInt();
            ip.nextLine();
            ds[i] = new MatHang(i + 1, name, unit, pur, sell);
        }
        Arrays.sort(ds);
        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
