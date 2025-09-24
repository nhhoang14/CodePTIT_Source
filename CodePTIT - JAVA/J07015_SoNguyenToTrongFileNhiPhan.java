/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07015_SoNguyenToTrongFileNhiPhan {

    public static final int MAX = 10000;
    public static boolean[] prime = new boolean[MAX + 1];

    public static void sieve() {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SONGUYEN.in")));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        int[] cnt = new int[MAX + 1];
        for (int x : list) {
            if (prime[x]) cnt[x]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= MAX; i++) {
            if (cnt[i] > 0) {
                sb.append(i).append(" ").append(cnt[i]).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
