import java.util.Scanner;

public class AExam04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();
        double currentBudget = budget;
        double counter = 1;
        double currentPrice = 0;
        while (!product.equals("Finish") && !(currentBudget <= 0)) {
            if (product.equals("Star")) {
                if (counter % 10 == 3) {
                    currentPrice = 0.7 * 5.69;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 0.7 * 5.69;
                } else {
                    currentPrice = 5.69;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 5.69;
                }
            } else if (product.equals("Angel")) {
                if (counter % 10 == 3) {
                    currentPrice = 0.7 * 8.49;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 0.7 * 8.49;
                } else {
                    currentPrice = 8.49;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 8.49;
                }
            } else if (product.equals("Lights")) {
                if (counter % 10 == 3) {
                    currentPrice = 0.7 * 11.2;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 0.7 * 11.2;
                } else {
                    currentPrice = 11.2;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 11.2;
                }
            } else if (product.equals("Wreath")) {
                if (counter % 10 == 3) {
                    currentPrice = 0.7 * 15.5;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 0.7 * 15.5;
                } else {
                    currentPrice = 15.5;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 15.5;
                }
            } else if (product.equals("Candle")) {
                if (counter % 10 == 3) {
                    currentPrice = 0.7 * 3.59;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 0.7 * 3.59;
                } else {
                    currentPrice = 3.59;
                    if (currentBudget < currentPrice) {
                        break;
                    }
                    currentBudget = currentBudget - 3.59;
                }
            }
            counter++;
            product = scanner.nextLine();
        }
        if (product.equals("Finish")) {//&& currentBudget > currentPrice){
            System.out.printf("Congratulations! You bought everything!%n");
        }
        if (currentBudget < currentPrice && !product.equals("Finish")) {
            System.out.printf("Not enough money! You need %.2flv more.%n", currentPrice - currentBudget);
        }
        System.out.printf("%.0f items -> %.2flv spent.%n", counter - 1, budget - currentBudget);
    }
}
