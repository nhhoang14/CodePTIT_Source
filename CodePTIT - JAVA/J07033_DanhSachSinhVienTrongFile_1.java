/* @author @nhhoang14 */

import java.util.*;
import java.io.*;
import java.text.*;

class SinhVien implements Comparable<SinhVien>{

    private String id, name, lop, email;

    public SinhVien(String id, String name, String lop, String email) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getFormName() {
        StringBuilder sb = new StringBuilder();
        String[] res = this.name.split(" ");
        for (String word : res) {
            if (!word.isEmpty()) {
                sb.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }
    
    @Override
    public int compareTo(SinhVien other){
        return other.id.compareTo(this.id);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s", this.id, this.getFormName(), this.lop, this.email);
    }
}

public class J07033_DanhSachSinhVienTrongFile_1 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        SinhVien[] ds = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            ds[i] = new SinhVien(id, name, lop, email);
        }
        Arrays.sort(ds);
        for(SinhVien sv : ds){
            System.out.println(sv);
        }
    }
}