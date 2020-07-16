import java.util.Scanner;

public class Club04ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double targetMoney = Double.parseDouble(scanner.nextLine());
        String cocktail = scanner.nextLine();
        double cocktailCnt = Double.parseDouble(scanner.nextLine());
        double currentMoney = 0;
        double price = 0;
        double otstupka = 0;
        while (currentMoney < targetMoney || cocktail.equals("Party!")) {
            price = 0;
            otstupka = 0;
            for (int i = 0; i < cocktail.length(); i++) {
                price++;
            }
            price = price * cocktailCnt;
            if (price % 2 == 1) {
                otstupka = 0.25;
                price = price - price * 0.25;
            }
            currentMoney = currentMoney + price;
            if (currentMoney >= targetMoney) {
                System.out.printf("Target acquired.%n");
                break;
            }
            cocktail = scanner.nextLine();
            if (cocktail.equals("Party!")) {
                System.out.printf("We need %.2f leva more.%n", targetMoney - currentMoney);
                break;
            }
            cocktailCnt = Double.parseDouble(scanner.nextLine());
        }
        System.out.printf("Club income - %.2f leva.%n", currentMoney);
    }
}
