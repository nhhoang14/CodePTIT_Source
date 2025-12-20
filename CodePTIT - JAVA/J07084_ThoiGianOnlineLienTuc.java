/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class SinhVien implements Comparable<SinhVien> {

    private String name;
    private long time;

    public SinhVien(String name, long time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(SinhVien other) {
        return Long.compare(other.time, this.time);
    }

    @Override
    public String toString() {
        return name + " " + time;
    }
};

public class J07084_ThoiGianOnlineLienTuc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            LocalDateTime st = LocalDateTime.parse(sc.nextLine(), fmt);
            LocalDateTime en = LocalDateTime.parse(sc.nextLine(), fmt);
            long time = ChronoUnit.MINUTES.between(st, en);
            ds.add(new SinhVien(name, time));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}
