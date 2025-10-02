/* @author @nhhoang14 */

import java.util.*;

class CLB {

    private String id, name;
    private int price;

    public CLB(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}

class Match {

    private String id;
    private CLB club;
    private long qty;

    public Match(String id, CLB club, long qty) {
        this.id = id;
        this.club = club;
        this.qty = qty;
    }

    public long getTotal() {
        return this.qty * club.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.id, this.club.getName(), this.getTotal());
    }
}

public class J05069_CauLacBoBongDa_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, CLB> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            map.put(id, new CLB(id, name, price));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Match> match = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] parts = sc.nextLine().split("\\s+");
            String matchID = parts[0];
            long qty = Long.parseLong(parts[1]);
            String clubID = matchID.substring(1, 3);
            CLB club = map.get(clubID);
            match.add(new Match(matchID, club, qty));
        }
        match.forEach(e -> System.out.println(e));
    }
}
