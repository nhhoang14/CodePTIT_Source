/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class KhanhHang implements Comparable<KhanhHang> {

    private String id, name, type;
    private int range;

    public KhanhHang(String id, String name, String type, int range) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.range = range;
    }

    public int getDM(){
        if (this.type.equals("A")) return 100;
        else if (this.type.equals("B")) return 500;
        else return 200;
    }
    
    public int getIn(){
        if(this.range < this.getDM()) 
            return this.range * 450;
        return this.getDM() * 450;
    }
    
    public int getOut(){
        if(this.range > this.getDM()) 
            return (this.range - this.getDM()) * 1000;
        return 0;
    }
    
    public int getVAT(){
        return Math.round(this.getOut() * 5 / 100);
    }
    
    public int getTotal(){
        return this.getIn() + this.getOut() + this.getVAT();
    }

    @Override
    public int compareTo(KhanhHang other) {
        return other.getTotal() - this.getTotal();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", this.id, this.name, this.getIn(), this.getOut(), this.getVAT(), this.getTotal());
    }

}

public class J07056_TinhTienDien {

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
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        KhanhHang[] ds = new KhanhHang[n];
        for (int i = 0; i < n; i++) {
            String id = "KH" + String.format("%02d", i + 1);
            String name = getFormName(sc.nextLine().trim());
            String[] parts = sc.nextLine().split("\\s+");
            int st = Integer.parseInt(parts[1]);
            int en = Integer.parseInt(parts[2]);
            ds[i] = new KhanhHang(id, name, parts[0], en - st);
        }
        Arrays.sort(ds);
        for (KhanhHang x : ds) {
            System.out.println(x);
        }
    }
}
