package implementations;

import java.util.ArrayDeque;
import java.util.Deque;

public class TheMatrix {
    private char[][] matrix;
    private char fillChar;
    private char startChar;
    private int startRow;
    private int startCol;

    public TheMatrix(char[][] matrix, char fillChar, int startRow, int startCol) {
        this.matrix = matrix;
        this.fillChar = fillChar;
        this.startRow = startRow;
        this.startCol = startCol;
        this.startChar = this.matrix[this.startRow][this.startCol];
    }

    public void solve() {
        Deque<int[]> deque = new ArrayDeque<>();

        deque.push(new int[]{this.startRow, this.startCol});

        while (!deque.isEmpty()) {
            int[] position = deque.pop();

            int row = position[0];
            int col = position[1];

            this.matrix[row][col] = this.fillChar;

            if (isInBounds(row + 1, col) && this.matrix[row + 1][col] == this.startChar) {
                deque.push(new int[]{row + 1, col});
            }
            if (isInBounds(row, col + 1) && this.matrix[row][col + 1] == this.startChar) {
                deque.push(new int[]{row, col + 1});
            }
            if (isInBounds(row - 1, col) && this.matrix[row - 1][col] == this.startChar) {
                deque.push(new int[]{row - 1, col});
            }
            if (isInBounds(row, col - 1) && this.matrix[row][col - 1] == this.startChar) {
                deque.push(new int[]{row, col - 1});
            }
        }
    }

    private boolean isInBounds(int row, int col) {
        return !isOutOfBounds(row, col);
    }

    private boolean isOutOfBounds(int row, int col) {
        return row < 0 || row >= this.matrix.length || col < 0 || col >= this.matrix[row].length;
    }

    public String toOutputString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < this.matrix.length; r++) {
            for (int c = 0; c < this.matrix[r].length; c++) {
                sb.append(this.matrix[r][c]);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
