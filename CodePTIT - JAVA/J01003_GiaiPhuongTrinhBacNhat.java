import java.util.Scanner;

public class J01003_GiaiPhuongTrinhBacNhat{
    public static Scanner ip = new Scanner(System.in);

    public static void main(String[] args){
        float a = ip.nextFloat();
        float b = ip.nextFloat();
        if (a == 0f) {
            if (b == 0f) {
                System.out.print("VSN");
            } else {
                System.out.print("VN");
            }
        } else {
            System.out.printf("%.2f", -b/a);
        }
    }
}