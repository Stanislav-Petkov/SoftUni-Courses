import java.util.Arrays;
import java.util.Scanner;

public class MaximaSum04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = readIntArray(scanner);
        int rows = values[0];
        int cols = values[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readIntArray(scanner);
        }
        int indexRow = 0;
        int indexCol = 0;
        int maxSum = Integer.MIN_VALUE;
        int biggestMatrix[][] = new int[3][3];
        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int currentSum = calculateSumOfSubMatrix(matrix, row, col);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    indexRow = row;
                    indexCol = col;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        printMaxMatrix(matrix, indexRow, indexCol);
    }

    private static void printMaxMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int row = indexRow - 1; row < indexRow + 2; row++) {
            for (int col = indexCol - 1; col < indexCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateSumOfSubMatrix(int[][] matrix, int row, int col) {
        int sum = 0;
        sum += matrix[row][col];
        //R
        sum += matrix[row][col + 1];
        //L
        sum += matrix[row][col - 1];
        //U
        sum += matrix[row - 1][col];
        //D
        sum += matrix[row + 1][col];
        //RU
        sum += matrix[row - 1][col + 1];
        //RD
        sum += matrix[row + 1][col + 1];
        //LU
        sum += matrix[row - 1][col - 1];
        //LD
        sum += matrix[row + 1][col - 1];

        return sum;
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
