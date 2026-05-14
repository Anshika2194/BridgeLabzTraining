import java.util.Scanner;
import java.util.Arrays;

public class Ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        mergeArray(arr1, arr2);
    }

    static void mergeArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < n1) result[k++] = arr1[i++];
        while (j < n2) result[k++] = arr2[j++];

        System.out.println(Arrays.toString(result));
    }
}