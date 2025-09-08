import java.util.Scanner;

public class J03004_ChuanHoaXauHoTen_1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine();
            String[] arr = s.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String x : arr) {
                if (!x.isEmpty()) {
                    String word = Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
                    sb.append(word).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
}
