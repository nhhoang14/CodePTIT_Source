/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CaThi implements Comparable<CaThi>{
    private String id, date, time, room;
    
    public CaThi(String id, String date, String time, String room){
        this.id = id;
        this.date = date;
        this.time = time;
        this.room = room;
    }
    
    @Override
    public int compareTo(CaThi other){
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime t1 = LocalDateTime.parse(this.date + " " + this.time, ft);
        LocalDateTime t2 = LocalDateTime.parse(other.date + " " + other.time, ft);
        return t1.compareTo(t2);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s", this.id, this.date, this.time, this.room);
    }
}

public class J07059_DanhSachCaThi {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> ds = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            String id = "C" + String.format("%03d", i + 1);
            String date = sc.nextLine();
            String time = sc.nextLine();
            String room = sc.nextLine();
            ds.add(new CaThi(id, date, time, room));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}