
import java.util.Scanner;

public class Cinema11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int fullCapacity = rows * columns;
        double income = 0;
        switch (name) {
            case "Premiere":
                income = fullCapacity * 12.0;
                break;
            case "Normal":
                income = fullCapacity * 7.5;
                break;
            case "Discount":
                income = fullCapacity * 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}