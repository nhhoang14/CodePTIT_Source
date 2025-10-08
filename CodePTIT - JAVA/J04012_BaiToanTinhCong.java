/* @author @nhhoang14 */

import java.util.*;

class NhanVien {
    private String name, pos;
    private int ipd, day;
    
    public NhanVien(String name, int ipd, int day, String pos){
        this.name = name;
        this.ipd = ipd;
        this.day = day;
        this.pos = pos;
    }
    
    public int getSalary(){
        return this.ipd * this.day;
    }
    
    public int getBonus(){
        if(this.day >= 25) return this.getSalary() * 20 / 100;
        else if (this.day >= 22) return this.getSalary() * 10 / 100;
        else return 0;
    }
    
    public int getAllowance(){
        if(this.pos.equals("GD")) return 250000; 
        else if(this.pos.equals("PGD")) return 200000; 
        else if(this.pos.equals("TP")) return 180000; 
        else return 150000;
    }
    
    public int getTotal(){
        return this.getSalary() + this.getBonus() + this.getAllowance();
    }
    
    @Override
    public String toString(){
        return String.format("NV01 %s %d %d %d %d", this.name, this.getSalary(), this.getBonus(), this.getAllowance(), this.getTotal());
    }
}

public class J04012_BaiToanTinhCong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int ipd = Integer.parseInt(sc.nextLine());
        int day = Integer.parseInt(sc.nextLine());
        String pos = sc.nextLine();
        System.out.print(new NhanVien(name, ipd, day, pos));
    }
}
