/* @author @nhhoang14 */

import java.util.*;

class VDV implements Comparable<VDV> {

    private String id, name, dob;
    private int total, pri, res, rank;

    public VDV(String id, String name, String dob, int total) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.total = total;
        this.pri = this.getPri();
        this.res = this.total - this.pri;
    }

    public void setRank(int rank){
        this.rank = rank;
    }
    
    public int getPri() {
        int age = 2021 - Integer.parseInt(this.dob.substring(6));
        if (age < 18) return 0;
        else if (age < 25) return 1;
        else if (age <= 32) return 2;
        else return 3;
    }

    public int getRes() {
        return this.res;
    }
    
    public static String getFormTime(int totalSeconds) {
        int h = totalSeconds / 3600;
        int m = (totalSeconds % 3600) / 60;
        int s = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    @Override
    public int compareTo(VDV other) {
        return this.res - other.res;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %d", this.id, this.name, this.getFormTime(this.total), this.getFormTime(this.pri), this.getFormTime(this.res), this.rank);
    }
}

public class J05056_XepHangVanDongVien_2 {

    public static int timeToSeconds(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        VDV[] ds = new VDV[n];
        for (int i = 0; i < n; i++) {
            String id = "VDV" + String.format("%02d", i + 1);
            String name = sc.nextLine();
            String dob = sc.nextLine();
            String st = sc.nextLine();
            String en = sc.nextLine();
            int total = timeToSeconds(en) - timeToSeconds(st);
            ds[i] = new VDV(id, name, dob, total);
        }
        Arrays.sort(ds);
        int rank = 1;
        ds[0].setRank(rank);
        System.out.println(ds[0]);
        for (int i = 1; i < n; i ++) {
            if(ds[i].getRes() != ds[i - 1].getRes()){
                rank = i + 1;
            }
            ds[i].setRank(rank);
            System.out.println(ds[i]);
        }
    }
}
