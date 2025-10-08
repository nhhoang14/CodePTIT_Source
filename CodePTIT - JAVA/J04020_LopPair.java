/* @author @nhhoang14 */

import java.util.*;

class Pair<U, V> {

    private U first;
    private V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public static boolean check(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        if (this.first instanceof Integer && this.second instanceof Integer) {
            return check((Integer) this.first) && check((Integer) this.second);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }
}

public class J04020_LopPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }
}
