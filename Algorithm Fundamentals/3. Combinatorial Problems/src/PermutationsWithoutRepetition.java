import java.util.Scanner;

public class PermutationsWithoutRepetition {

    public static String[] elements;
    public static boolean[] used;
    public static String[] permutes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        used = new boolean[elements.length];
        permutes = new String[elements.length];
        permutation(0);
    }

    public static void permutation(int index) {
        if (index == elements.length) {
            printPermutations();
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                permutes[index] = elements[i];
                permutation(index + 1);
                // backtracking
                used[i] = false;
            }
        }
    }

    public static void printPermutations() {
        System.out.println(String.join(" ", permutes));
    }
}
