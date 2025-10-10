/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TinChi implements Comparable<TinChi>{
    private String id, name, method, place;
    private int tc;
    
    public TinChi(String id, String name, int tc, String method, String place){
        this.id = id;
        this.name = name;
        this.tc = tc;
        this.method = method;
        this.place = place;
    }
    
    public String getMethod(){
        return this.method;
    }
    @Override
    public int compareTo(TinChi other){
        return this.id.compareTo(other.id);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d %s %s", this.id, this.name, this.tc, this.method, this.place);
    }
}

public class J07073_DangKyHinhThucGiangDay {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<TinChi> ds = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int tc = Integer.parseInt(sc.nextLine());
            String method = sc.nextLine();
            String place = sc.nextLine();
            if(!place.equals("Truc tiep")){
                ds.add(new TinChi(id, name, tc, method, place));
            }
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}