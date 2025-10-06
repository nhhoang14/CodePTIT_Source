/* @author @nhhoang14 */

import java.util.*;

public class J08020_KiemTraDayNgoacDung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while(tc-- >0){
            String line = sc.nextLine();
            Stack<Character> st = new Stack();
            boolean ok = true;
            for(char c : line.toCharArray()){
                switch(c){
                    case '}':
                        if(st.isEmpty() || st.pop() != '{') ok = false;
                        break;
                    case ']':
                        if(st.isEmpty() || st.pop() != '[') ok = false;
                        break;
                    case ')':
                        if(st.isEmpty() || st.pop() != '(') ok = false;
                        break;    
                    default:
                        st.push(c);
                        break;
                }
                if(!ok) break;
            }
            if(!st.isEmpty()) ok = false;
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
