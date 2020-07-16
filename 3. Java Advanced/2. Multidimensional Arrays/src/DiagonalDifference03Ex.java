import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int firstSum = calFirstSum(matrix);
        int secSum = calSecondarySum(matrix);

        System.out.println(Math.abs(secSum - firstSum));
    }

    private static int calFirstSum(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int calSecondarySum(int[][] matrix) {
        int sum = 0;
        int row = 0;
        int col = matrix.length - 1;
        while (col >= 0 && row < matrix.length) {
            sum += matrix[row++][col--];

        }
        return sum;
    }
}
