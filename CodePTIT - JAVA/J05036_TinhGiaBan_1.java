/* @author @nhhoang14 */

import java.util.*;

class SanPham {

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
        return Math.round(this.getTmpPrice() * 102 / 100.0);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d", this.id, this.name, this.dv, this.getShippingFee(), this.getTmpPrice(), this.getTotal());
    }
}

public class J05036_TinhGiaBan_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        int i = 1;
        while (tc-- >0) {
            String name = sc.nextLine();
            String dv = sc.nextLine();
            int price = sc.nextInt();
            int qty = sc.nextInt();
            sc.nextLine();
            SanPham x = new SanPham(i, name, dv, price, qty);
            System.out.println(x);
            i++;
        }
    }
}
