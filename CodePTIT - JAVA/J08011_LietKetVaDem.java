/* @author @nhhoang14 */

import java.util.*;

public class J08011_LietKetVaDem {

    public static boolean check(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> freq = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (check(word)) {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
