import java.util.Scanner;

public class FilmPremiere03ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String paket = scanner.nextLine();
        double broiBilet = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (name.equals("John Wick")) {
            if (paket.equals("Drink")) {
                price = 12;
            } else if (paket.equals("Popcorn")) {
                price = 15;
            } else if (paket.equals("Menu")) {
                price = 19;
            }
        } else if (name.equals("Star Wars")) {
            if (paket.equals("Drink")) {
                price = 18;
            } else if (paket.equals("Popcorn")) {
                price = 25;
            } else if (paket.equals("Menu")) {
                price = 30;
            }
        } else if (name.equals("Jumanji")) {
            if (paket.equals("Drink")) {
                price = 9;
            } else if (paket.equals("Popcorn")) {
                price = 11;
            } else if (paket.equals("Menu")) {
                price = 14;
            }
        }
        price = price * broiBilet;
        if (name.equals("Star Wars") && broiBilet >= 4) {
            price = price * 0.7;
        }
        if (name.equals("Jumanji") && broiBilet == 2) {
            price = price * 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", price);
    }
}
