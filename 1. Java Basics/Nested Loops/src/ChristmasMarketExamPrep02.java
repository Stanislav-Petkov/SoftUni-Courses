import java.util.Scanner;

public class ChristmasMarketExamPrep02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double targetMoney = Double.parseDouble(scanner.nextLine());
        double fentaziBooks = Double.parseDouble(scanner.nextLine());
        double horrorBooks = Double.parseDouble(scanner.nextLine());
        double romanticBooks = Double.parseDouble(scanner.nextLine());
        double sumForSell = fentaziBooks * 14.9 + horrorBooks * 9.8 + romanticBooks * 4.3;
        double dds = sumForSell * 0.2;
        double aftersell = sumForSell - dds;
        double forWorker = 0;
        double forSeller = 0;
        double addition = 0;
        double final1 = 0;
        if (aftersell > targetMoney) {
            forWorker = aftersell - targetMoney;
            forSeller = Math.floor(0.1 * forWorker);
            addition = forWorker - forSeller;
            final1 = addition + targetMoney;
        }
        if (aftersell > targetMoney) {
            System.out.printf("%.2f leva donated.%n", final1);
            System.out.printf("Sellers will receive %.0f leva.", forSeller);
        } else {
            System.out.printf("%.2f money needed.", targetMoney - aftersell);
        }
    }
}
