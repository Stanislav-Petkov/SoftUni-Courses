import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int charNumber1 = 97;
        int charNumber2 = 97;
        int charNumber3 = 97;
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.valueOf((char) charNumber1 + String.valueOf((char) charNumber2++) +
                        String.valueOf((char) charNumber3));

            }
            charNumber1++;
            charNumber2 = charNumber1;
            charNumber3++;
        }
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
