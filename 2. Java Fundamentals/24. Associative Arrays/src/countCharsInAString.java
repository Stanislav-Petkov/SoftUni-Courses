import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] letters = input.toCharArray();
        Map<Character, Integer> lettersMap = new LinkedHashMap<>();
        for (Character ch : letters) {
            if (ch != ' ') {
                if (lettersMap.containsKey(ch)) {
                    lettersMap.put(ch, lettersMap.get(ch) + 1);
                } else {
                    lettersMap.put(ch, 1);
                }
            }
        }
        lettersMap
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
