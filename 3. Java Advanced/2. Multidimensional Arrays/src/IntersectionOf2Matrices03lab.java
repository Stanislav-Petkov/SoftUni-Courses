import java.util.Scanner;

public class IntersectionOf2Matrices03lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(trimLineRemoveBlankSpaceAndNewLines(scanner));
        int cols = Integer.parseInt(trimLineRemoveBlankSpaceAndNewLines(scanner));

        char[][] firstMatrix = readCharMatrix(scanner, rows);
        char[][] secondMatrix = readCharMatrix(scanner, rows);
        char[][] resultMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    resultMatrix[row][col] = firstMatrix[row][col];
                } else {
                    resultMatrix[row][col] = '*';
                }
            }
        }
        printCharMatrix(resultMatrix);
        String tt = scanner.nextLine().trim();
    }

    private static void printCharMatrix(char[][] resultMatrix) {
        for (int row = 0; row < resultMatrix.length; row++) {
            for (int col = 0; col < resultMatrix[row].length; col++) {
                System.out.print(resultMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static String trimLineRemoveBlankSpaceAndNewLines(Scanner scanner) {
        String line = scanner.nextLine().trim();
        while (line.length() == 0) {
            line = scanner.nextLine().trim();
        }
        return line;
    }

    private static char[][] readCharMatrix(Scanner scanner, int rows) {

        char[][] matrix = new char[rows][];
        for (int row = 0; row < matrix.length; row++) {
            String line = trimLineRemoveBlankSpaceAndNewLines(scanner);
            String replaced = line.replaceAll("\\s+", "");
            char[] lineValues = replaced.toCharArray();
            matrix[row] = lineValues;

        }
        return matrix;
    }
}
