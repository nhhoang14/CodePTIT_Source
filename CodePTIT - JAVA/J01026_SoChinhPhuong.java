/* @author @nhhoang14 */

import java.util.*;

public class J01026_SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            int n = sc.nextInt();
            int tmp = (int)Math.sqrt(n);
            if(tmp * tmp == n){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
