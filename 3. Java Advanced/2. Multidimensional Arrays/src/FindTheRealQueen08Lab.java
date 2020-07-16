import java.util.Scanner;

public class FindTheRealQueen08Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = readCharMatrix(scanner, 8);
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'q' && isFound(row, col, matrix)) {
                    System.out.println(row + " " + col);
                }
            }
        }
    }

    private static boolean isFound(int row, int col, char[][] matrix) {
        for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
            for (int colDirection = -1; colDirection <= 1; colDirection++) {

                if (rowDirection == 0 && colDirection == 0) {
                    continue;
                }
                int currentRow = row + rowDirection;
                int currentCol = col + colDirection;

                boolean isValidPosition = isValidPosition(currentRow, currentCol, matrix);
                while (isValidPosition) {

                    if (matrix[currentRow][currentCol] == 'q') {
                        return false;
                    }

                    currentRow = currentRow + rowDirection;
                    currentCol = currentCol + colDirection;

                    isValidPosition = isValidPosition(currentRow, currentCol, matrix);
                }
            }
        }
        return true;
    }

    private static boolean isValidPosition(int currentRowPosition, int currentColPosition, char[][] matrix) {
        return currentRowPosition < matrix.length
                && currentRowPosition >= 0
                && currentColPosition < matrix[currentRowPosition].length
                && currentColPosition >= 0;
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

    private static String trimLineRemoveBlankSpaceAndNewLines(Scanner scanner) {
        String line = scanner.nextLine().trim();
        while (line.length() == 0) {
            line = scanner.nextLine().trim();
        }
        return line;
    }

}
