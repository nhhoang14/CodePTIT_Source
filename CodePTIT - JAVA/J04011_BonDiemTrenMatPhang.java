/* @author @nhhoang14 */

import java.util.*;

class Point3D {

    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = (short)x;
        this.y = (short)y;
        this.z = (short)z;
    }
    
    public Point3D(Point3D p1, Point3D p2) {
        this.x = (short)(p2.getX() - p1.getX());
        this.y = (short)(p2.getY() - p1.getY());
        this.z = (short)(p2.getZ() - p1.getZ());
    }

    public int getX(){ return (short)this.x; }
    public int getY(){ return (short)this.y; }
    public int getZ(){ return (short)this.z; }

    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D ab = new Point3D(p1, p2);
        Point3D ac = new Point3D(p1, p3);
        int a = ab.getY() * ac.getZ() - ab.getZ() * ac.getY();
        int b = ab.getZ() * ac.getX() - ab.getX() * ac.getZ();
        int c = ab.getX() * ac.getY() - ab.getY() * ac.getX();
        int res = a * (p4.getX() - p1.getX()) + b * (p4.getY() - p1.getY()) + c * (p4.getZ() - p1.getZ());
        return res == 0 ? true : false;
    }
}

public class J04011_BonDiemTrenMatPhang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main764018(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main9882426(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
    public static void main3863512(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
