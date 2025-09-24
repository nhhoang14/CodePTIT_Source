/* @author @nhhoang14 */

import java.io.*;
import java.util.*;

public class J07021_ChuanHoaXauHoTenTrongFile {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("END")) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            String[] res = s.split(" ");
            for (String word : res) {
                if (!word.isEmpty()) {
                    sb.append(word.substring(0, 1).toUpperCase())
                            .append(word.substring(1).toLowerCase()).append(" ");
                }
            }
            System.out.println(sb.toString());
        }
    }

}
