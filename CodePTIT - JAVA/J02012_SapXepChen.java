import java.util.Scanner;

public class J02012_SapXepChen {
    
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
            System.out.printf("Buoc %d: ", i);
            int pos = i;
            while(pos > 0 && arr[pos] < arr[pos - 1]){
                swap(arr, pos - 1, pos);
                pos--;
            }
            for (int j = 0; j <= i; j++){
                System.out.printf("%d ", arr[j]);
            }
            System.out.println("");
        }
    }
}
