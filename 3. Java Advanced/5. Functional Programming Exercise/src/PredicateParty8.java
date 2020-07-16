import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String line = scanner.nextLine();
        while (!line.equals("Party!")) {
            String[] tokens = line.split("\\s+");

            Predicate<String> predicate = checkPredicate(tokens[1], tokens[2]);

            List<String> temp = new ArrayList<>();

            names.stream().forEach(name -> {
                if (predicate.test(name)) {
                    temp.add(name);
                }

            });

            if (tokens[0].equals("Remove")) {
                names.removeAll(temp);
            } else {
                names.addAll(temp);
            }
            if (names.isEmpty()) {
                System.out.println("Nobody is going to the party!");
            } else {
                System.out.println((names.stream()
                        .sorted(Comparator.naturalOrder())
                        .collect(Collectors.joining(", ")) + "are going to the party!"));
            }
            line = scanner.nextLine();
        }
    }

    private static Predicate<String> checkPredicate(String command, String param) {
        Predicate<String> check;
        if (command.equals("StartsWith")) {
            check = str -> str.startsWith(param);
        } else if (command.equals("EndsWith")) {
            check = str -> str.endsWith(param);
        } else {
            check = str -> str.length() == Integer.parseInt(param);
        }
        return check;
    }
}
