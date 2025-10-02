/* @author @nhhoang14 */

import java.util.*;

class Item {

    private String id, name;
    private long op1, op2;

    public Item(String id, String name, long op1, long op2) {
        this.id = id;
        this.name = name;
        this.op1= op1;
        this.op2= op2;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
     public long getPrice(String s){
        if(s.substring(2, 3).equals("1")) return op1;
        else return op2;
    }
}

class Order{
    private String id;
    private Item item;
    private long qty;

    public Order(String id, Item item, long qty) {
        this.id = id;
        this.item = item;
        this.qty = qty;
    }

    public long getTotal() {
        return this.qty * item.getPrice(this.id);
    }
    
    public long getDiscount() {
        if(this.qty >= 150) return this.getTotal() / 2;
        else if(this.qty >= 100) return this.getTotal() * 30 / 100;
        else if(this.qty >= 50) return this.getTotal() * 15 / 100;
        else return 0;
    }

    public long getRemain() {
        return this.getTotal() - this.getDiscount();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d",this.id, this.item.getName(), this.getDiscount(), this.getRemain());
    }
}

public class J06001_TinhToanHoaDonBanQuanAo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Item> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long op1 = Long.parseLong(sc.nextLine());
            long op2 = Long.parseLong(sc.nextLine());
            map.put(id, new Item(id, name, op1, op2));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Order> ds = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] parts = sc.nextLine().split("\\s+");
            String orderID = parts[0] + String.format("-%03d", i + 1);
            long qty = Long.parseLong(parts[1]);
            String itemID = orderID.substring(0, 2);
            Item item = map.get(itemID);
            ds.add(new Order(orderID, item, qty));
        }
        ds.forEach(e -> System.out.println(e));
    }
}
