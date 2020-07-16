import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MidExam2nov19TanksCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tanks = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));
        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String[] parts = command.split(", ");
            if (parts[0].equals("Add")) {
                String tankName = parts[1];
                if (tanks.contains(tankName)) {
                    System.out.println("Tank is already bought");
                } else {
                    System.out.println("Tank successfully bought");
                    tanks.add(tankName);
                }
            } else if (parts[0].equals("Remove")) {
                String tankName = parts[1];
                if (tanks.contains(tankName)) {
                    System.out.println("Tank successfully sold");
                    tanks.remove(tankName);
                } else {
                    System.out.println("Tank not found");
                }

            } else if (parts[0].equals("Remove At")) {
                int index = Integer.parseInt(parts[1]);
                if (isValidIndex(index, tanks)) {
                    tanks.remove(tanks.get(index));
                    System.out.println("Tank successfully sold");
                } else {
                    System.out.println("Index out of range");
                }
            } else if (parts[0].equals("Insert")) {
                int index = Integer.parseInt(parts[1]);
                String tankName = parts[2];
                if (isValidIndex(index, tanks)) {
                    if (tanks.contains(tankName)) {
                        System.out.println("Tank is already bought");
                    } else {
                        tanks.add(index, tankName);
                        System.out.println("Tank successfully bought");
                    }
                } else {
                    System.out.println("Index out of range");
                }
            }
            if (i == n - 1) {
                break;
            }
            command = scanner.nextLine();
        }
        String val = "";
        for (int i = 0; i < tanks.size() - 1; i++) {
            val += (tanks.get(i) + ", ");
        }
        System.out.print(val + tanks.get(tanks.size() - 1));
    }

    private static boolean isValidIndex(int index, List<String> friends) {
        return index >= 0 && index < friends.size();
    }
}
