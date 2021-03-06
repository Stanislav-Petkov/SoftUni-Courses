import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabyrinthPaths {
    public static List<Character> path = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
        findPaths(matrix, 0, 0, ' ');
    }

    private static void findPaths(char[][] matrix, int row, int col, char direction) {


        if(!isNotInBounds(matrix, row, col) || matrix[row][col] == 'V' || matrix[row][col] == '*'){
            return;
        }

        path.add(direction);

        if (matrix[row][col] == 'e') {
            printPath();
            path.remove(path.size() - 1);
            return;
        }
        matrix[row][col] = 'V';

        findPaths(matrix, row - 1, col, 'U');
        findPaths(matrix, row + 1, col, 'D');
        findPaths(matrix, row, col - 1, 'L');
        findPaths(matrix, row, col + 1, 'R');

        matrix[row][col] = '-';
        path.remove(path.size() - 1);

    }

    private static boolean isNotInBounds(char[][] matrix, int row, int col) {
        return row >= 0 && col >= 0 && matrix.length > row && col < matrix[row].length;
    }

    private static void printPath() {
        for (int i = 1; i < path.size() ; i++) {
            System.out.print(path.get(i));
        }
        System.out.println();
    }
}

/*
     int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] labyrinth = new char[rows][cols];

        for(int row = 0; row < rows; row++){
            labyrinth[row] = scanner.nextLine().toCharArray();
        }

        // Start searching from position[0][0]
        findPath(labyrinth,0,0, ' ');
    }

    public static void findPath(char[][] labyrinth, int row, int col, char direction){
        if(!isInBounds(labyrinth, row, col) || labyrinth[row][col] == 'V' || labyrinth[row][col] == '*'){
            return;
        }

        path.add(direction);

        if(labyrinth[row][col] == 'e'){
            printPath();
            path.remove(path.size() - 1);
            return;
        }

        // mark as visited
        labyrinth[row][col] = 'V';

        // going in each direction until a wall is met
        findPath(labyrinth, row - 1, col,'U'); // up
        findPath(labyrinth, row + 1, col,'D'); // down
        findPath(labyrinth, row, col - 1,'L'); // left
        findPath(labyrinth, row, col + 1,'R'); // right

        // unmark when returning from recursion
        labyrinth[row][col] = '-';

        // remove the last direction letter when it is incorrect
        path.remove(path.size() - 1);
    }

    private static boolean isInBounds(char[][] labyrinth, int row, int col){
        return row < labyrinth.length  && row >= 0 && col < labyrinth[row].length && col >= 0;
    }

    private static void printPath(){
        for(int i = 1; i < path.size(); i++){
            System.out.print(path.get(i));
        }
        System.out.println();
    }
}
 */