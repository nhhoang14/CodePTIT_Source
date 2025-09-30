/* @author @nhhoang14 */

import java.util.*;

class HocSinh {

    private String id, name;
    private double d1, d2, d3;

    public HocSinh(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getPri() {
        if(this.id.charAt(2) == '1') return 0.5;
        else if(this.id.charAt(2) == '2') return 1;
        else return 2.5;
    }

    public double getTmp() {
        return this.d1 * 2 + this.d2 + this.d3;
    }
    
    public double getTotal() {
        return this.getTmp() + this.getPri();
    }

    public String getStatus() {
        return (this.getTotal() < 24) ? "TRUOT" : "TRUNG TUYEN";
    }
    
    static String formNumber(double x){
        if((int) x == x) return String.format("%.0f", x);
        return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.id, this.name, this.formNumber(this.getPri()), this.formNumber(this.getTmp()), this.getStatus());
    }
}

public class J05057_BangDiemTuyenSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocSinh[] ds = new HocSinh[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            ds[i] = new HocSinh(id, name, d1, d2, d3);
        }
        for (HocSinh x : ds) {
            System.out.println(x);
        }
    }
}
