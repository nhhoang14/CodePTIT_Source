/* @author @nhhoang14 */

import java.util.*;

class SinhVien {

    private String msv, name, lop, email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getKhoa() {
        return this.lop.substring(1, 3);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.msv, this.name, this.lop, this.email);
    }
}

public class J05023_LietKeSinhVienTheoKhoa {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String msv = ip.nextLine();
            String name = ip.nextLine();
            String lop = ip.nextLine();
            String email = ip.nextLine();
            ds[i] = new SinhVien(msv, name, lop, email);
        }

        int t = ip.nextInt();
        ip.nextLine();
        String[] dsKhoa = new String[t];
        for (int i = 0; i < t; i++) {
            dsKhoa[i] = ip.nextLine();
        }

        for (String khoa : dsKhoa) {
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", khoa);
            for (SinhVien sv : ds) {
                if (sv.getKhoa().equals(khoa.substring(2))) {
                    System.out.println(sv);
                }
            }
        }
    }
}
