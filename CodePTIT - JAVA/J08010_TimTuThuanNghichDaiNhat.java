/* @author @nhhoang14 */

import java.util.*;

public class J08010_TimTuThuanNghichDaiNhat {

    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxx = 0;
        Map<String, Integer> ds = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (check(word)) {
                    if (word.length() > maxx) {
                        maxx = word.length();
                        ds.clear();
                        ds.put(word, 1);
                    } else if (word.length() == maxx) {
                        ds.put(word, ds.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : ds.entrySet()) {
            System.out.printf("%s %d\n", entry.getKey(), entry.getValue());
        }
    }
}
