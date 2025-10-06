/* @author @nhhoang14 */

import java.util.*;
import static java.lang.Math.*;

class Point {

    private double x, y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    double distance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }

    double distance(Point a, Point b) {
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class J04010_DienTichHinhTronNgoaiTiepTamGiac {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while (tc-- > 0) {
            Point a = new Point(ip.nextDouble(), ip.nextDouble());
            Point b = new Point(ip.nextDouble(), ip.nextDouble());
            Point c = new Point(ip.nextDouble(), ip.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = a.distance(c);
            if (ab + bc > ac && ab + ac > bc && bc + ac > ab) {
                double p = (ab + bc + ac) / 2.0;
                double dt = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
                double r = (ab * bc * ac) / (4 * dt);
                double res = Math.PI * r * r;
                System.out.printf("%.3f\n", res);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
