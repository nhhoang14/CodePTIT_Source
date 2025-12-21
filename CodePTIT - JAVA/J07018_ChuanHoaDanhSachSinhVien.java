/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class SinhVien {

    private String id, name, lop, date;
    private float gpa;

    public SinhVien(String id, String name, String lop, String date, float gpa) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + lop + " " + date + " " + String.format("%.2f", gpa);
    }
}

public class J07018_ChuanHoaDanhSachSinhVien {

    public static String ChuanHoaTen(String s) {
        String[] tmp = s.trim().toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : tmp) {
            sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static String ChuanHoaNgay(String s) {
        DateTimeFormatter in = DateTimeFormatter.ofPattern("d/M/yyyy");
        DateTimeFormatter out = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate t = LocalDate.parse(s, in);
        return t.format(out);
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ObjectStreamException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = String.format("B20DCCN%03d", i + 1);
            String name = ChuanHoaTen(sc.nextLine());
            String lop = sc.nextLine();
            String date = ChuanHoaNgay(sc.nextLine());
            float gpa = Float.parseFloat(sc.nextLine());
            ds.add(new SinhVien(id, name, lop, date, gpa));
        }
        ds.forEach(e -> System.out.println(e));
    }
}
