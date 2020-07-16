import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Crossfire07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        ArrayList<ArrayList<Integer>> fields = new ArrayList<>(rows);
        int counter = 1;

        for (int row = 0; row < rows; row++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                temp.add(counter++);
            }
            fields.add(temp);
        }

        System.out.println();

        String line = scanner.nextLine();
        while (!"Nuke it from orbit".equals(line)) {
            String[] inputArr = line.split("\\s+");
            int row = Integer.parseInt(inputArr[0]);
            int col = Integer.parseInt(inputArr[1]);
            int radius = Integer.parseInt(inputArr[2]);

            for (int i = col - radius; i <= col + radius; i++) {
                if (row >= 0 && row < fields.size() && i >= 0 && i < fields.get(row).size()) {
                    fields.get(row).set(i, -1);
                }
            }

            for (int i = row - radius; i <= row + radius; i++) {
                if (i >= 0 && i < fields.size() && col >= 0 && col < fields.get(i).size()) {
                    fields.get(i).set(col, -1);
                }
            }

            for (ArrayList<Integer> integers : fields) {
                removeNegativeValues(integers);
            }

            fields.removeIf(ArrayList::isEmpty);
            line = scanner.nextLine();
        }
        printMatrix(fields);
    }

    private static void removeNegativeValues(ArrayList<Integer> currentRow) {
        while (currentRow.contains(-1)) {
            currentRow.remove(currentRow.indexOf(-1));
        }
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
