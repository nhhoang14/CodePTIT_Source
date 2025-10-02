/* @author @nhhoang14 */

import java.util.*;

class GiaoVien {

    private String id, name;
    private long salary;

    public GiaoVien(String id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getHs() {
        return Integer.parseInt(this.id.substring(2));
    }
    
    public long getBonus() {
        if(this.id.startsWith("HT")) return 2000000;
        if(this.id.startsWith("HP")) return 900000;
        else return 500000;
    }

    public long getTotal(){
        return this.salary * this.getHs() + this.getBonus();
    }
 
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", this.id, this.name, this.getHs(), this.getBonus(), this.getTotal());
    }
}

public class J05064_BangThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> ds = new ArrayList<>();
        int ht = 0, hp = 0;
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long salary = Long.parseLong(sc.nextLine());
            if(id.startsWith("HT")){
                if(ht >= 1) continue;
                ht++;
            }
            if(id.startsWith("HP")){
                if(hp >= 2) continue;
                hp++;
            }
            ds.add(new GiaoVien(id, name, salary));
        }
        ds.forEach(e -> System.out.println(e));
    }
}