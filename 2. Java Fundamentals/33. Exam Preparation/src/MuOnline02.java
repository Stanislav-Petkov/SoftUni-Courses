import java.util.Scanner;

public class MuOnline02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int newHealth = 0;
        int initialBitcoin = 0;
        String[] lineArr = scanner.nextLine().split("\\|");
        int count = 0;
        for (int i = 0; i < lineArr.length; i++) {
            String[] commandsPart = lineArr[i].split(" ");
            String commandName = commandsPart[0];
            int value = Integer.parseInt(commandsPart[1]);
            switch (commandName) {
                case "potion":
                    newHealth = initialHealth;
                    if (initialHealth < 100) {
                        initialHealth += value;
                        if (initialHealth > 100) {
                            initialHealth = 100;
                        }
                        System.out.printf("You healed for %d hp.%n", initialHealth - newHealth);

                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    newHealth = initialHealth;
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", value);
                    initialBitcoin += value;
                    break;
                default:
                    initialHealth -= value;
                    if (initialHealth > 0) {
                        System.out.printf("You slayed %s.%n", commandName);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", commandName);
                        System.out.printf("Best room: %d%n", i + 1);
                        return;
                    }
                    count++;
                    break;
            }
        }

        if (initialHealth > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitcoin);
            System.out.printf("Health: %d%n", initialHealth);
        }
    }
}
