package AddVat;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVat {
    public static void main(String[] args) {
        List<String> input = readInput(new Scanner(System.in));
        Function<Double, Double> addVat = (dbl) -> dbl * 1.2;
        Function<Double, String> toStringRounded = (dbl) -> String.format("%.2f", dbl);
        Function<Double, String> finalFunc = addVat.andThen(toStringRounded);

        System.out.println("Prices with VAT:");
        input.stream()
                .map(str -> Double.parseDouble(str))
                .map(finalFunc)
                .forEach(str -> System.out.println(str));
    }

    static List<String> readInput(Scanner scanner) {
        String line = scanner.nextLine();
        String[] tokens = line.split(", ");
        return Arrays.stream(tokens).collect(Collectors.toList());
    }
}
