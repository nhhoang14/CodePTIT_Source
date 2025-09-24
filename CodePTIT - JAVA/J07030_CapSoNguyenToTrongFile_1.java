/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07030_CapSoNguyenToTrongFile_1 {

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
            if (isPrime(x) && isPrime(tmp) && set2.contains(tmp)) {
                System.out.println(x + " " + tmp);
            }
        }
    }
}
