/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.text.*;

class SinhVien {

    private String id, name, lop, date;
    private float diem;

    public SinhVien(int id, String name, String lop, String date, float diem) throws ParseException {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.lop = lop;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        this.date = formatter.format(formatter.parse(date));
        this.diem = diem;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", this.id, this.name, this.lop, this.date, this.diem);
    }
}

public class J07010_DanhSachSinhVienTrongFile_2 {

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String date = sc.nextLine();
            float diem = Float.parseFloat(sc.nextLine());
            SinhVien sv = new SinhVien(i + 1, name, lop, date, diem);
            System.out.println(sv);
        }
    }
}
