import java.util.Scanner;

public class SkiTripExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String grade = scanner.nextLine();
        double priceForNights = 0;
        if (days < 10) {
            if (place.equals("room for one person")) {
                priceForNights = 18 * (days - 1);
            } else if (place.equals("apartment")) {
                priceForNights = (25 * (days - 1)) * 0.7;
            } else if (place.equals("president apartment")) {
                priceForNights = (35 * (days - 1)) * 0.9;
            }
        } else if (days >= 10 && days <= 15) {
            if (place.equals("room for one person")) {
                priceForNights = 18 * (days - 1);
            } else if (place.equals("apartment")) {
                priceForNights = (25 * (days - 1)) * 0.65;
            } else if (place.equals("president apartment")) {
                priceForNights = (35 * (days - 1)) * 0.85;
            }
        } else if (days >= 15) {
            if (place.equals("room for one person")) {
                priceForNights = 18 * (days - 1);
            } else if (place.equals("apartment")) {
                priceForNights = (25 * (days - 1)) * 0.50;
            } else if (place.equals("president apartment")) {
                priceForNights = (35 * (days - 1)) * 0.80;
            }
        }
        if (grade.equals("positive")) {
            priceForNights = priceForNights + 0.25 * priceForNights;
        } else if (grade.equals("negative")) {
            priceForNights = priceForNights - 0.1 * priceForNights;
        }
        System.out.printf("%.2f", priceForNights);
    }
}
