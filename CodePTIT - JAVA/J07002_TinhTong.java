/* @author @nhhoang14 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07002_TinhTong {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                sum += Integer.parseInt(s);
            } catch (Exception e) {

            }
        }
        System.out.println(sum);
    }
}
