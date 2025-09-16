/* @author @nhhoang14 */

import java.util.*;

class GiangVien implements Comparable<GiangVien>{

    private String msv, name, khoa;

    public GiangVien(int msv, String name, String khoa) {
        this.msv = "GV" + String.format("%02d", msv);
        this.name = name;
        this.khoa = khoa;
    }

    public String getFirstName(){
        String[] full_name = this.name.split("\\s+");
        return full_name[full_name.length - 1];
    }
    
    @Override
    public int compareTo(GiangVien other){
        return this.getFirstName().compareTo(other.getFirstName());
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", this.msv, this.name, this.khoa);
    }
}

public class J05025_SapXepDanhSachGiangVien {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        ip.nextLine();
        GiangVien[] ds = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            String name = ip.nextLine();
            String[] khoa = ip.nextLine().toUpperCase().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(String x : khoa){
                sb.append(x.charAt(0));
            }
            ds[i] = new GiangVien(i + 1, name, sb.toString());
        }
        Arrays.sort(ds);
        for (GiangVien gv : ds) {
            System.out.println(gv);
        }
    }
}
