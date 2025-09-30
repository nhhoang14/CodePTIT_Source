/* @author @nhhoang14 */

import java.util.*;

class HocSinh implements Comparable<HocSinh> {

    private String id, name;
    private float mark;
    private int rank;

    public HocSinh(int id, String name, float mark) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.mark = mark;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getRating() {
        if (this.mark >= 9f) {
            return "Gioi";
        } else if (this.mark >= 7 && this.mark < 9) {
            return "Kha";
        } else if (this.mark >= 5 && this.mark < 7) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public float getMark() {
        return this.mark;
    }

    @Override
    public int compareTo(HocSinh other) {
        return Float.compare(other.mark, this.mark);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s %d", this.id, this.name, this.mark, this.getRating(), this.rank);
    }
}

public class J05054_XepHangHocSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HocSinh[] ds = new HocSinh[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            float mark = Float.parseFloat(sc.nextLine());
            ds[i] = new HocSinh(i + 1, name, mark);
        }
        HocSinh[] tmp = Arrays.copyOf(ds, n);
        Arrays.sort(tmp);
        int rank = 1;
        tmp[0].setRank(rank);
        for (int i = 1; i < n; i++) {
            if (tmp[i].getMark() != tmp[i - 1].getMark()) {
                rank = i + 1;
            }
            tmp[i].setRank(rank);
        }
        for (HocSinh x : ds) {
            System.out.println(x);
        }
    }
}
