import java.util.Scanner;

public class J03024_SoUuThe {
    
    public static String check(String s) {
        int sc = 0, sl = 0, len = s.length();
        if(s.charAt(0) == '0' || !s.matches("\\d+")) return "INVALID";
        for(char c : s.toCharArray()){
            int num = c - '0';
            if(num % 2 == 0) sc ++;
            else sl ++;
        }
        if (len % 2 == 0) return (sc > sl) ? "YES" : "NO";
        else return (sl > sc) ? "YES" : "NO";
    }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while(tc-- >0){
            String s = ip.nextLine();
            System.out.println(check(s));
        }
    }
}