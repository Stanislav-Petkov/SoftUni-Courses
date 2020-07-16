import java.util.Scanner;

public class Username0119aug9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();// = scanner.nextLine();
        String input = scanner.nextLine();
        if (input.equals("Sign up")) {
            return;
        }
        while (!"Sign up".equals(input)) {
            String[] commands = input.split(" ");
            String commandType = commands[0];
            switch (commandType) {
                case "Case":
                    String upperOrLower = commands[1];
                    if (upperOrLower.equals("lower")) {
                        username = username.toLowerCase();
                    } else {
                        username = username.toUpperCase();
                    }
                    System.out.println(username);
                    break;
                case "Reverse":
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if (0 <= startIndex && endIndex < username.length()) {
                        String result = username.substring(startIndex, endIndex + 1);
                        StringBuilder sb = new StringBuilder();
                        for (int i = endIndex; i >= startIndex; i--) {
                            sb.append(username.charAt(i));
                        }
                        System.out.println(sb);
                    }
                    break;
                case "Cut":
                    String substring = commands[1];
                    if (username.contains(substring)) {
                        username = username.replace(substring, "");
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.%n", username, substring);
                    }
                    break;
                case "Replace":
                    username = username.replace(commands[1], "*");
                    System.out.println(username);
                    break;
                case "Check":
                    if (username.contains(commands[1])) {
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %s.%n", commands[1]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Wrong commandType: " + commandType);
            }
            input = scanner.nextLine();
            if (input.equals("Sign up")) {
                break;
            }
        }
    }
}