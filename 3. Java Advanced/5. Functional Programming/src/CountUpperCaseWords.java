import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tokens = readInput(new Scanner(System.in));
        Predicate<String> upperCase = (word) -> Character.isUpperCase(word.charAt(0));
        List<String> upperCaseWords = tokens.stream().filter(upperCase).collect(Collectors.toList());
        System.out.println(upperCaseWords.size());
        upperCaseWords.forEach(System.out::println);
    }
    static List<String> readInput(Scanner scanner){
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        return Arrays.stream(tokens).collect(Collectors.toList());
    }
}
