/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class KhachHang implements Comparable<KhachHang>{

    private final String id, name, room, st, en;
    private final int fee;
    
    public KhachHang(String id, String name, String room, String st, String en, int fee){
        this.id = id;
        this.name = name;
        this.room = room;
        this.st = st;
        this.en = en;
        this.fee = fee;
    }
    
    public long getDay() {
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate st = LocalDate.parse(this.st, ft);
        LocalDate en = LocalDate.parse(this.en, ft);
        return ChronoUnit.DAYS.between(st, en) + 1;
    }
    
    public long getTotal(){
        char floor = this.room.charAt(0);
        int price = 0;
        if (floor == '1') price = 25;
        else if (floor == '2') price = 34;
        else if (floor == '3') price = 50;
        else price = 80;
        return price * this.getDay() + this.fee;
    }
    
    @Override
    public int compareTo(KhachHang other){
        return Long.compare(other.getTotal(), this.getTotal());
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d", this.id, this.name, this.room, this.getDay(), this.getTotal());
    }
}

public class J07051_TinhTienPhong {

    public static String getFormName(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String x : parts) {
            sb.append(x.substring(0, 1).toUpperCase())
                    .append(x.substring(1).toLowerCase())
                    .append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String getFormDate(String s) {
        String[] parts = s.split("/");
        String day = parts[0].length() == 1 ? "0" + parts[0] : parts[0];
        String month = parts[1].length() == 1 ? "0" + parts[1] : parts[1];
        String year = parts[2];
        return day + "/" + month + "/" + year;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = "KH" + String.format("%02d", i + 1);
            String name = getFormName(sc.nextLine().trim());
            String room = sc.nextLine();
            String st = getFormDate(sc.nextLine().trim());
            String en = getFormDate(sc.nextLine().trim());
            int fee = Integer.parseInt(sc.nextLine());
            ds.add(new KhachHang(id, name, room, st, en, fee));
        }
        Collections.sort(ds);
        ds.forEach(e -> System.out.println(e));
    }
}