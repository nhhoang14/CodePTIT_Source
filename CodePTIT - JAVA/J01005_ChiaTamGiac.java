import java.util.Scanner;

public class J01005_ChiaTamGiac {
    public static Scanner ip = new Scanner(System.in);
    
    public static void testcase(){
        int n = ip.nextInt();
        int h = ip.nextInt();
        double ps = 1.0 / n;
        for (int i = 1; i < n; i++) {
            double res = h * Math.sqrt(i * ps);
            System.out.printf("%.6f ", res);
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int tc = ip.nextInt();
        while(tc-- >0){
            testcase();
        }
    }
}
