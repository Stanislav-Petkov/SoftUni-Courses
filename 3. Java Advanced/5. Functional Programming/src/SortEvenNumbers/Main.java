package SortEvenNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> input = readInput(new Scanner(System.in));
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

       String output = input.stream()
               .filter(isEven)
               .map(string -> string.toString())
               .collect(Collectors.joining(", "));
        System.out.println(output);

        String sorted = input.stream()
                .filter(isEven)
                .sorted()
                .map(number -> number.toString())
                .collect(Collectors.joining(", "));
        System.out.println(sorted);
    }

    public static List<Integer>readInput(Scanner scanner){
        String[] numbers = scanner.nextLine().split(", ");
        return Arrays.stream(numbers)
                .map(string -> Integer.valueOf(string))
                .collect(Collectors.toList());
    }
}
