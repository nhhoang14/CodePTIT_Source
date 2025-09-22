/* @author @nhhoang14 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07004_SoKhacNhauTrongFile_1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] freq = new int[1000];
        while (sc.hasNext()) {
            int n = sc.nextInt();
            freq[n]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > 0) {
                sb.append(i).append(" ").append(freq[i]).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
