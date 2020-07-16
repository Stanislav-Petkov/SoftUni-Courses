import java.util.*;
import java.util.stream.Collectors;

public class WordCruncher {
    public static List<String> words;
    public static List<String> combined = new ArrayList<>();
    public static String target;

    public static Set<String> out = new TreeSet<>();

    // Every index where a and every word
    public static Map<Integer, List<String>> table = new HashMap<>();
    public static Map<String, Integer> occurrences = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        words = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        target = scanner.nextLine();

        // Remove words from the words list that are not contained in target string
        for (Iterator<String> iter = words.iterator(); iter.hasNext(); ) {
            String next = iter.next();
            if (!target.contains(next)) {
                iter.remove();
            }
        }

        // Get every starting index of a string from words
        for (String substr : words) {
            occurrences.putIfAbsent(substr, 0);
            // Increment with one if the substr is already contained
            occurrences.put(substr, occurrences.get(substr) + 1);
            int index = target.indexOf(substr);
            while (index != -1) {
                table.putIfAbsent(index, new ArrayList<>());
                table.get(index).add(substr);
                // Get the index of the next occurrence of the substr
                index = target.indexOf(substr, index + 1);
                System.out.println();
            }
        }

        // Permutations without repetition
        permute(0);

        for (String str : out) {
            System.out.println(str);
        }
    }

    private static void permute(int index) {
        if (index == target.length()) {
            print();
        } else if(table.containsKey(index)){
            List<String> strings = table.get(index);
            for (String str : strings) {
                if(occurrences.get(str) > 0) {
                    occurrences.put(str, occurrences.get(str) - 1);
                    // Add current combination
                    combined.add(str);
                    permute(index + str.length());
                    combined.remove(combined.size() - 1);
                    occurrences.put(str, occurrences.get(str) + 1);
                }
            }
        }
    }


    private static void print() {
        // Check if all possible combinations of the substrings make the target
        String actual = String.join("", combined);
        if (actual.contains(target)) {
            out.add((String.join(" ", combined)));
        }
    }
}

/*
tt, pp, rr
rrpptt

 */