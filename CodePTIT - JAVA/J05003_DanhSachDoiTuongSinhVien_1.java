/* @author @nhhoang14 */

import java.util.*;

class SinhVien {

    private String id, name, lop, date;
    private float diem;

    public SinhVien(int id, String name, String lop, String date, float diem) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.diem = diem;
    }

    public String getFormDate() {
        StringBuilder sb = new StringBuilder(this.date);
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, '0');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", this.id, this.name, this.lop, this.getFormDate(), this.diem);
    }
}

public class J05003_DanhSachDoiTuongSinhVien_1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String lop = ip.nextLine();
            String date = ip.nextLine();
            float diem = ip.nextFloat();
            ip.nextLine();
            ds[i] = new SinhVien(i + 1, name, lop, date, diem);
        }
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
