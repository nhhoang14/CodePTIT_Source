/* @author @nhhoang14 */

import java.util.*;

public class JKT015_GoBanPhim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        ListIterator<Character> it = list.listIterator();
        for (char c : line.toCharArray()) {
            switch (c) {
                case '<':
                    if (it.hasPrevious()) it.previous();
                    break;
                case '>':
                    if (it.hasNext()) it.next();
                    break;
                case '-':
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(c);
                    break;
            }
        }
        list.forEach(e -> System.out.print(e));
    }
}
