import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static Scanner ip = new Scanner(System.in);
    
    public static boolean check(long num) {
        long a = num % 10;
        long sum = a;
        while(num > 0){
            num /= 10;
            long b = num % 10;
            if(a == b) return  false;
            else a = b;
            sum += b;
        }
        return sum % 10 == 0;
    }
    
    public static void main(String[] args) {
        int tc = ip.nextInt();
        while(tc-- >0){
            long num = ip.nextLong();
            if(check(num)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
