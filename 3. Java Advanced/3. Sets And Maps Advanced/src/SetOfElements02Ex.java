import java.util.*;
import java.util.stream.Collectors;

public class SetOfElements02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        LinkedHashSet<Integer> firstSet = readIntegerStream(n, scanner);
        LinkedHashSet<Integer> secondSet = readIntegerStream(m, scanner);
        firstSet.retainAll(secondSet);
        String collect = firstSet.stream()
                .map(i -> i + "")
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }

    private static LinkedHashSet<Integer> readIntegerStream(int counter, Scanner scanner) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        while (counter-- > 0){
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }
}
