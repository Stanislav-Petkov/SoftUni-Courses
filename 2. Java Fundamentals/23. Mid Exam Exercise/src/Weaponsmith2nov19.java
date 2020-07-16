import java.util.Scanner;

public class Weaponsmith2nov19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\|");
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] inputCommands = command.split(" ");
            String action = inputCommands[0] + " " + inputCommands[1];
            switch (action) {
                case "Move Left":
                    int index = Integer.parseInt(inputCommands[2]);
                    if (isIndexValidLeft(index, values)) {
                        String first = values[index - 1];
                        values[index - 1] = values[index] + "";
                        values[index] = first;
                    }
                    break;
                case "Move Right":
                    int index1 = Integer.parseInt(inputCommands[2]);
                    if (isIndexValidRight(index1, values)) {
                        String right = values[index1 + 1];
                        values[index1 + 1] = values[index1] + "";
                        values[index1] = right;
                    }
                    break;
                case "Check Even":
                    for (int i = 0; i < values.length; i++) {
                        if (i % 2 == 0) {
                            System.out.print(values[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "Check Odd":
                    for (int i = 0; i < values.length; i++) {
                        if (i % 2 != 0) {
                            System.out.print(values[i] + " ");
                        }
                    }
                    System.out.println();
                    break;
                default:
                    throw new IllegalStateException("Unknown command" + action);
            }
            command = scanner.nextLine();
        }
        String weaponName = "";
        for (int i = 0; i < values.length; i++) {
            weaponName += values[i];
        }
        System.out.printf("You crafted %s!", weaponName);
    }

    private static boolean isIndexValidRight(int indexCheck, String[] wep) {
        return indexCheck >= 0 && indexCheck < wep.length - 1;
    }

    private static boolean isIndexValidLeft(int indexCheck, String[] wep) {
        return indexCheck > 0 && indexCheck < wep.length;
    }
}