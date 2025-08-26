import java.util.Scanner;

public class J01010_CatDoi {
    
    public static String convert(String s){
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length();
        for (int i = 0; i < len; i++) {
            char kt = sb.charAt(i);
            if(kt == '0' || kt == '8' || kt == '9'){
                sb.setCharAt(i, '0');
            } else if (kt == '1'){
                sb.setCharAt(i, '1');
            } else{
                return "INVALID";
            }
        }
        String res = sb.toString().replaceAll("^0+", "");
        return res.isEmpty() ? "INVALID" : res;
    }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while(tc-- >0){
            String s = ip.nextLine();
            System.out.println(convert(s));
        }
    }
}