import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] tokens = input.split(" ");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            double quantity = Double.parseDouble(tokens[2]);
            if (!quantityMap.containsKey(name)) {
                quantityMap.put(name, quantity);
            } else {
                double currentQuantity = quantityMap.get(name);
                quantityMap.put(name, currentQuantity + quantity);
            }
            if (!priceMap.containsKey(name)) {
                priceMap.put(name, price);
            } else {
                if (price != priceMap.get(name)) {
                    priceMap.put(name, price);
                }
            }
            input = scanner.nextLine();
        }
        Map<String, Double> multipliedValues = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : quantityMap.entrySet()) {
            multipliedValues.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            double currentQuantity = multipliedValues.get(entry.getKey());
            multipliedValues.put(entry.getKey(), currentQuantity * entry.getValue());
        }
        for (Map.Entry<String, Double> m : multipliedValues.entrySet()) {
            System.out.println(String.format("%s -> %.2f", m.getKey(), m.getValue()));
        }
    }
}

