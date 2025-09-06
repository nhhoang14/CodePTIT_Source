import java.util.Scanner;

public class J02007_DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        for(int t = 1; t <= tc; t++){
            System.out.printf("Test %d:\n", t);
            int n = ip.nextInt();
            int[] a = new int[n];
            int[] dd = new int[10005];

            for(int i = 0; i < n; i++) {
                a[i] = ip.nextInt();
                dd[a[i]]++;
            }
            
            for(int i = 0; i < n; i++) {
                if (dd[a[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n",a[i] , dd[a[i]]);
                    dd[a[i]] = 0;
                }
            }
        }
    }
}
