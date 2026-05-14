import java.util.Scanner;

public class Ques12 {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        int result = sumOf(matrix);

        System.out.println(result);
    }
  static int sumOf(int[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }
}
