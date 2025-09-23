/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07029_SoNguyenToLonNhatTrongFile {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        for(int x : list){
            if(isPrime(x)){
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        }
        int cnt = 0;
        for (Map.Entry<Integer,Integer> e : freq.descendingMap().entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
            cnt++;
            if (cnt == 10) break;
        }
    }
}
