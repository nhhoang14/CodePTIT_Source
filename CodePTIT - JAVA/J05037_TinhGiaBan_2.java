/* @author @nhhoang14 */

import java.util.*;

class SanPham implements Comparable<SanPham> {

    private String id, name, dv;
    private int price, qty;

    public SanPham(int id, String name, String dv, int price, int qty) {
        this.id = "MH" + String.format("%02d", id);
        this.name = name;
        this.dv = dv;
        this.price = price;
        this.qty = qty;
    }

    public long getShippingFee() {
        return Math.round(this.price * this.qty * 5 / 100.0);
    }

    public long getTmpPrice() {
        return this.price * this.qty + getShippingFee();
    }

    public long getTotal() {
        double val = (this.getTmpPrice() * 1.02) / this.qty;
        return (long) (Math.ceil(val / 100.0) * 100);
    }

    @Override
    public int compareTo(SanPham other) {
        return Long.compare(other.getTotal(), this.getTotal());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", this.id, this.name, this.dv, this.getShippingFee(), this.getTmpPrice(), this.getTotal());
    }
}

public class J05037_TinhGiaBan_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SanPham[] ds = new SanPham[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String dv = sc.nextLine();
            int price = sc.nextInt();
            int qty = sc.nextInt();
            sc.nextLine();
            ds[i] = new SanPham(i + 1, name, dv, price, qty);
        }
        Arrays.sort(ds);
        for (SanPham x : ds) {
            System.out.println(x);
        }
    }
}
