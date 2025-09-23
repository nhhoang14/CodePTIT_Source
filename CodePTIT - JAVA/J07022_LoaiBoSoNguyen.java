/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07022_LoaiBoSoNguyen {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> ds = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (Exception e) {
                ds.add(s);
            }
        }
        Collections.sort(ds);
        for (String s : ds) {
            System.out.print(s + " ");
        }
    }
}
