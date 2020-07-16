package task3MoveDownOrRight;

import java.util.*;

public class MoveDownOrRight {
    // Given a matrix of N by M cells filled with positive integers, find the path from top left to
    //bottom right with a highest sum of cells by moving only down or right.
    // find coordinates of elements on the path with max sum from top left element to bottom right
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int[][] elements = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            elements[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] table = new int[rows][cols];
        table[0][0] = elements[0][0];

        // Fill in the 0-th row
        for (int col = 1; col < cols; col++) {
            // Sum the previous element from the resulting table with the current element from the start table
                table[0][col] = table[0][col - 1] + elements[0][col];
        }

        // Fill in the 0-th col
        for (int row = 1; row < rows; row++) {
            table[row][0] = table[row - 1][0] + elements[row][0];
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                // Save either the top element from the resulting table with the current elements from the original
                // table or the left elements from the resulting table with the current one from the original table
                table[row][col] = Math.max(table[row - 1][col] + elements[row][col] ,
                       table[row][col - 1] + elements[row][col] );
            }
        }

        int row = rows - 1;
        int col = cols - 1;
        List<String> path = new ArrayList<>();
        path.add(formatOutput(row, col));
        while (row > 0 || col > 0){
            int top = -1;
            if(row > 0){
                top = table[row - 1][col];
            }
            int left = -1;
            if(col > 0){
                left = table[row][col - 1];
            }

            if(top > left){
                row--;
            }else {
                col--;
            }

            path.add(formatOutput(row, col));
        }
        Collections.reverse(path);
        System.out.println(String.join(" ",path));
    }

    private static String formatOutput(int row, int col){
        return "[" + row + ", " + col + "]";
    }
}






















