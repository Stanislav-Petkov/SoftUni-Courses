import java.util.ArrayDeque;
import java.util.Scanner;

public class PositionsOf02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int numberToSearch = scanner.nextInt();
        ArrayDeque<String> queueAnswers = new ArrayDeque<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (numberToSearch == matrix[row][col]) {
                    String answer = row + " " + col;
                    queueAnswers.offer(answer);
                }
            }
        }
        if (queueAnswers.isEmpty()) {
            System.out.println("not found");
        } else {
            int queueSize = queueAnswers.size();
            for (int i = 0; i < queueSize; i++) {
                System.out.println(queueAnswers.poll());
            }
        }

    }

    private static void printIntMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] arr = line.split("\\s+");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
