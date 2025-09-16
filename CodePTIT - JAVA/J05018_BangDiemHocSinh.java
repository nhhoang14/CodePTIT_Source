/* @author @nhhoang14 */

import java.util.*;

class HocSinh implements Comparable<HocSinh>{
    
    public String id, name;
    public double [] diem;

    public HocSinh(int id, String name, double[] diem) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.diem = diem;
    }
    
    public double getAverage() {
    double total = 0;
    for (int i = 0; i < diem.length; i++) {
        total += diem[i] * ((i == 0 || i == 1) ? 2f : 1f);
    }
    double avg = total / 12f;
    return Math.round(avg * 10f) / 10f;
}

    
    public String getRank(){
        double avg = this.getAverage();
        if (avg >= 9f) return "XUAT SAC";
        else if (avg >= 8f) return "GIOI";
        else if (avg >= 7f) return "KHA";
        else if (avg >= 5f) return "TB";
        else return "YEU";
    }
    
    @Override
    public int compareTo(HocSinh other) {
        return Double.compare(other.getAverage(), this.getAverage());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", this.id, this.name, this.getAverage(), this.getRank());
    }

}

public class J05018_BangDiemHocSinh {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        HocSinh[] ds = new HocSinh[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String[] s = ip.nextLine().split("\\s+");
            int len = s.length;
            double[] diem = new double[len];
            for(int j = 0; j < len; j++){
                diem[j] = Double.parseDouble(s[j]);
            }
            ds[i] = new HocSinh(i + 1, name, diem);
        }
        Arrays.sort(ds);
        for (HocSinh hs : ds) {
            System.out.println(hs);
        }
    }
}
