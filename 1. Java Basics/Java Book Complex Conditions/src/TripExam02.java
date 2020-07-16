
import java.util.Scanner;

public class TripExam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double price = 0;
        String campOrHotel = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                campOrHotel = "Camp - ";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                campOrHotel = "Hotel - ";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                campOrHotel = "Camp - ";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                campOrHotel = "Hotel - ";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                price = budget * 0.9;
                campOrHotel = "Hotel - ";
            } else if (season.equals("winter")) {
                price = budget * 0.9;
                campOrHotel = "Hotel - ";
            }
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.print(campOrHotel);
        System.out.printf("%.2f", price);
    }
}
