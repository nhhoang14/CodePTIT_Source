/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

public class J07085_TongChuSo {

    public static String gene(String s){
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                if(c == '0' && sb.length() == 0) continue;
                sb.append(c);
                res += c - '0';
            }
        }
        return sb.toString() + " " + res;
    }
    
    public static void main(String[] args) throws IOException, ObjectStreamException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds = (ArrayList<String>) ois.readObject();
        ds.forEach(e -> System.out.println(gene(e)));
    }
}