
import java.util.Scanner;

public class VegetableMarket02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePriceKg = Double.parseDouble(scanner.nextLine());
        double fruitPriceKg = Double.parseDouble(scanner.nextLine());
        int vegetablekg = Integer.parseInt(scanner.nextLine());
        int fruitkg = Integer.parseInt(scanner.nextLine());
        double priceBG = (vegetablePriceKg * vegetablekg) + (fruitPriceKg * fruitkg);
        double euro = priceBG / 1.94;
        System.out.println(euro);
    }
}
