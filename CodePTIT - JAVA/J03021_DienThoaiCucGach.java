import java.util.Scanner;

public class J03021_DienThoaiCucGach {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int tc = ip.nextInt();
        ip.nextLine();
        while (tc-- > 0) {
            String s = ip.nextLine().toUpperCase();
            String[] ds = {"2ABC", "3DEF", "4GHI", "5JKL", "6MNO", "7PQRS", "8TUV", "9WXYZ"};
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                for(String kt : ds){
                    if(kt.contains(String.valueOf(c))){
                        sb.append(kt.charAt(0));
                    }
                }
            }
            if(sb.toString().equals(sb.reverse().toString())){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
