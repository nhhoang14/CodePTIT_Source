/* @author @nhhoang14 */

import java.util.*;

class GiangVien {

    private String msv, name, khoa;

    public GiangVien(int msv, String name, String khoa) {
        this.msv = "GV" + String.format("%02d", msv);
        this.name = name;
        this.khoa = khoa;
    }

    public String getKhoa() {
        return this.khoa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.msv, this.name, this.khoa);
    }
}

public class J05026_DanhSachGiangVienTheoBoMon {

    public static String getFormKhoa(String s) {
        String[] khoa = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : khoa) {
            sb.append(x.charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        GiangVien[] ds = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String khoa = ip.nextLine().toUpperCase();
            ds[i] = new GiangVien(i + 1, name, getFormKhoa(khoa));
        }

        int t = ip.nextInt();
        ip.nextLine();
        String[] dsKhoa = new String[t];
        for (int i = 0; i < t; i++) {
            String khoa = ip.nextLine().toUpperCase();
            dsKhoa[i] = getFormKhoa(khoa);
        }

        for (String khoa : dsKhoa) {
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", khoa);
            for (GiangVien gv : ds) {
                if (gv.getKhoa().equals(khoa)) {
                    System.out.println(gv);
                }
            }
        }
    }
}
