/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.text.ParseException;

class MonHoc implements Comparable<MonHoc> {

    private String id, name;
    private int tc;
    
    public MonHoc(String id, String name, int tc) throws ParseException {
        this.id = id;
        this.name = name;
        this.tc = tc;
    }
    
    @Override
    public int compareTo(MonHoc other) {
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %d", this.id, this.name, this.tc);
    }
}

public class J07034_DanhSachMonHoc {
    
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        MonHoc[] ds = new MonHoc[n];
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            ds[i] = new MonHoc(id, name, tc);
        }
        Arrays.sort(ds);
        for(MonHoc mh : ds){
            System.out.println(mh);
        }
    }
}
