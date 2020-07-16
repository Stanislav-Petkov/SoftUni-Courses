
import java.util.List;
import java.util.Scanner;

public class ListOperations04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> first = new ArrayList<>();
        String[] firstInput = scanner.nextLine().split("\\s+");
        for (int i = 0; i < firstInput.length; i++) {
            first.add(firstInput[i]);
        }
        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("End")) {
            if (input[0].equals("Add")) {
                first.add(input[1]);
            } else if (input[0].equals("Insert")) {
                if (Integer.parseInt(input[2]) >= 0 && Integer.parseInt(input[2]) < first.size()) {
                    first.add(Integer.parseInt(input[2]), input[1]);
                } else {
                    System.out.print("Invalid index");
                }
            } else if (input[0].equals("Remove")) {
                if (Integer.parseInt(input[1]) >= 0 && Integer.parseInt(input[1]) < first.size()) {
                    first.remove(Integer.parseInt(input[1]));
                } else {
                    System.out.print("Invalid index");
                }
            } else if (input[0].equals("Shift") && input[1].equals("left")) {
                for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                    first.add(first.get(0));
                    first.remove(first.get(0));
                }
            } else if (input[0].equals("Shift") && input[1].equals("right")) {
                for (int i = Integer.parseInt(input[2]); i > 0; i--) {
                    first.add(0, first.get(first.size() - 1));
                    first.remove(first.size() - 1);
                }
            }
            input = scanner.nextLine().split("\\s+");
        }
        for (int i = 0; i < first.size(); i++) {
            System.out.print(first.get(i) + " ");
        }
    }
}

