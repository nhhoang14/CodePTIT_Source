/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class ThiSinh {

    private String id, name, dob;
    private double m1, m2;

    public ThiSinh(String id, String name, String dob, double m1, double m2) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.m1 = m1;
        this.m2 = m2;
    }

    public double getBonus() {
        double minMark = Math.min(m1, m2);
        if (minMark >= 8) return 1;
        else if (minMark >= 7.5) return 0.5;
        else return 0;
    }

    public int getTotal() {
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

public class J07053_XetTuyen {

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

    public static String getFormDate(String s) {
        String[] parts = s.split("/");
        String day = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
        String month = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
        String year = parts[2];
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ThiSinh[] ds = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            String id = "PH" + String.format("%02d", i + 1);
            String name = getFormName(sc.nextLine().trim());
            String dob = getFormDate(sc.nextLine());
            double m1 = Double.parseDouble(sc.nextLine());
            double m2 = Double.parseDouble(sc.nextLine());
            ds[i] = new ThiSinh(id, name, dob, m1, m2);
        }
        for (ThiSinh x : ds) {
            System.out.println(x);
        }
    }
}
