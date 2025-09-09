
import java.util.Scanner;

public class J03027_RutGonXauKyTu {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.nextLine();
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        while(i < sb.length() - 1){
            if(sb.charAt(i) == sb.charAt(i + 1)){
                sb.delete(i, i + 2);
                if (i > 0) i--;
            } else {
                i++;
            }
        }
        if(sb.length() > 0){
            System.out.println(sb.toString());
        } else {
            System.out.println("Empty String");
        }
    }
}
