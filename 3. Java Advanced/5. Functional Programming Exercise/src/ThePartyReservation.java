import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String line = scanner.nextLine();

        Map<String, Predicate<String>> predicates = new HashMap<>();
        while (!line.equals("Print")) {
            String[] tokens = line.split(";");

            if (tokens[0].contains("Add")) {
                predicates.put(tokens[1] + tokens[2], producePredicates(tokens[1], tokens[2]));
            } else {
                predicates.remove(tokens[1] + tokens[2]);
            }
            line = scanner.nextLine();
        }
        names.stream()
                .filter(n -> {
                    boolean isValid = true;
                    for (Predicate<String> predicate : predicates.values()) {
                        if (predicate.test(n)) {
                            isValid = false;
                            break;
                        }
                    }
                    return isValid;
                }).forEach(e -> System.out.print(e + " "));
    }

    private static Predicate<String> producePredicates(String command, String param) {
        Predicate<String> check = null;
        if (command.equals("Starts with")) {
            check = str -> str.startsWith(param);
        } else if (command.equals("Ends with")) {
            check = str -> str.endsWith(param);
        } else if (command.equals("Length")) {
            check = str -> str.length() == Integer.parseInt(param);
        } else if (command.equals("Contains")) {
            check = str -> str.contains(param);
        }
        return check;
    }
}

