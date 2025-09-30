/* @author @nhhoang14 */

import java.util.*;

class DonHang implements Comparable<DonHang>{

    private String id, name, stt;
    private int qty, price;

    public DonHang(String name, String id, String stt, int price, int qty) {
        this.name = name;
        this.id = id;
        this.stt = stt;
        this.price = price;
        this.qty = qty;
    }

    public long getTmpPrice() {
       return this.price * this.qty;
    }
    
    public long getDiscount() {
       if(this.id.charAt(4) == '1'){
           return Math.round(this.getTmpPrice() / 2);
       }
       return Math.round(this.getTmpPrice() * 30 / 100);
    }

    public long getTotal() {
        return this.getTmpPrice() - this.getDiscount();
    }

    @Override
    public int compareTo(DonHang other) {
        return this.stt.compareTo(other.stt);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", this.name, this.id, this.stt, this.getDiscount(), this.getTotal());
    }
}

public class J05053_SapXepDonHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        DonHang[] ds = new DonHang[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            String stt = id.substring(1, 4);
            int price = Integer.parseInt(sc.nextLine());
            int qty = Integer.parseInt(sc.nextLine());
            ds[i] = new DonHang(name, id, stt, price, qty);
        }
        Arrays.sort(ds);
        for (DonHang x : ds) {
            System.out.println(x);
        }
    }
}
