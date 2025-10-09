/* @author @nhhoang14 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MatHang implements Comparable<MatHang> {

    private String id, name, type;
    private double pur, sell;

    public MatHang(String id, String name, String type, double pur, double sell) {
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
        return Double.compare(other.getProfit(), this.getProfit());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.2f", this.id, this.name, this.type, this.getProfit());
    }
}

public class J07050_SapXepMatHang {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("MATHANG.in"));
        int n = ip.nextInt();
        ip.nextLine();
        MatHang[] ds = new MatHang[n];
        for (int i = 0; i < n; i++) {
            String id = "MH" + String.format("%02d", i + 1);
            String name = ip.nextLine();
            String type = ip.nextLine();
            double pur = ip.nextDouble();
            double sell = ip.nextDouble();
            ip.nextLine();
            ds[i] = new MatHang(id, name, type, pur, sell);
        }
        Arrays.sort(ds);
        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
