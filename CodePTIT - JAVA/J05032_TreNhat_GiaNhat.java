/* @author @nhhoang14 */

import java.util.*;

class Nguoi implements Comparable<Nguoi> {

    private String name, date;

    public Nguoi(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public int compareTo(Nguoi other) {
        String[] time1 = this.date.split("/");
        int d1 = Integer.parseInt(time1[0]);
        int m1 = Integer.parseInt(time1[1]);
        int y1 = Integer.parseInt(time1[2]);
        String[] time2 = other.date.split("/");
        int d2 = Integer.parseInt(time2[0]);
        int m2 = Integer.parseInt(time2[1]);
        int y2 = Integer.parseInt(time2[2]);
        if (y1 != y2) return y2 - y1;
        if (m1 != m2) return m2 - m1;
        return d2 - d1;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}

public class J05032_TreNhat_GiaNhat {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        Nguoi[] ds = new Nguoi[n];
        for (int i = 0; i < n; i++) {
            String name = ip.next();
            String date = ip.next();
            ds[i] = new Nguoi(name, date);
        }
        Arrays.sort(ds);
        System.out.printf("%s\n%s", ds[0], ds[n-1]);
    }
}
