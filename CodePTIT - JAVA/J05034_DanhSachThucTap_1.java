/* @author @nhhoang14 */

import java.util.*;

class SinhVien implements Comparable<SinhVien> {

    private int id;
    private String msv, name, lop, email, dn;

    public SinhVien(int id, String msv, String name, String lop, String email, String dn) {
        this.id = id;
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.dn = dn;
    }

    public String getDN(){
        return this.dn;
    }
    
    @Override
    public int compareTo(SinhVien other){
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %s", this.id, this.msv, this.name, this.lop, this.email, this.dn);
    }
}

public class J05034_DanhSachThucTap_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String msv = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String dn = sc.nextLine();
            ds[i] = new SinhVien(i + 1, msv, name, lop, email, dn);
        }
        Arrays.sort(ds);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0) {
            String s = sc.nextLine();
            for(SinhVien x : ds){
                if(x.getDN().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
