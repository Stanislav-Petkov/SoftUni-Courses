import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftuniBarIncome3Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Pattern regex = Pattern.compile("%(?<customer>[A-Z][a-z]+)%(([^%$|.0-9]?)+)<(?<product>\\w+)>(([^%$|.0-9]?)+)\\|(([^%$|.0-9]?)+)(?<quantity>\\d+)(([^%$|.0-9]?)+)\\|(([^%$|.0-9]?)+)(?<price>\\d+\\.?\\d+)(([^%$|.0-9]?)+)\\$");
        double totalPrice = 0;
        while (!"end of shift".equals(input = scanner.nextLine())) {
            Matcher matcher = regex.matcher(input);
            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double currentProductPrice = quantity * price;
                totalPrice += currentProductPrice;
                System.out.printf("%s: %s - %.2f%n", customer, product, currentProductPrice);
            }
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
