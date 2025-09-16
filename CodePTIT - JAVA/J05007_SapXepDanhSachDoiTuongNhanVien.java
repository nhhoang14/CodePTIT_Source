/* @author @nhhoang14 */

import java.util.*;

class NhanVien implements Comparable<NhanVien> {

    private String code, name, sex, date, address, tax, contract;

    public NhanVien(int code, String name, String sex, String date, String address, String tax, String contract) {
        this.code = String.format("%05d", code);
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.tax = tax;
        this.contract = contract;
    }

    @Override
    public int compareTo(NhanVien other) {
        String[] a = this.date.split("/");
        String[] b = other.date.split("/");

        int dayA = Integer.parseInt(a[0]);
        int monthA = Integer.parseInt(a[1]);
        int yearA = Integer.parseInt(a[2]);

        int dayB = Integer.parseInt(b[0]);
        int monthB = Integer.parseInt(b[1]);
        int yearB = Integer.parseInt(b[2]);

        if (yearA != yearB) return yearA - yearB;
        if (monthA != monthB) return monthA - monthB;
        return dayA - dayB;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + sex + " " + date + " " + address + " " + tax + " " + contract;
    }
}

public class J05007_SapXepDanhSachDoiTuongNhanVien {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        NhanVien[] ds = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String sex = ip.nextLine();
            String date = ip.nextLine();
            String address = ip.nextLine();
            String tax = ip.nextLine();
            String contract = ip.nextLine();
            ds[i] = new NhanVien(i + 1, name, sex, date, address, tax, contract);
        }
        Arrays.sort(ds);
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
