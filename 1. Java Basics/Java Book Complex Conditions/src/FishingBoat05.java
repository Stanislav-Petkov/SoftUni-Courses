import java.util.Scanner;

public class FishingBoat05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double rent = 0;
        if (people <= 6) {
            if (season.equals("Spring")) {
                rent = 3000 * 0.9;
            } else if (season.equals("Summer")) {
                rent = 4200 * 0.9;
            } else if (season.equals("Autumn")) {
                rent = 4200 * 0.9;
            } else if (season.equals("Winter")) {
                rent = 2600 * 0.9;
            }
        } else if (people <= 11) {
            if (season.equals("Spring")) {
                rent = 3000 * 0.85;
            } else if (season.equals("Summer")) {
                rent = 4200 * 0.85;
            } else if (season.equals("Autumn")) {
                rent = 4200 * 0.85;
            } else if (season.equals("Winter")) {
                rent = 2600 * 0.85;
            }
        } else if (people >= 12) {
            if (season.equals("Spring")) {
                rent = 3000 * 0.75;
            } else if (season.equals("Summer")) {
                rent = 4200 * 0.75;
            } else if (season.equals("Autumn")) {
                rent = 4200 * 0.75;
            } else if (season.equals("Winter")) {
                rent = 2600 * 0.75;
            }
        } else {
            if (season.equals("Spring")) {
                rent = 3000;
            } else if (season.equals("Summer")) {
                rent = 4200;
            } else if (season.equals("Autumn")) {
                rent = 4200;
            } else if (season.equals("Winter")) {
                rent = 2600;
            }
        }
        if ((people % 2 == 0) && (!season.equals("Autumn"))) {
            rent = rent * 0.95;
        }
        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
