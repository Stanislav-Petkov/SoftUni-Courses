import java.util.Scanner;

public class SimpleCalculations2111USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size = scanner.nextDouble();
        String sourceCurrency = scanner.next().toUpperCase();
        String destinationCurrency = scanner.next().toUpperCase();
        if (sourceCurrency.equals("BGN") && destinationCurrency.equals("BGN")) {
            System.out.printf("%.2f", size);
        } else if (sourceCurrency.equals("BGN") && destinationCurrency.equals("USD")) {
            System.out.printf("%.2f", (size / 1.79549));
        } else if (sourceCurrency.equals("BGN") && destinationCurrency.equals("EUR")) {
            System.out.printf("%.2f", (size / 1.95583));
        } else if (sourceCurrency.equals("BGN") && destinationCurrency.equals("GBP")) {
            System.out.printf("%.2f", (size / 2.53405));
        }

        //usd
        if (sourceCurrency.equals("USD") && destinationCurrency.equals("USD")) {
            System.out.printf("%.2f", size);
        } else if (sourceCurrency.equals("USD") && destinationCurrency.equals("BGN")) {
            System.out.printf("%.2f", ((size * 1.79549)));
        } else if (sourceCurrency.equals("USD") && destinationCurrency.equals("EUR")) {
            System.out.printf("%.2f", ((size * 1.79549) / 1.95583));
        } else if (sourceCurrency.equals("USD") && destinationCurrency.equals("GBP")) {
            System.out.printf("%.2f", (size * 1.79549) / 2.53405);
        }

        //eur
        if (sourceCurrency.equals("EUR") && destinationCurrency.equals("EUR")) {
            System.out.printf("%.2f", size);
        } else if (sourceCurrency.equals("EUR") && destinationCurrency.equals("USD")) {
            System.out.printf("%.2f", (size * 1.95583) / 1.79549);
        } else if (sourceCurrency.equals("EUR") && destinationCurrency.equals("BGN")) {
            System.out.printf("%.2f", (size * 1.95583));
        } else if (sourceCurrency.equals("EUR") && destinationCurrency.equals("GBP")) {
            System.out.printf("%.2f", (size * 1.95583) / 2.53405);
        }

        //gbp
        if (sourceCurrency.equals("GBP") && destinationCurrency.equals("GBP")) {
            System.out.printf("%.2f", size);
        } else if (sourceCurrency.equals("GBP") && destinationCurrency.equals("USD")) {
            System.out.printf("%.2f", (size * 2.53405) / 1.79549);
        } else if (sourceCurrency.equals("GBP") && destinationCurrency.equals("EUR")) {
            System.out.printf("%.2f", ((size * 2.53405) / 1.95583));
        } else if (sourceCurrency.equals("GBP") && destinationCurrency.equals("BGN")) {
            System.out.printf("%.2f", (size * 2.53405));
        }
    }
}