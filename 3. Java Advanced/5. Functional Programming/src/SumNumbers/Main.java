package SumNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         List<String> input = readInput(new Scanner(System.in));

        ToIntFunction<String> toIntFunction = str -> Integer.valueOf(str);
        int sum =  input.stream()
                 .mapToInt(toIntFunction)
                 .sum();

        System.out.println("Count = " + input.size());
        System.out.println("Sum = " + sum);
    }

    public static List<String> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] input = line.split(", ");

        return Arrays.stream(input)
                .collect(Collectors.toList());
    }
}
