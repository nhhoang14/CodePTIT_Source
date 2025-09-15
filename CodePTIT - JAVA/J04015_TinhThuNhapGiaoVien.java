/* @author @nhhoang14 */

import java.util.*;

class GiaoVien {

    private String code, name;
    private int salary;

    public GiaoVien() {
        this("", "", 0);
    }

    public GiaoVien(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public int getPosition() {
        String pos = this.code.substring(0, 2);
        if (pos.equals("HT")) {
            return 2000000;
        } else if (pos.equals("HP")) {
            return 900000;
        } else {
            return 500000;
        }
    }

    public int getLevel() {
        String pos = this.code.substring(2);
        int num = Integer.parseInt(pos);
        return num;
    }

    public int getRealSalary() {
        int res = this.salary * this.getLevel() + this.getPosition();
        return res;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", this.code, this.name, this.getLevel(), this.getPosition(), this.getRealSalary());
    }
}

public class J04015_TinhThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String code = ip.nextLine();
        String name = ip.nextLine();
        int salary = ip.nextInt();
        GiaoVien gv = new GiaoVien(code, name, salary);
        System.out.print(gv);
    }
}
