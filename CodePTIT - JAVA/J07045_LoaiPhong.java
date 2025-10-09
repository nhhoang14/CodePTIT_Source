/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong> {

    private String type, name;
    private int price;
    private double fee;

    public LoaiPhong(String line) {
        String[] parts = line.split("\\s+");
        this.type = parts[0];
        this.name = parts[1];
        this.price = Integer.parseInt(parts[2]);
        this.fee = Double.parseDouble(parts[3]);
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f", this.type, this.name, this.price, this.fee);
    }

}

public class J07045_LoaiPhong {

    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
