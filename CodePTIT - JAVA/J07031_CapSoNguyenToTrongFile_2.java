/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07031_CapSoNguyenToTrongFile_2 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }

    public static ArrayList<Integer> inputList(String s) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(s)));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        return list;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Integer> lst1 = inputList("DATA1.in");
        ArrayList<Integer> lst2 = inputList("DATA2.in");
        Set<Integer> set1 = new TreeSet<>(lst1);
        Set<Integer> set2 = new TreeSet<>(lst2);
        final int SUM = 1000000;
        for (int x : set1) {
            if (x * 2 >= SUM) {
                break;
            }
            int tmp = SUM - x;
            if (set1.contains(tmp) && set1.contains(x) && !set2.contains(tmp) && !set2.contains(x)) {
                if (isPrime(x) && isPrime(tmp) && !set2.contains(tmp) && !set2.contains(x)) {
                    System.out.println(x + " " + tmp);
                }
            }
        }
    }
}
