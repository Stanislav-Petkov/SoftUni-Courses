import java.util.Scanner;

public class AExam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double cenaSki = Double.parseDouble(scanner.nextLine());
        double cenaShteki = Double.parseDouble(scanner.nextLine());
        double cenaSkiObuvki = cenaSki * 0.4;
        double cenaSkiObleklo = cenaSki + cenaSkiObuvki;
        double total = cenaSki + cenaSkiObuvki + cenaSkiObleklo;
        double susShteki = total + cenaShteki;
        if (budget < total) {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(budget - total));
        } else {
            if (total > 800) {
                System.out.printf("Angel's sum is %.2f lv. He has %.2f lv. left.", total, budget - total);
            } else {
                System.out.printf("Angel's sum is %.2f lv. He has %.2f lv. left.", susShteki, budget - susShteki);
            }
        }
    }
}
