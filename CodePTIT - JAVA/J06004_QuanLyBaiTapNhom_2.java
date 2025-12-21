/* @author @nhhoang14 */

import java.util.*;

class SinhVien implements Comparable<SinhVien>{

    private String id, name, phone, nGroup;
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

    public void setnGroup(String nGroup) {
        this.nGroup = nGroup;
    }

    @Override
    public int compareTo(SinhVien other){
        return this.id.compareTo(other.id);
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.phone + " " + this.group + " " + this.nGroup;
    }
}

public class J06004_QuanLyBaiTapNhom_2 {

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
        Collections.sort(ds);
        ArrayList<String> dt = new ArrayList<>();
        while (m-- > 0) {
            dt.add(sc.nextLine());
        }
        for (SinhVien x : ds) {
            x.setnGroup(dt.get(x.getGroup() - 1));
            System.out.println(x);
        }
    }
}