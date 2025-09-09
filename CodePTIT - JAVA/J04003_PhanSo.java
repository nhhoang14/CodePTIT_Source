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
    
    @Override
    public String toString() {
        return String.format("%d/%d", this.tu, this.mau);
    }
    
}

public class J04003_PhanSo {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        PhanSo ps = new PhanSo(ip.nextLong(), ip.nextLong());
        System.out.print(ps);
    }
}
