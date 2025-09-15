/* @author @nhhoang14 */

import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {

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
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            for (int num : arr) {
                System.out.printf("%d ", num);
            }
            System.out.println("");
        }
    }
}
