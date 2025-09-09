import java.util.*;

class PhanSo{
    private long tu, mau;
    
    public PhanSo(){
        this.tu = 0;
        this.mau = 1;
    }
    
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
        this.ToiGian();
    }
    
    private long gcd(long x, long y) {
        while (y != 0) {
            long z = x % y;
            x = y;
            y = z;
        }
        return x;
    }
    
    public void ToiGian() {
        long tmp = gcd(tu, mau);
        tu /= tmp;
        mau /= tmp;
    }
    
    public void CongPs(PhanSo a, PhanSo b) {
        tu = a.tu * b.mau + b.tu * a.mau;
        mau = a.mau * b.mau;
        ToiGian();
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.tu, this.mau);
    }
    
}

public class J04004_TongPhanSo {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        PhanSo ps1 = new PhanSo(ip.nextLong(), ip.nextLong());
        PhanSo ps2 = new PhanSo(ip.nextLong(), ip.nextLong());
        PhanSo res = new PhanSo();
        res.CongPs(ps1, ps2);
        System.out.print(res);
    }
}
