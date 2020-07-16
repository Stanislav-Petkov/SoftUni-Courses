import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals11x {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        diagonalOrder(matrix, rows, cols);
        System.out.println();
    }

    static void diagonalOrder(int matrix[][], int rows, int cols) {

        for (int line = 1; line <= (rows + cols - 1); line++) {

            int start_col = max(0, rows - line + 1);

            int count = min(line, (cols - start_col), rows);

            for (int j = 0; j < count; j++) {
                int row = max(rows, line) - j - 1;
                if (row >= matrix.length) {
                    for (int i = 0; i < 3; i++) {
                        row = matrix.length - 1 - i;
                        int col1 = start_col + i;
                        System.out.print(matrix[row][col1] + " ");
                    }
                    break;
                }
                int col = start_col + j;
                System.out.print(matrix[max(rows, line) - j - 1][start_col + j] + " ");
            }

            System.out.println();
        }
    }

    // A utility function to find min
    // of two integers
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // A utility function to find min
    // of three integers
    static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    // A utility function to find max
    // of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}
