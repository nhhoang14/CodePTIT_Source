/* @author @nhhoang14 */

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class KhachHang implements Comparable<KhachHang> {

    private String id, name, sex, dob, address;

    public KhachHang(String id, String name, String sex, String dob, String address) {
        this.id = id;
        this.name = this.getFormName(name);
        this.sex = sex;
        this.dob = this.getFormDOB(dob);;
        this.address = address;
    }

    public String getFormName(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : parts) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public String getFormDOB(String s) {
        LocalDate d = LocalDate.parse(s, DateTimeFormatter.ofPattern("d/M/yyyy"));
        return d.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public int compareTo(KhachHang other) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(this.dob, fmt);
        LocalDate d2 = LocalDate.parse(other.dob, fmt);
        return d1.compareTo(d2);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.id, this.name, this.sex, this.address, this.dob);
    }
}

public class J05082_DanhSachKhachHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = "KH" + String.format("%03d", i + 1);
            String name = sc.nextLine().toLowerCase().trim();
            String sex = sc.nextLine();
            String dob = sc.nextLine();
            String address = sc.nextLine();
            ds.add(new KhachHang(id, name, sex, dob, address));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}