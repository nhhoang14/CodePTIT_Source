/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07016_SoNguyenToTrongHaiFileNhiPhan {

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

    public static Map<Integer, Integer> ip(String file) throws IOException, FileNotFoundException, ObjectStreamException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        ArrayList<Integer> ds = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> m = new HashMap<>();
        for (int x : ds) {
            if (prime[x]) {
                m.put(x, m.getOrDefault(x, 0) + 1);
            }
        }
        return m;
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ObjectStreamException, ClassNotFoundException {
        sieve();
        Map<Integer, Integer> m1 = ip("DATA1.in");
        Map<Integer, Integer> m2 = ip("DATA2.in");
        Set<Integer> inter = new TreeSet<>(m1.keySet());
        inter.retainAll(m2.keySet());
        for (int x : inter) {
            System.out.println(x + " " + m1.get(x) + " " + m2.get(x));
        }

    }
}
