import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double priceUsd = 0;
        double areaaKareta = tables * ((length / 2) * (length / 2));
        double areaPokrivki = tables * ((length + 2 * 0.30) * (width + 2 * 0.30));
        priceUsd = areaaKareta * 9 + areaPokrivki * 7;
        priceLeva = priceUsd * 1.85;
        System.out.printf("%.2f USD%n", priceUsd);
        System.out.printf("%.2f BGN", priceLeva);
    }
}
