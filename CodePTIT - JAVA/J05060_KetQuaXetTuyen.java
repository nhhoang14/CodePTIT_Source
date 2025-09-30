/* @author @nhhoang14 */

import java.util.*;

class ThiSinh {

    private String id, name, dob;
    private double m1, m2;
    private int getTotal;

    public ThiSinh(String id, String name, String dob, double m1, double m2) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.m1 = m1;
        this.m2 = m2;
    }

    public double getBonus() {
        double minMark = Math.min(m1, m2);
        if(minMark >= 8) return 1;
        else if(minMark >= 7.5) return 0.5;
        else return 0;
    }

    public int getTotal(){
        int res = (int) Math.round((m1 + m2) / 2.0 + this.getBonus());
        return (res < 10) ? res : 10;
    }
    
    public String getRating() {
        if (this.getTotal() < 5) {
            return "Truot";
        } else if (this.getTotal() <= 6) {
            return "Trung binh";
        } else if (this.getTotal() == 7) {
            return "Kha";
        } else if (this.getTotal() == 8) {
            return "Gioi"; 
        } else {
            return "Xuat sac";
        }
    }

    public int getAge() {
        return 2021 - Integer.parseInt(this.dob.substring(6));
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %s", this.id, this.name, this.getAge(), this.getTotal(), this.getRating());
    }
}

public class J05060_KetQuaXetTuyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] ds = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            String id = "PH" + String.format("%02d", i + 1);
            String name = sc.nextLine();
            String dob = sc.nextLine();
            double m1 = Double.parseDouble(sc.nextLine());
            double m2 = Double.parseDouble(sc.nextLine());
            ds[i] = new ThiSinh(id, name, dob, m1, m2);
        }
        for (ThiSinh x : ds) {
            System.out.println(x);
        }
    }
}
