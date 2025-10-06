/* @author @nhhoang14 */

import java.util.*;
import static java.lang.Math.*;

class Point {

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }

    double distance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
}

class Triangle {

    private double ab, bc, ac;

    public Triangle(Point a, Point b, Point c) {
        this.ab = a.distance(b);
        this.bc = b.distance(c);
        this.ac = c.distance(a);
    }

    public boolean valid() {
        return (ab + bc > ac && ab + ac > bc && bc + ac > ab);
    }

    public String getPerimeter() {
        return String.format("%.3f", ab + bc + ac);
    }
}

public class J04019_LopTriangle_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}
