/* @author @nhhoang14 */

import java.util.*;

class KH{

    private String id, type;
    private int range;

    public KH(String id, String type, int range) {
        this.id = id;
        this.type = type;
        this.range = range;
    }

    public int getHs(){
        if(this.type.equals("KD")) return 3;
        else if(this.type.equals("NN")) return 5;
        else if(this.type.equals("TT")) return 4;
        else return 2;
    }
    
    public long getTmpPrice(){
        return this.range * this.getHs() * 550;
    }
    
    public long getSubPrice(){
        if(this.range < 50) return 0;
        else if(this.range <= 100) return Math.round(this.getTmpPrice() * 0.35f);
        else return this.getTmpPrice();
    }
    
    public long getTotal(){
        return this.getTmpPrice() + this.getSubPrice();
    }
    
    @Override
    public String toString() {
        return String.format("%s %d %d %d %d", this.id, this.getHs(), this.getTmpPrice(), this.getSubPrice(), this.getTotal());
    }
}

public class J05050_TinhTienDien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        KH[] ds = new KH[n];
        for (int i = 0; i < n; i++) {
            String id = "KH" + String.format("%02d", i + 1);
            String type = sc.nextLine();
            int st = Integer.parseInt(sc.nextLine());
            int en = Integer.parseInt(sc.nextLine());
            ds[i] = new KH(id, type, en - st);
        }
        for (KH x : ds) {
            System.out.println(x);
        }
    }
}