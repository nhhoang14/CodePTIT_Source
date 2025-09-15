/* @author @nhhoang14 */

import java.util.*;

class NhanVien {

    private String code, name, sex, date, address, tax, contract;

    public NhanVien() {
        this("00001", "", "", "", "", "", "");
    }

    public NhanVien(String code, String name, String sex, String date, String address, String tax, String contract) {
        this.code = code;
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

public class J04007_KhaiBaoLopNhanVien {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        String sex = ip.nextLine();
        String date = ip.nextLine();
        String address = ip.nextLine();
        String tax = ip.nextLine();
        String contract = ip.nextLine();
        NhanVien nv = new NhanVien("00001", name, sex, date, address, tax, contract);
        System.out.print(nv);
    }
}
