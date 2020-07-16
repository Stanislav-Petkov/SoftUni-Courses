import java.util.Scanner;

public class Orders05Lab {

    static double printPriceOfProduct(String product, double quantity) {
        double result = 0;
        if (product.equals("coffee")) {
            result = 1.5 * quantity;
        } else if (product.equals("water")) {
            result = 1 * quantity;
        } else if (product.equals("coke")) {
            result = 1.4 * quantity;
        } else if (product.equals("snacks")) {
            result = 2 * quantity;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String quantity = scanner.nextLine();
        double price = scanner.nextDouble();
        System.out.printf("%.2f", printPriceOfProduct(quantity, price));
    }
}
