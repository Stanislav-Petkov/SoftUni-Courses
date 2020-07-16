import java.util.Scanner;

public class SumMatrixElements04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);

        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] arr = line.split(", ");
        int rows = Integer.parseInt(arr[0]);
        System.out.println(rows);
        int cols = Integer.parseInt(arr[1]);
        System.out.println(cols);
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
