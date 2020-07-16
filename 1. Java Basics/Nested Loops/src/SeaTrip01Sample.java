import java.util.Scanner;

public class SeaTrip01Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());
        double suvenir = Double.parseDouble(scanner.nextLine());
        double hotel = Double.parseDouble(scanner.nextLine());
        double litraBenzin = (420 / food) * 7;
        double ben = litraBenzin * 1.85;
        double prestoi = (3 * food) + (3 * suvenir);
        double firstday = hotel * 0.9;
        double secday = hotel * 0.85;
        double thirdday = hotel * 0.8;
        System.out.printf("Money needed: %.2f", (ben + prestoi + firstday + secday + thirdday));
    }
}
