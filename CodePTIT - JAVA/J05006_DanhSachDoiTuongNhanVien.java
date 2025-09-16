/* @author @nhhoang14 */

import java.util.*;

class NhanVien {

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
    public String toString() {
        return code + " " + name + " " + sex + " " + date + " " + address + " " + tax + " " + contract;
    }
}

public class J05006_DanhSachDoiTuongNhanVien {

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
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }
}
