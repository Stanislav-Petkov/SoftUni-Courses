import java.util.Scanner;

public class CleverLilyExam12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int numberToys = 0;
        double brotherSum = 0;
        double sumFromSoldToys = 1;
        double savedMoney = 0;
        int counter = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney = savedMoney + 10 + (10 * counter);
                brotherSum++;
                counter++;
            } else {
                numberToys++;
            }
        }
        //System.out.println(savedMoney);
        sumFromSoldToys = numberToys * priceToy;
        //System.out.println(savedMoney + sumFromSoldToys - brotherSum);
        if ((savedMoney + sumFromSoldToys >= priceWashingMachine)) {
            System.out.printf("Yes! " +
                    "%.2f", (savedMoney + sumFromSoldToys - brotherSum) - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - (savedMoney + sumFromSoldToys - brotherSum));
        }
    }
}






