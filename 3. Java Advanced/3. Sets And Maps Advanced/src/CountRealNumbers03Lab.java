import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numbers = new LinkedHashMap<>();
        double[] line = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        for (double value : line) {
            if (!numbers.containsKey(value)) {
                numbers.put(value, 1);
            } else {
                numbers.put(value, numbers.get(value) + 1);
            }
        }
        for (Double num : numbers.keySet()) {
            System.out.println(String.format("%.1f -> %d", num, numbers.get(num)));
        }
    }
}
