/* @author @nhhoang14 */

import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen_2 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine().trim().toLowerCase();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < arr.length; i++) {
                String word = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
                sb.append(word).append(" ");
            }
            String fn = arr[0].toUpperCase();
            System.out.println(sb.toString().trim() + ", " + fn);
        }
    }
}
