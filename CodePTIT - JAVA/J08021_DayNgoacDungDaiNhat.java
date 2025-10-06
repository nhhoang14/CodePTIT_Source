/* @author @nhhoang14 */

import java.util.*;

public class J08021_DayNgoacDungDaiNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while(tc-- >0){
            String s = sc.nextLine();
            Stack<Integer> st = new Stack();
            st.push(-1);
            int len = 0, res = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ')'){
                    st.pop();
                    if (st.isEmpty()) st.push(i);
                    else res = Math.max(res, i - st.peek());
                } else {
                    st.push(i);
                }
            }
            System.out.println(res);
        }
    }
}