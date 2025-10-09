/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class ThiSinh implements Comparable<ThiSinh> {

    private String id, name, type;
    private double mark;
    private int kv;

    public ThiSinh(String id, String name, double mark, String type, int kv) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.type = type;
        this.kv = kv;
    }

    public double getTotal(){
        double res = 0.0;
        if(this.kv == 1) res += 1.5;
        else res += (this.kv == 2) ? 1.0 : 0.0;
        res += (this.type.equals("Kinh")) ? 0.0 : 1.5;
        return Math.round((res + this.mark) * 10.0) / 10.0;
    }
    
    public String getPass(){
        return (this.getTotal() < 20.5) ? "Truot" : "Do";
    }
    
    @Override
    public int compareTo(ThiSinh other) {
        return Double.compare(other.getTotal(), this.getTotal());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", this.id, this.name, this.getTotal(), this.getPass());
    }

}

public class J07057_DiemTuyenSinh {

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

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] ds = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            String id = "TS" + String.format("%02d", i + 1);
            String name = getFormName(sc.nextLine().trim());
            double mark = Double.parseDouble(sc.nextLine());
            String type = sc.nextLine();
            int kv = Integer.parseInt(sc.nextLine());
            ds[i] = new ThiSinh(id, name, mark, type, kv);
        }
        Arrays.sort(ds);
        for (ThiSinh x : ds) {
            System.out.println(x);
        }
    }
}