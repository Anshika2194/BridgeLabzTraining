
import java.util.Scanner;
import java.util.Arrays;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotateArray(arr, n);
    }

    static void rotateArray(int[] arr, int n) {
        if (n <= 1) return; 
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        System.out.println(Arrays.toString(arr));
    }
}