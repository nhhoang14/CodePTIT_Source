/* @author @nhhoang14 */

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005_SoKhacNhauTrongFile_2 {

    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(
                                new BufferedInputStream(
                                    new FileInputStream("DATA.IN")));
        int[] freq = new int[1000];
        for (int i = 0; i < 100000; i++) {
            freq[dis.readInt()]++;
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
