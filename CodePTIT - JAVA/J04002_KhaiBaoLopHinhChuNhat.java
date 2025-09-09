
import java.util.*;

class Rectangle {

    private double w, h;
    private String c;

    public Rectangle() {
        w = 1;
        h = 1;
    }

    public Rectangle(double w, double h, String c) {
        this.w = w;
        this.h = h;
        this.c = c;
    }

    public double getWidth() {
        return this.w;
    }

    public void setWidth(double w) {
        this.w = w;
    }

    public double getHeight() {
        return this.h;
    }

    public void setHeight(double h) {
        this.h = h;
    }

    public String getColor() {
        return this.c.substring(0, 1).toUpperCase() + c.substring(1).toLowerCase();
    }

    public void setColor(String c) {
        this.c = c;
    }

    public double findArea() {
        return this.w * this.h;
    }

    public double findPerimeter() {
        return (this.w + this.h) * 2;
    }
    
    @Override
    public String toString() {
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}

public class J04002_KhaiBaoLopHinhChuNhat {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double w = ip.nextDouble();
        double h = ip.nextDouble();
        String c = ip.next();
        if (w > 0 && h > 0) {
            Rectangle rect = new Rectangle(w, h, c);
            System.out.println(rect);
        } else {
            System.out.println("INVALID");
        }
    }
}

