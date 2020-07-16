package Test;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        Function<Integer,Integer> increment = x -> x + 1;
        int a = increment.apply(5);
        System.out.println(a);

        Consumer<String> print = message -> System.out.println(message);
        print.accept("Test string for output");

        Supplier<Integer>getRandomInt = () -> new Random().nextInt(51);
        System.out.println(getRandomInt.get());

        Supplier<String > aliceSupplier = () -> "Alice";
        System.out.println(aliceSupplier.get());
        Supplier<List> listSupplier = () -> new ArrayList(); /
        Supplier<List<String >> listSupplier1 = () -> {
            List<String> stringList = new ArrayList<>();
            stringList.add("Alice1");
            stringList.add("BOB1");
            return stringList;
        };
        System.out.println(listSupplier1.get());

        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(6));
    }

    static int increment(int x){
        return x + 1;
    }
    public static List<String> returnInputAsList (Scanner scanner){
        String line = scanner.nextLine();
        String[] parts = line.split(", ");
        return Arrays.stream(parts)
                .collect(Collectors.toList());
    }
}
