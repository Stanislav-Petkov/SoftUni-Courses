import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = readMatrix(scanner);


        String arr[] = new String[matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            arr[row] = matrix[row][row];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int counter = 0;
        int rowP = matrix.length - 1;
        for (int row = 0; row < matrix.length; row++) {
            arr[row] = matrix[rowP][counter];
            counter++;
            rowP--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static String[][] readMatrix(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[n][n];
        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            String[] arr = line.split("\\s+");
            for (int col = 0; col < n; col++) {
                matrix[row][col] = arr[col];
            }
        }

        return matrix;
    }
}
