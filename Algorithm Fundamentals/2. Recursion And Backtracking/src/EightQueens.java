import java.util.Scanner;

public class EightQueens {
    public static char[][] matrix = {
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
            {'-','-','-','-','-','-','-','-'},
    };

    public static void main(String[] args) {
        findQueenPosition(0);
    }

    private static void findQueenPosition(int row) {
         if(row == 8){
             printSolution();
        }else {
             for (int col = 0; col < 8; col++) {
                 if (canPlaceQueen(row, col)) {
                     putQueen(row, col);
                     findQueenPosition(row + 1);
                     removeQueen(row, col);
                 }
             }
         }
    }

    private static boolean canPlaceQueen(int row, int col) {
        //check all rows for a column
        for (int r = 0; r < 8; r++) {
            if(matrix[r][col] == '*'){
                return false;
            }
        }
        //check all columns for a row
        for (int c = 0; c < 8 ; c++) {
            if(matrix[row][c] == '*'){
                return false;
            }
        }

        int r = row;
        int c = col;
        while (r < 8 && c < 8){
            if(matrix[r++][c++] == '*'){
                return false;
            }
        }

        r = row;
        c = col;
        while (r >= 0 && c >= 0){
            if(matrix[r--][c--] == '*'){
                return false;
            }
        }

        r=row;
        c=col;
        while(r >= 0 && c < 8){
            if(matrix[r--][c++] == '*'){
                return false;
            }
        }

        r=row;
        c=col;
        while(r < 8 && c >= 0){
            if(matrix[r++][c--] == '*'){
                return false;
            }
        }
        return true;
    }


    private static void putQueen(int row, int col){
        matrix[row][col] = '*';
    }

    private static void removeQueen(int row, int col){
        matrix[row][col] = '-';
    }

    private static void printSolution() {
        for (char[] chars : matrix) {
            for (char c : chars) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

/*
 public static char[][] board = {
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        findQueenPositions(0);
    }

    private static void findQueenPositions(int row) {
        if (row == 8) {
            printSolution();
        } else {
            for (int col = 0; col < 8; col++) {
                if (canPlaceQueen(row, col)) {
                    putQueen(row, col);
                    // go to the next line
                    findQueenPositions(row + 1);
                    // backtracking
                    removeQueen(row, col);
                }
            }
        }
    }

    private static void removeQueen(int row, int col) {
        board[row][col] = '-';
    }

    private static void putQueen(int row, int col) {

        board[row][col] = '*';
    }

    private static boolean canPlaceQueen(int row, int col) {
        // set to false in freePosition array all positions where a queen cannot be put
        for (int c = 0; c < 8; c++) {
            // mark all columns of that row
            if (board[row][c] == '*') {
                return false;
            }
        }

        for (int r = 0; r < 8; r++) {
            // mark all rows of that columns
            if (board[r][col] == '*') {
                return false;
            }
        }

        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            // go through the diagonal up and left
            if (board[r--][c--] == '*') {
                return false;
            }
        }

        // get the starting position again and start marking from it
        r = row ;
        c = col ;

        while (r < 8 && c < 8) {
            // diagonal down and right
            if (board[r++][c++] == '*') {
                return false;
            }
        }

        r = row ;
        c = col ;
        while (r >= 0 && c < 8) {
            // go up and right
            if (board[r--][c++] == '*') {
                return false;
            }
        }

        r = row ;
        c = col ;
        while (r < 8 && c >= 0) {
            // go down and left
            if (board[r++][c--] == '*') {
                return false;
            }
        }

        return true;
    }

    private static void printSolution() {
        for (char[] chars : board) {
            for (char symbol : chars) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

 */