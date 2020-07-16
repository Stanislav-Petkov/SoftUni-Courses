import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ListOfPredicates7 {

    public static BiPredicate<Integer, Integer> predicate = (f, s) -> f % s == 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<Integer> inputNums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        printNums(1, inputNums, n);
    }

    private static void printNums(int num, Set<Integer> inputNums, int n) {
        if (num > n) {
            return;
        }
        boolean isValid = true;
        for (Integer integer : inputNums) {
            if (!predicate.test(num, integer)) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.print(num + " ");
        }
        printNums(num + 1, inputNums, n);
    }
}
