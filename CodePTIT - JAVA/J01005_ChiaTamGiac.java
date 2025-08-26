import java.util.Scanner;

public class J01005_ChiaTamGiac {
    public static Scanner ip = new Scanner(System.in);
    
    public static void testcase(){
        int n = ip.nextInt();
        int h = ip.nextInt();
        int i = 1;
        while(i == n){
            double res = h * Math.sqrt(i/n);
            System.out.printf("%.6f", res);
        }
    }
    
    public static void main(String args[]) {
        int tc = ip.nextInt();
        while(tc-- >0){
            testcase();
        }
    }
}
