import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        int first = Integer.parseInt(tokens[0]);
        int second = Integer.parseInt(tokens[1]);
        String condition = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        for (int i = first; i <= second; i++) {
            numbers.add(i);
        }
        System.out.println();
        Predicate<Integer> predicate = getEvenOrOddCondition(condition);
        Consumer<Integer> consumer = x -> System.out.print(x + " ");
        for (int i = first; i <= second ; i++) {
            if(predicate.test(i)){
                consumer.accept(i);
            }
        }
    }

    private static Predicate<Integer> getEvenOrOddCondition(String condition) {
        Predicate<Integer> predicate;
        switch (condition) {
            case "odd":
                predicate = num -> num % 2 != 0;
                break;
            case "even":
                predicate = num -> num % 2 == 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + condition);
        }
        return predicate;
    }
