import java.util.Scanner;

public class ComparingMatrices01Lab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != (secondMatrix[row][col])) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }

    private static int[][] readMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] arr = line.split("\\s+");
        int rows = Integer.parseInt(arr[0]);
        int cols = Integer.parseInt(arr[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            line = scanner.nextLine();
            arr = line.split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(arr[col]);
            }
        }

        return matrix;
    }

}

/*
import java.util.Arrays;
import java.util.Scanner;

public class ComparingMatrices01Lab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if(firstMatrix[row][col] != (secondMatrix[row][col])){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }

    private static int[][] readMatrix(Scanner scanner) {

        int[] matrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] firstMatrix = new int[matrix[0]][matrix[1]];
        for (int row = 0; row < firstMatrix.length; row++) {
            String[] rows = scanner.nextLine().split(" ");
            for (int col = 0; col < firstMatrix[row].length; col++) {
                firstMatrix[row][col] = Integer.parseInt(rows[col]);
            }
        }

        return firstMatrix;
    }

}
 */
/*
//100
import java.util.Arrays;
import java.util.Scanner;

public class ComparingMatrices01Lab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] firstMatrix = readMatrix(scanner);
        String[][] secondMatrix = readMatrix(scanner);

        if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
            System.out.println("not equal");
            return;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if(!firstMatrix[row][col].equals(secondMatrix[row][col])){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }

    private static String[][] readMatrix(Scanner scanner) {

        int[] matrix = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] firstMatrix = new String[matrix[0]][matrix[1]];
        for (int row = 0; row < firstMatrix.length; row++) {
            String[] rows = scanner.nextLine().split(" ");
            for (int col = 0; col < firstMatrix[row].length; col++) {
                firstMatrix[row][col] = rows[col];
            }
        }

        return firstMatrix;
    }

}
 */
