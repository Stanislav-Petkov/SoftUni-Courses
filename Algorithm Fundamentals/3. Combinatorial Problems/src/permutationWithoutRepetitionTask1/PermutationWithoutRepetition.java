package permutationWithoutRepetitionTask1;

import java.util.Scanner;

public class PermutationWithoutRepetition {
    public static String[] elements;
    public static String[] permutes;
    public static boolean[] used;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        permutes = new String[elements.length];
        used = new boolean[elements.length];
        permutations(0);
    }

    public static void permutations(int index) {
        if (index == elements.length) {
            printPermutations();
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                // Mark the element that it was used
                used[i] = true;
                permutes[index] = elements[i];
                permutations(index + 1);
                // Backtracking, unmark the element
                used[i] = false;
            }
        }
    }

    public static void printPermutations() {
        System.out.println(String.join(" ", permutes));
    }

}
