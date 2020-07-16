import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] text = new String[rows][cols];
        for (int i = 0; i < text.length; i++) {
            text[i] = scanner.nextLine().split("\\s+");
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            try {
                String[] tokens = input.split("\\s+");

                if (!tokens[0].equalsIgnoreCase("swap") || tokens.length > 5) {
                    throw new IllegalStateException();
                }
                int r1 = Integer.parseInt(tokens[1]);
                int c1 = Integer.parseInt(tokens[2]);
                int r2 = Integer.parseInt(tokens[3]);
                int c2 = Integer.parseInt(tokens[4]);

                String temp = text[r1][c1];
                text[r1][c1] = text[r2][c2];
                text[r2][c2] = temp;
                printMatrix(text);
            } catch (IndexOutOfBoundsException | IllegalStateException ex) {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] text) {
        for (int row = 0; row < text.length; row++) {
            for (int col = 0; col < text[row].length; col++) {
                System.out.print(text[row][col] + " ");
            }
            System.out.println();
        }
    }
}
