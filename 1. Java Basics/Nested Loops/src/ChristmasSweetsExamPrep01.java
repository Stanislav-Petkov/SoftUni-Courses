import java.util.Scanner;

public class ChristmasSweetsExamPrep01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baklavaPriceKG = Double.parseDouble(scanner.nextLine());
        double muffinaPriceKG = Double.parseDouble(scanner.nextLine());
        double shtolenaKG = Double.parseDouble(scanner.nextLine());
        double bonbonKG = Double.parseDouble(scanner.nextLine());
        double biskvitaKG = Double.parseDouble(scanner.nextLine());
        double finalPrice = 0;
        double shtolenPrice = baklavaPriceKG + baklavaPriceKG * 0.6;
        double shotlenSum = shtolenaKG * shtolenPrice;
        double bobonPrice = muffinaPriceKG + muffinaPriceKG * 0.8;
        double bobonSum = bonbonKG * bobonPrice;
        double biskvitaSum = biskvitaKG * 7.5;
        finalPrice = shotlenSum + bobonSum + biskvitaSum;
        System.out.printf("%.2f", finalPrice);
    }
}
