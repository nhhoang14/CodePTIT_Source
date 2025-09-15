/* @author @nhhoang14 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MonHoc implements Comparable<MonHoc> {

    private String code, name, method;

    public MonHoc() {
        this("", "", "");
    }

    public MonHoc(String code, String name, String method) {
        this.code = code;
        this.name = name;
        this.method = method;
    }

    @Override
    public int compareTo(MonHoc other) {
        return this.code.compareTo(other.code);
    }

    @Override
    public String toString() {
        return code + " " + name + " " + method;
    }
}

public class J07058_DanhSachMonThi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner ip = new Scanner(new File("MONHOC.in"));
        int tc = Integer.parseInt(ip.nextLine());
        MonHoc[] ds = new MonHoc[tc];
        for (int i = 0; i < tc; i++) {
            String code = ip.nextLine();
            String name = ip.nextLine();
            String method = ip.nextLine();
            ds[i] = new MonHoc(code, name, method);
        }
        Arrays.sort(ds);
        for (MonHoc mh : ds) {
            System.out.println(mh);
        }
    }
}
