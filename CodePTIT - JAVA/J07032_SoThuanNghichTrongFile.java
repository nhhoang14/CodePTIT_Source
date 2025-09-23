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

    public static void inputList(Map<Integer,Integer> freq, String s) throws IOException, ClassNotFoundException, FileNotFoundException {
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s));
//        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
//        ois.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }
        for(int x : list){
            if(check(x)){
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        inputList(freq, "DATA1.in");
        inputList(freq, "DATA2.in");
        int cnt = 0;
        for (Map.Entry<Integer,Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
            cnt++;
            if (cnt == 10) break;
        }
    }
}
