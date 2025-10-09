/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class ThiSinh implements Comparable<ThiSinh> {

    private String id, name;
    private double d1, d2, d3, maxx;

    public ThiSinh(String id, String name, double d1, double d2, double d3) {
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

    public double getTotal() {
        return this.d1 * 2 + this.d2 + this.d3 + this.getPri();
    }

    public void setMax(double x){
        this.maxx = x;
    }
    
    public String getStatus() {
        return (this.getTotal() < maxx) ? "TRUOT" : "TRUNG TUYEN";
    }
    
    static String formNumber(double x){
        if((int) x == x) return String.format("%.0f", x);
        return String.format("%.1f", x);
    }
    
    @Override
    public int compareTo(ThiSinh other) {
        return Double.compare(other.getTotal(), this.getTotal());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", this.id, this.name, this.formNumber(this.getPri()), this.formNumber(this.getTotal()), this.getStatus());
    }
}

public class J07052_DanhSachTrungTuyen {

    public static String getFormName(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : parts) {
            sb.append(x.substring(0, 1).toUpperCase())
                    .append(x.substring(1).toLowerCase())
                    .append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] ds = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = getFormName(sc.nextLine().trim());
            double d1 = Double.parseDouble(sc.nextLine());
            double d2 = Double.parseDouble(sc.nextLine());
            double d3 = Double.parseDouble(sc.nextLine());
            ds[i] = new ThiSinh(id, name, d1, d2, d3);
        }
        int ct = Integer.parseInt(sc.nextLine());
        Arrays.sort(ds);
        double maxx = ds[ct - 1].getTotal();
        System.out.println(maxx);
        for (ThiSinh x : ds) {
            x.setMax(maxx);
            System.out.println(x);
        }
    }
}