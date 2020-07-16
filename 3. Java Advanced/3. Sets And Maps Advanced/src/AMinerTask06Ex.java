import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        if (inputLine.equals("stop")) {
            return;
        }
        int quantity = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> elementAndQuantity = new LinkedHashMap<>();
        while (!inputLine.equals("stop")) {
            if (!elementAndQuantity.containsKey(inputLine)) {
                elementAndQuantity.put(inputLine, quantity);
            } else {
                elementAndQuantity.put(inputLine, elementAndQuantity.get(inputLine) + quantity);
            }

            inputLine = scanner.nextLine();
            if (inputLine.equals("stop")) {
                break;
            }
            quantity = Integer.parseInt(scanner.nextLine());
        }

        for (Map.Entry<String, Integer> entry : elementAndQuantity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
