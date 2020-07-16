import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> users = new LinkedHashMap<>();
        int numberOfUsers = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfUsers; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String action = tokens[0];
            String username = "";
            String licensePlateNumber = "";
            if (action.equals("register")) {
                username = tokens[1];
                licensePlateNumber = tokens[2];
                if (!users.containsKey(username)) {
                    users.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", users.get(username));
                }
            } else if (action.equals("unregister")) {
                username = tokens[1];
                if (!users.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    users.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.println(String.format("%s => %s", entry.getKey(), entry.getValue()));
        }
    }
}
