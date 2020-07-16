import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy13ex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, int[]>> dragons = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String type = tokens[0];
            String name = tokens[1];
            int[] data = new int[3];
            data[0] = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            data[1] = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            data[2] = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }

            dragons.get(type).putIfAbsent(name, data);
            dragons.get(type).put(name, data);
        }
        System.out.println();
        dragons.forEach((key, value) -> {

            double[] average = new double[3];

            value.forEach((k, v) -> {
                average[0] += v[0];
                average[1] += v[1];
                average[2] += v[2];

            });
            average[0] /= value.size();
            average[1] /= value.size();
            average[2] /= value.size();
            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)", key, average[0], average[1], average[2]));
            value.forEach((k, v) -> {
                System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d ", k, v[0], v[1], v[2]));
            });
        });
    }
}