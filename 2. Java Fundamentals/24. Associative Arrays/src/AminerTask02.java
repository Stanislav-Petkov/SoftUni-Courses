import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AminerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!"stop".equals(input)) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(input)) {
                resources.put(input, quantity);
            } else {
                int res = resources.get(input) + quantity;
                resources.put(input, res);
            }
            input = scanner.nextLine();
        }
        resources.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}



/*
 Scanner scanner = new Scanner(System.in);

        Map<String,Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!"stop".equals(input)){
            int quantity = Integer.parseInt(scanner.nextLine());
            if(!resources.containsKey(input)){
                resources.put(input,quantity);
            }else {
                resources.put(input,resources.get(input) + quantity);
            }
            input = scanner.nextLine();
        }
        resources.forEach((k,v) -> System.out.println(k + " -> " +v));
    }

 */
/*
Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> reMap = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            if (reMap.containsKey(resource)) {
                reMap.put(resource, reMap.get(resource) + quantity);
            } else {
                reMap.put(resource, quantity);
            }

            resource = scanner.nextLine();
            if(resource.equals("stop")){
                break;
            }
            quantity = Integer.parseInt(scanner.nextLine());
        }
        for (Map.Entry<String, Integer> m : reMap.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
 */