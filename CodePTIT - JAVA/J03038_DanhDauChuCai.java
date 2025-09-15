/* @author @nhhoang14 */

import java.util.Scanner;

public class J03038_DanhDauChuCai {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!sb.toString().contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        System.out.print(sb.length());
    }
}
