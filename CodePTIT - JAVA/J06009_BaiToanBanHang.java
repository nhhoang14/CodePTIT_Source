/* @author @nhhoang14 */

import java.util.*;
import java.io.*;

class KhachHang {

    private String MaKH, TenKH, GioiTinh, NgaySinh, DiaChi;

    public KhachHang(String MaKH, String TenKH, String GioiTinh, String NgaySinh, String DiaChi) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
    }

    public String getMaKH() {
        return MaKH;
    }

    @Override
    public String toString() {
        return this.TenKH + " " + this.DiaChi + " ";
    }
};

class MatHang {

    private String MaMH, TenMH, DonVi;
    private int GiaMua, GiaBan;

    public MatHang(String MaMH, String TenMH, String DonVi, int GiaMua, int GiaBan) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.DonVi = DonVi;
        this.GiaMua = GiaMua;
        this.GiaBan = GiaBan;
    }

    public String getMaMH() {
        return MaMH;
    }

    public int getGiaBan() {
        return GiaBan;
    }
    
    @Override
    public String toString() {
        return this.TenMH + " " + this.DonVi + " " + this.GiaMua + " " + this.GiaBan + " ";
    }
};

public class J06009_BaiToanBanHang {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner f1 = new Scanner(new File("KH.in"));
        ArrayList<KhachHang> dsKH = new ArrayList<>();
        int n = Integer.parseInt(f1.nextLine());
        for (int i = 1; i <= n; i++) {
            String MaKH = "KH" + String.format("%03d", i);
            String TenKH = f1.nextLine();
            String GioiTinh = f1.nextLine();
            String NgaySinh = f1.nextLine();
            String DiaChi = f1.nextLine();
            dsKH.add(new KhachHang(MaKH, TenKH, GioiTinh, NgaySinh, DiaChi));
        }
        Scanner f2 = new Scanner(new File("MH.in"));
        ArrayList<MatHang> dsMH = new ArrayList<>();
        int m = Integer.parseInt(f2.nextLine());
        for (int i = 1; i <= m; i++) {
            String MaMH = "MH" + String.format("%03d", i);
            String TenMH = f2.nextLine();
            String DonVi = f2.nextLine();
            int GiaMua = Integer.parseInt(f2.nextLine());
            int GiaBan = Integer.parseInt(f2.nextLine());
            dsMH.add(new MatHang(MaMH, TenMH, DonVi, GiaMua, GiaBan));
        }
        Scanner f3 = new Scanner(new File("HD.in"));
        int k = Integer.parseInt(f3.nextLine());
        for (int i = 1; i <= k; i++) {
            String MaHD = "HD" + String.format("%03d ", i);
            StringBuilder sb = new StringBuilder(MaHD);
            String[] tmp = f3.nextLine().split(" ");
            for (KhachHang e : dsKH) {
                if (tmp[0].equals(e.getMaKH())) {
                    sb.append(e.toString());
                    break;
                }
            }
            int total = Integer.parseInt(tmp[2]);
            for (MatHang e : dsMH) {
                if (tmp[1].equals(e.getMaMH())) {
                    sb.append(e.toString());
                    total *= e.getGiaBan();
                    break;
                }
            }
            sb.append(tmp[2] + " ").append(total);
            System.out.println(sb.toString());
        }
    }
}
