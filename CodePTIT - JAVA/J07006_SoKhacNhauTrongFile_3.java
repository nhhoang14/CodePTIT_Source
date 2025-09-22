/* @author @nhhoang14 */

import java.io.*;
import java.util.*;

public class J07006_SoKhacNhauTrongFile_3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] freq = new int[1000];
         for (int x : list) {
            freq[x]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }
}
