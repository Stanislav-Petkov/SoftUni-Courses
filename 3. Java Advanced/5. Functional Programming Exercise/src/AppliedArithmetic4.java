import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic4 {
    static List<Integer> numbersList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Map<String, Function<List<Integer>, List<Integer>>> functionMap = new HashMap<>();

        functionMap.put("add", integerList ->
                integerList.stream()
                        .map(e -> e + 1)
                        .collect(Collectors.toList()));

        functionMap.put("multiply", integerList ->
                integerList.stream()
                        .map(val -> val * 2)
                        .collect(Collectors.toList()));

        functionMap.put("subtract", integers -> integers.stream()
                .map(val -> val - 1)
                .collect(Collectors.toList()));

        functionMap.put("print", integers -> integers.stream()
                .peek(e -> System.out.print(" " + e))
                .collect(Collectors.toList()));

        String input = scanner.nextLine();
        handleInput(functionMap, scanner, input);
    }

    private static void handleInput(Map<String, Function<List<Integer>,
            List<Integer>>> functionMap, Scanner scanner, String input) {
        if (input.equals("end")) {
            return;
        }
        numbersList = functionMap.get(input).apply(numbersList);
        if (input.equals("print")) {
            System.out.println();
        }
        input = scanner.nextLine();
        handleInput(functionMap, scanner, input);
    }
}
