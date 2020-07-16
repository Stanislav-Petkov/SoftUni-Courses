import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] participants = input.split(", ");
        Pattern regex = Pattern.compile("(?<letter>[A-Za-z])");
        Pattern numsPattern = Pattern.compile("(?<nums>\\d)");
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (int i = 0; i < participants.length; i++) {
            racers.put(participants[i], 0);
        }
        while (!"end of race".equals(input = scanner.nextLine())) {
            Matcher nameMatcher = regex.matcher(input);
            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group("letter"));
            }
            int distance = 0;
            if (racers.containsKey(name.toString())) {
                Matcher kmMatcher = numsPattern.matcher(input);
                while (kmMatcher.find()) {
                    distance += Integer.parseInt(kmMatcher.group("nums"));
                }
                racers.put(name.toString(), racers.get(name.toString()) + distance);
            }

        }
        int arr[] = {1};
        System.out.println();
        racers.
                entrySet()
                .stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .limit(3)
                .forEach(e -> {
                    switch (arr[0]) {
                        case 1:
                            System.out.println("1st place: " + e.getKey());
                            break;
                        case 2:
                            System.out.println("2nd place: " + e.getKey());
                            break;
                        case 3:
                            System.out.println("3rd place: " + e.getKey());
                            break;
                    }
                    arr[0]++;
                });
    }
}
