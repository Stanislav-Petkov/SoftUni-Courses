import java.util.Scanner;

public class HarvestJavaBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapePerSquare = Double.parseDouble(scanner.nextLine());
        double neededLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double harvestPerVine = (vineyardArea * grapePerSquare) * 0.4;
        double wine = harvestPerVine / 2.5;
        double leftOver = 0;
        if (neededLiters > wine) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLiters - wine));
        } else if (neededLiters <= wine) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            leftOver = wine - neededLiters;
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(leftOver), Math.ceil(leftOver / workers));
        }
    }
}
