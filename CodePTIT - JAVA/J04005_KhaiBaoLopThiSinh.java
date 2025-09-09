import java.util.*;

class ThiSinh {

    private String name, date;
    private double d1, d2, d3;

    public ThiSinh() {
        this.d1 = 0;
        this.d2 = 0;
        this.d3 = 0;
    }
    
    public ThiSinh(String name, String date, double d1, double d2, double d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getTotal() {
        return this.d1 + this.d2 + this.d3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f", this.name, this.date, this.getTotal());
    }
}

public class J04005_KhaiBaoLopThiSinh {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(ip.nextLine(), ip.nextLine(), ip.nextDouble(), ip.nextDouble(), ip.nextDouble());
        System.out.print(ts);
    }
}
