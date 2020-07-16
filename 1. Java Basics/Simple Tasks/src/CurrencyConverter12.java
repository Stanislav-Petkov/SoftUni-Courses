import java.util.Scanner;

class CurrencyConvert12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valuta = Double.parseDouble(scanner.nextLine());
        String valuta1 = scanner.next().toUpperCase();
        String valuta2 = scanner.next().toUpperCase();
        double result = 0;
        if (valuta2.equals("BGN")) {
            result = valuta / 1;
        } else if (valuta2.equals("EUR")) {
            result = valuta / 1.95583;
        } else if (valuta2.equals("USD")) {
            result = valuta / 1.79549;
        } else if (valuta2.equals("GBP")) {
            result = valuta / 2.53405;
        }
        if (valuta1.equals("BGN")) {
            result = result;
        } else if (valuta1.equals("EUR")) {
            result = result * 1.95583;
        } else if (valuta1.equals("USD")) {
            result = result * 1.79549;
        } else if (valuta1.equals("GBP")) {
            result = result * 2.53405;
        }
        System.out.println(result);
    }
}
