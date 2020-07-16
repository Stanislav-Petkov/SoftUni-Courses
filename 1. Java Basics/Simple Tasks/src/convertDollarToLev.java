import java.util.Scanner;

public class convertDollarToLev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar = Double.parseDouble(scanner.nextLine());
        double lev = dollar * 1.79549;
        System.out.printf("%.2f", lev);
    }
}
