import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        if ("banana".equals(product)) {
            System.out.println("fruit");
        } else if ("apple".equals(product)) {
            System.out.println("fruit");
        } else if ("kiwi".equals(product)) {
            System.out.println("fruit");
        } else if ("cherry".equals(product)) {
            System.out.println("fruit");
        } else if ("lemon".equals(product)) {
            System.out.println("fruit");
        } else if ("grapes".equals(product)) {
            System.out.println("fruit");
        } else if ("tomato".equals(product)) {
            System.out.println("vegetable");
        } else if ("pepper".equals(product)) {
            System.out.println("vegetable");
        } else if ("cucumber".equals(product)) {
            System.out.println("vegetable");
        } else if ("carrot".equals(product)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
