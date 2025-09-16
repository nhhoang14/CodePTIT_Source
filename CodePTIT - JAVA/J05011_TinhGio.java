/* @author @nhhoang14 */

import java.util.*;

class KhachHang implements Comparable<KhachHang> {

    private String code, name, time_start, time_end;

    public KhachHang(String code, String name, String time_start, String time_end) {
        this.code = code;
        this.name = name;
        this.time_start = time_start;
        this.time_end = time_end;
    }

    public int getTotalMinutes() {
        String[] time_st = this.time_start.split(":");
        String[] time_en = this.time_end.split(":");

        int st_hour = Integer.parseInt(time_st[0]);
        int st_minute = Integer.parseInt(time_st[1]);
        int en_hour = Integer.parseInt(time_en[0]);
        int en_minute = Integer.parseInt(time_en[1]);

        int start = st_hour * 60 + st_minute;
        int end = en_hour * 60 + en_minute;
        return end - start;
    }

    public String getTotal() {
        int total = getTotalMinutes();
        int h = total / 60;
        int m = total % 60;
        return String.format("%d gio %d phut", h, m);
    }

    @Override
    public int compareTo(KhachHang other) {
        return other.getTotalMinutes() - this.getTotalMinutes();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.code, this.name, this.getTotal());
    }
}

public class J05011_TinhGio {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        KhachHang[] ds = new KhachHang[n];
        for (int i = 0; i < n; i++) {
            String code = ip.nextLine();
            String name = ip.nextLine();
            String time_start = ip.nextLine();
            String time_end = ip.nextLine();
            ds[i] = new KhachHang(code, name, time_start, time_end);
        }
        Arrays.sort(ds);
        for (KhachHang kh : ds) {
            System.out.println(kh);
        }
    }
}
