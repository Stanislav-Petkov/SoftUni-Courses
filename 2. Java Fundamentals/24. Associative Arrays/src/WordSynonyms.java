import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> mapSynonym = new HashMap<>();
        String currentValue = "";
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!mapSynonym.containsKey(word)) {
                mapSynonym.put(word, synonym);
            } else {
                currentValue = mapSynonym.get(word);
                mapSynonym.put(word, currentValue + ", " + synonym);
            }
        }
        for (Map.Entry<String, String> stringStringEntry : mapSynonym.entrySet()) {
            System.out.printf("%s - %s%n", stringStringEntry.getKey(), stringStringEntry.getValue());
        }
    }
}
