import java.util.Scanner;

public class J03006_SoDep_1 {

    public static boolean check(String s){
        int len = s.length();
        int end = len/2 + 1;
        for(int i = 0; i <= end; i++){
            if(s.charAt(i) != s.charAt(len - 1 - i)) return false;
            if((s.charAt(i) - '0') % 2 != 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
