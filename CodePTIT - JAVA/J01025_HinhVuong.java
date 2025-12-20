/* @author @nhhoang14 */

import static java.lang.Math.*;
import java.util.*;

public class J01025_HinhVuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] r1 = new int[4];
        int[] r2 = new int[4];
        for(int i = 0; i < 4; i++){
            r1[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 4; i++){
            r2[i] = sc.nextInt();
        }
        
        int minX = min(r1[0], r2[0]);
        int minY = min(r1[1], r2[1]);
        int maxX = max(r1[2], r2[2]);
        int maxY = max(r1[3], r2[3]);

        int res = max(maxX - minX, maxY - minY);
        System.out.print(res * res);
    }
}
