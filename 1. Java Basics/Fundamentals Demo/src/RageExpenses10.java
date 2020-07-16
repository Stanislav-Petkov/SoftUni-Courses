import java.util.Scanner;

public class RageExpenses10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double head = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        double money = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 12 == 0) {
                money += head + mouse + keyboard + display;
            } else if (i % 6 == 0) {
                money += head + mouse + keyboard;
            } else if (i % 3 == 0) {
                money += mouse;
            } else if (i % 2 == 0) {
                money += head;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", money);
    }
}
