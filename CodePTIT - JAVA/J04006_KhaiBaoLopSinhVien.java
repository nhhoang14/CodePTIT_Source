import java.util.*;

class SinhVien {

    private String code, name, lop, date;
    private float diem;

    public SinhVien() {
        this("B20DCCN001", "", "", "", 0);
    }
    
    public SinhVien(String code, String name, String lop, String date, float diem) {
        this.code = code;
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.diem = diem;
    }

   public String getFormDate() {
       StringBuilder sb = new StringBuilder(this.date);
       if(sb.charAt(1) == '/') sb.insert(0, '0');
       if(sb.charAt(4) == '/') sb.insert(3, '0');
       return sb.toString();
   }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f",this.code, this.name, this.lop, this.getFormDate(), this.diem);
    }
}


public class J04006_KhaiBaoLopSinhVien {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        SinhVien sv = new SinhVien("B20DCCN001",ip.nextLine(), ip.nextLine(), ip.nextLine(), ip.nextFloat());
        System.out.print(sv);
    }
}
