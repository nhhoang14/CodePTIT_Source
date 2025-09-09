import java.util.*;

public class J03013_HieuSoNguyenLon {

    public static void cmp(String[] arr, String a, String b) {
        arr[0] = a;
        arr[1] = b;
        int len1 = a.length();
        int len2 = b.length();
        if (len1 < len2) {
            arr[0] = b;
            arr[1] = "0".repeat(len2 - len1) + a;
        } else if (len1 > len2){
            arr[1] = "0".repeat(len1 - len2) + b;
        } else {
            if(a.compareTo(b) < 0) {
                arr[0] = b;
                arr[1] = a;
            }
        }
    }

    public static String minus(String[] arr){
        int len = arr[0].length();
        char[] res = new char[len];
        int du = 0;
        for(int i = len - 1; i >=0; i++){
            int so1 = arr[0].charAt(i) - '0';
            int so2 = arr[1].charAt(i)- '0' + du;
            if(so1 < so2){
                so1 += 10;
                du = 1;
            } else {
                du = 0;
            }
            res[i] = (char) ('0' + (so1 - so2));
        }
        return new String(res);
    }
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String a = ip.nextLine();
            String b = ip.nextLine();
            String[] arr = new String[2];
            cmp(arr, a, b);
            System.out.println(minus(arr));
        }
    }
}
