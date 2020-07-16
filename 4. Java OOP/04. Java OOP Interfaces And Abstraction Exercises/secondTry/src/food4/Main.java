package food4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        List<Citizen> buyers = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = line.split("\\s+");
            if (tokens.length == 4) {
                Citizen citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                buyers.add(citizen);
                // citizen.buyFood();

            } else if (tokens.length == 3) {
                Rebel rebel = new Rebel(tokens[0], Integer.parseInt(tokens[1]),
                        tokens[2]);
                rebel.buyFood();
                // buyers.add(rebel);
            }
            line = scanner.nextLine();
        }

        //people who bought food
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            input = scanner.nextLine();
        }
    }
}