import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<List<Integer>, Integer> findRighMostMinElement = integerList -> {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) <= min) {
                    min = integerList.get(i);
                    minIndex = i;
                }
            }
            return minIndex;
        };
        System.out.println(findRighMostMinElement.apply(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList())));
    }
}
