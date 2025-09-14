import java.util.*;

public class J01011_BoiSoChung_UocSoChung {
    
    public static long gcd(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while(tc-- >0){
            long a = ip.nextLong();
            long b = ip.nextLong();
            long mul = a* b;
            long uc = gcd(a, b);
            System.out.printf("%d %d\n", mul / uc, uc);
        }
    }
}
