import java.util.*;

public class J01009_TongGiaiThua {
    
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        long mul = 1, sum = 0;
        for(int i = 1; i <= n; i++){
            mul *= i;
            sum += mul;
        }
        System.out.print(sum);
    }
}
