import java.util.Scanner;

public class MaximumSumof2X2Submatrix05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix2(scanner);

        int maxSum = Integer.MIN_VALUE;
        int maxSumRow = 0;
        int maxSumCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumRow = row;
                    maxSumCol = col;
                }
            }
        }
        for (int row = maxSumRow; row <= maxSumRow + 1; row++) {
            for (int col = maxSumCol; col <= maxSumCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[][] readMatrix2(Scanner scanner) {
        String[] line = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] currentLine = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(currentLine[col].trim());
            }
        }
        return matrix;
    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] arr = line.split(", ");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            arr = line.split(", ");
            for (int i = 0; i < arr.length; i++) {
                matrix[row][i] = Integer.parseInt(arr[i]);
            }
        }
        return matrix;
    }
}
