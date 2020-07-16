import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MidExam2Nov19FriendlistMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> friends = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));
        String command = scanner.nextLine();
        while (!command.equals("Report")) {
            String[] input = command.split(" ");
            String action = input[0];
            if (action.equals("Blacklist")) {
                String blacklistName = input[1];
                if (friends.contains(blacklistName)) {
                    for (int i = 0; i < friends.size(); i++) {
                        if (friends.get(i).equals(blacklistName)) {
                            friends.set(i, "Blacklisted");
                        }
                    }
                    System.out.printf("%s was blacklisted.%n", blacklistName);
                } else {
                    System.out.printf("%s was not found.%n", blacklistName);
                }
            } else if (action.equals("Error")) {
                int index = Integer.parseInt(input[1]);
                String nameLost = friends.get(index);
                if (!friends.get(index).equals("Blacklisted") && !friends.get(index).equals("Lost")) {
                    friends.set(index, "Lost");
                    System.out.printf("%s was lost due to an error.%n", nameLost);
                }
            } else if (action.equals("Change")) {
                int index = Integer.parseInt(input[1]);
                String newName = input[2];
                String currentName = friends.get(index);
                if (isValidIndex(index, friends)) {
                    friends.set(index, newName);
                    System.out.printf("%s changed his username to %s.%n", currentName, newName);
                }
            } else {
                throw new IllegalStateException("Unknown action " + command);
            }
            command = scanner.nextLine();
        }
        int blacklistCnt = 0;
        int lostListCnt = 0;
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).equals("Blacklisted")) {
                blacklistCnt++;
            }
            if (friends.get(i).equals("Lost")) {
                lostListCnt++;
            }
        }
        System.out.printf("Blacklisted names: %d%n", blacklistCnt);
        System.out.printf("Lost names: %d%n", lostListCnt);
        for (int i = 0; i < friends.size(); i++) {
            System.out.print(friends.get(i) + " ");
        }
    }

    private static boolean isValidIndex(int index, List<String> friends) {
        return index >= 0 && index < friends.size();
    }
}
