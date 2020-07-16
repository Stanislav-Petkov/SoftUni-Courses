import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountSymbols04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<Character, Integer> characterWithOccurrences = new TreeMap<>();

        for (char symbol : input.toCharArray()) {
            characterWithOccurrences.putIfAbsent(symbol, 0);
            characterWithOccurrences.put(symbol, characterWithOccurrences.get(symbol) + 1);
        }

        System.out.println(characterWithOccurrences.entrySet().stream()
                .map(e -> String.format("%c: %d time/s", e.getKey(), e.getValue()))
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
