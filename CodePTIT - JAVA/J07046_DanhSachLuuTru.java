/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class KhachHang implements Comparable<KhachHang> {

    private String id, name, room, st, en;

    public KhachHang(String id, String name, String room, String st, String en) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.st = st;
        this.en = en;
    }

    public long getDay() {
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate st = LocalDate.parse(this.st, ft);
        LocalDate en = LocalDate.parse(this.en, ft);
        return ChronoUnit.DAYS.between(st, en);
    }

    @Override
    public int compareTo(KhachHang other) {
        return Long.compare(other.getDay(), this.getDay());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", this.id, this.name, this.room, this.getDay());
    }

}

public class J07046_DanhSachLuuTru {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = "KH" + String.format("%02d", i + 1);
            String name = sc.nextLine();
            String room = sc.nextLine();
            String st = sc.nextLine();
            String en = sc.nextLine();
            ds.add(new KhachHang(id, name, room, st, en));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}
