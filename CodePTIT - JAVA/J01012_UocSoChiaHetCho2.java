import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while(tc-- >0){
            int n = ip.nextInt();
            int cnt = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) cnt++;
                    if ((n/i) % 2 == 0 && n/i != i) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        while(tc-- >0){
            int n = ip.nextInt();
            int cnt = 0;
            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) cnt++;
                    if ((n/i) % 2 == 0 && n/i != i) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}