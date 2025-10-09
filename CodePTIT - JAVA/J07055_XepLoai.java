/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class SinhVien implements Comparable<SinhVien> {

    private String id, name;
    private double total;

    public SinhVien(String id, String name, double total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

   public String getRating() {
        if (this.total < 5) {
            return "KEM";
        } else if (this.total < 6.5) {
            return "TRUNG BINH";
        } else if (this.total < 8) {
            return "KHA";
        } else {
            return "GIOI";
        }
    }
    
    @Override
    public int compareTo(SinhVien other) {
        return Double.compare(other.total, this.total);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", this.id, this.name, this.total, this.getRating());
    }

}

public class J07055_XepLoai {

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
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String id = "SV" + String.format("%02d", i + 1);
            String name = getFormName(sc.nextLine().trim());
            int m1 = Integer.parseInt(sc.nextLine());
            int m2 = Integer.parseInt(sc.nextLine());
            int m3 = Integer.parseInt(sc.nextLine());
            double total = Math.round((m1 * 25.0 + m2 * 35.0 + m3 * 40.0) / 100.0 * 100.0) / 100.0;
            ds[i] =new SinhVien(id, name, total);
        }
        Arrays.sort(ds);
        for(SinhVien x : ds){
            System.out.println(x);
        }
    }
}