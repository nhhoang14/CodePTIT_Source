/* @author @nhhoang14 */

import java.util.*;

class HocPhan implements Comparable<HocPhan> {

    private String id, name, group, teacher;

    public HocPhan(String id, String name, String group, String teacher) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public String getID() {
        return this.id;
    }

    @Override
    public int compareTo(HocPhan other) {
        return this.group.compareTo(other.group);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.group, this.teacher);
    }
}

public class J05079_LopHocPhan_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HocPhan> ds = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String group = sc.nextLine();
            String teacher = sc.nextLine();
            HocPhan x = new HocPhan(id, name, group, teacher);
            ds.add(x);
            map.putIfAbsent(id, name);
        }
        Collections.sort(ds);
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            String dsID = sc.nextLine();
            System.out.printf("Danh sach nhom lop mon %s:\n", map.get(dsID));
            ds.forEach(e -> {
                if (e.getID().equals(dsID)) {
                    System.out.println(e);
                }
            });

        }
    }
}
