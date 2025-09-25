/* @author @nhhoang14 */

import java.util.*;

class NhanVien implements Comparable<NhanVien>{

    private String id, name, pos;
    private int day, ipd;

    public NhanVien(int id, String name, int ipd, int day, String pos) {
        this.id = "NV" + String.format("%02d", id);
        this.name = name;
        this.ipd = ipd;
        this.day = day;
        this.pos = pos;
    }

    public String getPos(){
        return this.pos;
    }
    
    public long getAllowance() {
        switch (this.pos) {
            case "GD": return 500;
            case "PGD": return 400;
            case "TP": return 300;
            case "KT": return 250;
            default: return 100;
        }
    }

    public long getSalary() {
        return (long) this.day * this.ipd;
    }

    public long getIncome() {
        return this.getSalary() + this.getAllowance();
    }

    public long getTmp() {
        double tmp = (this.getIncome()) * 2.0 / 3;
        if (tmp < 25000) {
            return Math.round(tmp / 1000.0) * 1000;
        } else {
            return 25000;
        }
    }

    public long getRemain() {
        return this.getIncome() - this.getTmp();
    }

    @Override
    public int compareTo(NhanVien other){
        return Long.compare(other.getIncome(), this.getIncome());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", this.id, this.name, this.getAllowance(), this.getSalary(), this.getTmp(), this.getRemain());
    }
}

public class J05045_SapXepNhanVienTheoThuNhap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        NhanVien[] ds = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String pos = sc.nextLine();
            int ipd = Integer.parseInt(sc.nextLine());
            int day = Integer.parseInt(sc.nextLine());
            ds[i] = new NhanVien(i + 1, name, ipd, day, pos);
        }
        Arrays.sort(ds);
        for(NhanVien x : ds){
            System.out.println(x);
        }
    }
}