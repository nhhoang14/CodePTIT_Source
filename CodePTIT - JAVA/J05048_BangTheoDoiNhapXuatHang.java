/* @author @nhhoang14 */

import java.util.*;

class HangHoa {

    private String id;
    private long qtyIn;

    public HangHoa(String id, long qtyIn) {
        this.id = id;
        this.qtyIn = qtyIn;
    }

    public long getQtyOut() {
        if (this.id.charAt(0) == 'A') {
            return Math.round(this.qtyIn * 0.6);
        }
        return Math.round(this.qtyIn * 0.7);
    }

    public long getPrice() {
        return this.id.charAt(4) == 'Y' ? 110000 : 135000;
    }

    public long getTotal() {
        return this.getQtyOut() * this.getPrice();
    }

    public long getTax() {
        if (this.id.charAt(0) == 'A') {
            if (this.id.charAt(4) == 'Y') {
                return this.getTotal() * 8 / 100;
            }
            return this.getTotal() * 11 / 100;
        }
        if (this.id.charAt(4) == 'Y') {
            return this.getTotal() * 17 / 100;
        }
        return this.getTotal() * 22 / 100;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d %d %d", this.id, this.qtyIn, this.getQtyOut(), this.getPrice(), this.getTotal(), this.getTax());
    }
}

public class J05048_BangTheoDoiNhapXuatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HangHoa[] ds = new HangHoa[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            long qtyIn = Long.parseLong(sc.nextLine());
            ds[i] = new HangHoa(id, qtyIn);
        }
        for (HangHoa x : ds) {
            System.out.println(x);
        }
    }
}
