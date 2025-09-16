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

    public String getNganh() {
        String nganh = msv.substring(5, 7);
        if ((nganh.equals("CN") || nganh.equals("AT")) && lop.charAt(0) == 'E') {
            return "";
        }
        return nganh;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.msv, this.name, this.lop, this.email);
    }
}

public class J05024_LietKeSinhVienTheoNganh {

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
        String[] dsNganh = new String[t];
        for (int i = 0; i < t; i++) {
            dsNganh[i] = ip.nextLine().toUpperCase();
        }

        for (String nganh : dsNganh) {
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", nganh);
            String[] s = nganh.split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(s[0].charAt(0)).append(s[1].charAt(0));
            for (SinhVien sv : ds) {
                if (sv.getNganh().equals(sb.toString())) {
                    System.out.println(sv);
                }
            }
        }
    }
}
