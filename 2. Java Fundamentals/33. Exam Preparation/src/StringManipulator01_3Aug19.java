import java.util.Scanner;

public class StringManipulator01_3Aug19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];
            switch (commandType) {
                case "Change":
                    string = string.replace(commandParts[1], commandParts[2]);
                    System.out.println(string);
                    break;
                case "Includes":
                    if (string.contains(commandParts[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    if (string.endsWith(commandParts[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    string = string.toUpperCase();
                    System.out.println(string);
                    break;
                case "FindIndex":
                    int string1 = string.indexOf(commandParts[1]);
                    System.out.println(string1);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);
                    int endIndex = startIndex + length;
                    string = string.substring(startIndex, endIndex);
                    System.out.println(string);
                    break;
                default:
                    throw new IllegalStateException("Wrong commandType" + commandType);
            }
            command = scanner.nextLine();
        }
    }
}