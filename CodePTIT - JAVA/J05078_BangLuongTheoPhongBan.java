/* @author @nhhoang14 */

import java.util.*;

class NhanVien2 {
    
    private String id, name;
    private int ipd, day;
    
    public NhanVien2(String id, String name, int ipd, int day) {
        this.id = id;
        this.name = name;
        this.ipd = ipd;
        this.day = day;
    }
    
    public String getID() {
        return this.id;
    }
    
    public int getMul() {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("A", Arrays.asList(10, 12, 14, 20));
        map.put("B", Arrays.asList(10, 11, 13, 16));
        map.put("C", Arrays.asList(9, 10, 12, 14));
        map.put("D", Arrays.asList(8, 9, 11, 13));
        int y = Integer.parseInt(this.id.substring(1, 3)), idx = 0;
        if (y >= 16) {
            idx = 3;
        } else if (y >= 9) {
            idx = 2;
        } else if (y >= 4) {
            idx = 1;
        } else {
            idx = 0;
        }
        return map.get(this.id.substring(0, 1)).get(idx);
    }
    
    public int getTotal() {
        return this.ipd * this.day * this.getMul() * 1000;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d", this.id, this.name, this.getTotal());
    }
}

public class J05078_BangLuongTheoPhongBan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> dsPB = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            dsPB.put(line.substring(0, 2), line.substring(3));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien2> dsNV = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int ipd = Integer.parseInt(sc.nextLine());
            int day = Integer.parseInt(sc.nextLine());
            dsNV.add(new NhanVien2(id, name, ipd, day));
        }
        String PB = sc.nextLine();
        System.out.printf("Bang luong phong %s:\n", dsPB.get(PB));
        dsNV.forEach(e -> {
            if (e.getID().substring(3, 5).equals(PB)) {
                System.out.println(e);
            }
        });
    }
}