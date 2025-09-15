/* @author @nhhoang14 */

import java.util.Scanner;

public class J02013_SapXepNoiBot {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int pos = 0;
            boolean check = true;
            while (pos < n - 1) {
                if (arr[pos] > arr[pos + 1]) {
                    swap(arr, pos, pos + 1);
                    check = false;
                }
                pos++;
            }
            if (check) break;
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", arr[j]);
            }
            System.out.println("");
        }
    }
}
