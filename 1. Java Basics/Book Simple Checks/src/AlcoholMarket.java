import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beerQuantity = Double.parseDouble(scanner.nextLine());
        double wineQuantity = Double.parseDouble(scanner.nextLine());
        double rakiaQuantity = Double.parseDouble(scanner.nextLine());
        double whiskeyQuantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double rakiaPrice = whiskeyPrice - (whiskeyPrice * 0.5);
        double beerPrice = rakiaPrice - (rakiaPrice * 0.8);
        double winePrice = rakiaPrice - (rakiaPrice * 0.4);
        price = (rakiaPrice * rakiaQuantity) + (whiskeyPrice * whiskeyQuantity) +
                (beerPrice * beerQuantity) + (wineQuantity * winePrice);
        System.out.printf("%.2f", price);
    }
}
