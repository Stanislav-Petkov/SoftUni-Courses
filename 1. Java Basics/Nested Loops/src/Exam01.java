import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double broimeseci = Double.parseDouble(scanner.nextLine());
        double procentnakomisiona = Double.parseDouble(scanner.nextLine());
        double cenanaemmesec = Double.parseDouble(scanner.nextLine());
        double purviPeriod = Math.floor(broimeseci / 2) * cenanaemmesec;
        double umnojenie = Math.ceil(broimeseci / 2);
        double vtoriPeriod = cenanaemmesec * 0.8 * umnojenie;
        double total1 = purviPeriod + vtoriPeriod;
        double zabroker = (total1 * procentnakomisiona) / 100.0;
        double total = total1 + zabroker;
        System.out.printf("Total: %.2f", total);
    }
}
