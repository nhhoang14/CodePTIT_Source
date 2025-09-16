/* @author @nhhoang14 */

import java.util.*;

class MatHang implements Comparable<MatHang> {

    private int id;
    private String name, type;
    private double pur, sell;

    public MatHang(int id, String name, String type, double pur, double sell) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.pur = pur;
        this.sell = sell;
    }

    public double getProfit() {
        return this.sell - this.pur;
    }

    @Override
    public int compareTo(MatHang other) {
        if (this.getProfit() != other.getProfit()) {
            return Double.compare(other.getProfit(), this.getProfit());
        }
        return this.id - other.id;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f", this.id, this.name, this.type, this.getProfit());
    }
}

public class J05010_SapXepDanhSachMatHang {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        MatHang[] ds = new MatHang[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String type = ip.nextLine();
            double pur = ip.nextDouble();
            double sell = ip.nextDouble();
            ip.nextLine();
            ds[i] = new MatHang(i + 1, name, type, pur, sell);
        }
        Arrays.sort(ds);
        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
