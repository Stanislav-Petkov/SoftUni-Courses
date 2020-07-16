import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String fruit = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (!day.equals("Monday") || !day.equals("Tuesday")) {
            System.out.println("error");
        }
    }
}
