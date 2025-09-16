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

    public String getLop() {
        return this.lop;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.msv, this.name, this.lop, this.email);
    }
}

public class J05022_LietKeSinhVienTheoLop {

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
        String[] dslop = new String[t];
        for (int i = 0; i < t; i++) {
            dslop[i] = ip.nextLine();
        }

        for (String lh : dslop) {
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", lh);
            for (SinhVien sv : ds) {
                if (sv.getLop().equals(lh)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
