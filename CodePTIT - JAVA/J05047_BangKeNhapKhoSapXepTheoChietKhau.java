/* @author @nhhoang14 */

import java.util.*;

class MatHang implements Comparable<MatHang>{

    private String id, name;
    private int qty, price;

    public MatHang(String id, String name, int qty, int price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getDiscount() {
        float discount = 0f;
        if (this.qty > 10) {
            discount = 0.05f;
        } else if (this.qty >= 8 && this.qty <= 10) {
            discount = 0.02f;
        } else if (this.qty >= 5 && this.qty < 8) {
            discount = 0.01f;
        } else {
            discount = 0f;
        }
        return (int) (this.qty * this.price * discount);
    }

    public int getTotal() {
        return this.qty * this.price - this.getDiscount();
    }

    @Override
    public int compareTo(MatHang other) {
        return other.getDiscount() - this.getDiscount();
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d %d", this.id, this.name, this.getDiscount(), this.getTotal());
    }
}

public class J05047_BangKeNhapKhoSapXepTheoChietKhau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        MatHang[] ds = new MatHang[n];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine().trim();
            String[] s = name.split("\\s+");
            String code = ("" + s[0].charAt(0) + s[1].charAt(0)).toUpperCase();
            int number = map.getOrDefault(code, 0) + 1;
            map.put(code, number);
            String id = code + String.format("%02d", number);
            int qty = Integer.parseInt(sc.nextLine());
            int price = Integer.parseInt(sc.nextLine());
            ds[i] = new MatHang(id, name, qty, price);
        }
        Arrays.sort(ds);
        for (MatHang x : ds) {
            System.out.println(x);
        }
    }
}

