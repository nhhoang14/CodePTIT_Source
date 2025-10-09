/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class SanPham implements Comparable<SanPham> {

    private String id, name;
    private int price, month;

    public SanPham(String id, String name, int price, int month) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    @Override
    public int compareTo(SanPham other) {
        if(this.price == other.price){
            return this.id.compareTo(other.id);
        }
        return other.price - this.price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", this.id, this.name, this.price, this.month);
    }

}

public class J07048_DanhSachSanPham_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int month = Integer.parseInt(sc.nextLine());
            ds.add(new SanPham(id, name, price, month));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}