/* @author @nhhoang14 */

import java.util.*;

class ThoiGian implements Comparable<ThoiGian> {

    private int hour, minute, second;

    public ThoiGian() {
        this(0, 0, 0);
    }

    public ThoiGian(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(ThoiGian other) {
        if (this.hour != other.hour) {
            return this.hour - other.hour;
        }
        if (this.minute != other.minute) {
            return this.minute - other.minute;
        }
        return this.second - other.second;
    }

    @Override
    public String toString() {
        return String.format("%d %d %d", this.hour, this.minute, this.second);
    }
}

public class J05033_SapXepThoiGian {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ThoiGian[] ds = new ThoiGian[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new ThoiGian(ip.nextInt(), ip.nextInt(), ip.nextInt());
        }
        Arrays.sort(ds);
        for (ThoiGian tg : ds) {
            System.out.println(tg);
        }
    }
}
