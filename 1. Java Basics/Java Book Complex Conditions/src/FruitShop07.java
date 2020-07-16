import java.util.Scanner;

public class FruitShop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice = -1;
        double result = 0;
        switch (dayOfWeek) {
            case "Monday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.5;
                        break;
                    case "apple":
                        result = quantity * 1.2;
                        break;
                    case "orange":
                        result = quantity * 0.85;
                        break;
                    case "grapefruit":
                        result = quantity * 1.45;
                        break;
                    case "kiwi":
                        result = quantity * 2.7;
                        break;
                    case "pineapple":
                        result = quantity * 5.5;
                        break;
                    case "grapes":
                        result = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Tuesday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.5;
                        break;
                    case "apple":
                        result = quantity * 1.2;
                        break;
                    case "orange":
                        result = quantity * 0.85;
                        break;
                    case "grapefruit":
                        result = quantity * 1.45;
                        break;
                    case "kiwi":
                        result = quantity * 2.7;
                        break;
                    case "pineapple":
                        result = quantity * 5.5;
                        break;
                    case "grapes":
                        result = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Wednesday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.5;
                        break;
                    case "apple":
                        result = quantity * 1.2;
                        break;
                    case "orange":
                        result = quantity * 0.85;
                        break;
                    case "grapefruit":
                        result = quantity * 1.45;
                        break;
                    case "kiwi":
                        result = quantity * 2.7;
                        break;
                    case "pineapple":
                        result = quantity * 5.5;
                        break;
                    case "grapes":
                        result = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Thursday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.5;
                        break;
                    case "apple":
                        result = quantity * 1.2;
                        break;
                    case "orange":
                        result = quantity * 0.85;
                        break;
                    case "grapefruit":
                        result = quantity * 1.45;
                        break;
                    case "kiwi":
                        result = quantity * 2.7;
                        break;
                    case "pineapple":
                        result = quantity * 5.5;
                        break;
                    case "grapes":
                        result = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Friday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.5;
                        break;
                    case "apple":
                        result = quantity * 1.2;
                        break;
                    case "orange":
                        result = quantity * 0.85;
                        break;
                    case "grapefruit":
                        result = quantity * 1.45;
                        break;
                    case "kiwi":
                        result = quantity * 2.7;
                        break;
                    case "pineapple":
                        result = quantity * 5.5;
                        break;
                    case "grapes":
                        result = quantity * 3.85;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Saturday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.7;
                        break;
                    case "apple":
                        result = quantity * 1.25;
                        break;
                    case "orange":
                        result = quantity * 0.9;
                        break;
                    case "grapefruit":
                        result = quantity * 1.6;
                        break;
                    case "kiwi":
                        result = quantity * 3;
                        break;
                    case "pineapple":
                        result = quantity * 5.6;
                        break;
                    case "grapes":
                        result = quantity * 4.2;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            case "Sunday":
                switch (product) {
                    case "banana":
                        result = quantity * 2.7;
                        break;
                    case "apple":
                        result = quantity * 1.25;
                        break;
                    case "orange":
                        result = quantity * 0.9;
                        break;
                    case "grapefruit":
                        result = quantity * 1.6;
                        break;
                    case "kiwi":
                        result = quantity * 3;
                        break;
                    case "pineapple":
                        result = quantity * 5.6;
                        break;
                    case "grapes":
                        result = quantity * 4.2;
                        break;
                    default:
                        System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
        }
        if (result > 0) {
            System.out.printf("%.2f", result);
        }
    }
}