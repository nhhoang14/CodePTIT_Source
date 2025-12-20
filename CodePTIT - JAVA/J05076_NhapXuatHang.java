/* @author @nhhoang14 */

import java.util.*;

class Hang{
  
    private String id, name, type;
    private int im, price, ex;
    
    public Hang(String id, String name, String type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setIPE(int im, int price, int ex){
        this.im = im;
        this.price = price;
        this.ex = ex;
    }
    
    public long imTotal(){
        return im * price;
    }
    
    public long exTotal(){
        int tmp = ex * price;
        if(this.type.equals("A")) return Math.round(tmp * 1.08);
        else return Math.round(tmp * (this.type.equals("B") ? 1.05 : 1.02));
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d %d", this.id, this.name, this.imTotal(), this.exTotal());
    }
    
};

public class J05076_NhapXuatHang {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> ds = new ArrayList<>();
        while(n-- >0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            ds.add(new Hang(id, name, type));
        }
        int m = Integer.parseInt(sc.nextLine());
        while(m-- >0){
            String[] tmp = sc.nextLine().split(" ");
            int im = Integer.parseInt(tmp[1]);
            int price = Integer.parseInt(tmp[2]);
            int ex = Integer.parseInt(tmp[3]);
            for(Hang x : ds){
                if(tmp[0].equals(x.getId())){
                    x.setIPE(im, price, ex);
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}