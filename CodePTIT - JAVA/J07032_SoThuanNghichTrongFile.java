/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07032_SoThuanNghichTrongFile {

    public static boolean check(int num) {
        String s = String.valueOf(num);
        int len = s.length();
        if(len < 3 || len % 2 == 0) return false;
        for(char c : s.toCharArray()){
            if((c - '0') % 2 == 0) return false;
        }
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }

    public static void inputList(Map<Integer,Integer> freq, String s) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        for(int x : list){
            if(check(x)){
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<Integer,Integer> freq1 = new HashMap<>();
        Map<Integer,Integer> freq2 = new HashMap<>();
        inputList(freq1, "DATA1.in");
        inputList(freq2, "DATA2.in");
        TreeMap<Integer,Integer> common = new TreeMap<>();
         for (int x : freq1.keySet()) {
            if (freq2.containsKey(x)) {
                common.put(x, freq1.get(x) + freq2.get(x));
            }
        }
        int cnt = 0;
        for (Map.Entry<Integer,Integer> e : common.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
            cnt++;
            if (cnt == 10) break;
        }
    }
}
