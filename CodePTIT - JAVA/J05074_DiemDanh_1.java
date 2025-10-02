/* @author @nhhoang14 */

import java.util.*;

class SinhVien {

    private String id, name, lop, cc;

    public SinhVien(String id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public void setCC(String s) {
        int res = 10;
        for (char c : s.toCharArray()) {
            if (c == 'v') res -= 2;
            if (c == 'm') res -= 1;
        }
        if(res < 0) res = 0;
        this.cc = Integer.toString(res) + ((res == 0) ? " KDDK" : "");
    }

    public String getLop() {
        return this.lop;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.id, this.name, this.lop, this.cc);
    }
}

public class J05074_DiemDanh_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        Map<String, SinhVien> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            SinhVien x = new SinhVien(id, name, lop);
            map.put(id, x);
            ds.add(x);
        }
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split("\\s+");
            SinhVien x = map.get(parts[0]);
            x.setCC(parts[1]);
        }
        ds.forEach(e -> System.out.println(e));
    }
}
