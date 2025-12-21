/* @author @nhhoang14 */

import java.util.*;

class SinhVien {

    private String id, name, phone;
    private int group;

    public SinhVien(String id, String name, String phone, int group) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.phone;
    }
}

public class J06003_QuanLyBaiTapNhom_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.nextLine();
            int group = Integer.parseInt(sc.nextLine());
            ds.add(new SinhVien(id, name, phone, group));
        }
        ArrayList<String> dt = new ArrayList<>();
        while (m-- > 0) {
            dt.add(sc.nextLine());
        }
        int k = sc.nextInt();
        while (k-- > 0) {
            int gp = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", gp);
            for (SinhVien x : ds) {
                if (gp == x.getGroup()) {
                    System.out.println(x);
                }
            }
            System.out.printf("Bai tap dang ky: %s\n", dt.get(gp - 1));
        }
    }
}
