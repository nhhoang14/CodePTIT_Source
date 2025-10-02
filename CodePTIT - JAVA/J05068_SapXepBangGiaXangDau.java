/* @author @nhhoang14 */

import java.util.*;

class DonHang implements Comparable<DonHang>{

    private String id;
    private long qty, price, tax;

    public DonHang(String id, long qty) {
        this.id = id;
        this.qty = qty;
        this.getPAT();
    }

    public String getName() {
        String pos = this.id.substring(3);
        switch (pos) {
            case "BP":
                return "British Petro";
            case "ES":
                return "Esso";
            case "SH":
                return "Shell";
            case "CA":
                return "Castrol";
            case "MO":
                return "Mobil";
            default:
                return "Trong Nuoc";
        }
    }

    public void getPAT() {
        if (this.id.startsWith("X")) {
            this.price = 128000;
            this.tax = this.qty * this.price * 3 / 100;
        } else if (this.id.startsWith("D")) {
            this.price = 11200;
            this.tax = this.qty * this.price * 7 / 200;
        } else {
            this.price = 9700;
            this.tax = this.qty * this.price / 50;
        }
        if(this.id.substring(3).equals("TN")){
            this.tax = 0;
        }
    }

    public long getTotal() {
        return this.qty * this.price + this.tax;
    }

    @Override
    public int compareTo(DonHang other) {
        return Long.compare(other.getTotal(), this.getTotal());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", this.id, this.getName(), this.price, this.tax, this.getTotal());
    }
}

public class J05068_SapXepBangGiaXangDau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split("\\s+");
            String id = parts[0];
            long qty = Long.parseLong(parts[1]);
            ds.add(new DonHang(id, qty));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}
