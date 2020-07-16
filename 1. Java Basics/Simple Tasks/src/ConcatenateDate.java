import java.util.Scanner;

public class ConcatenateDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        Double age = Double.parseDouble(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.printf("Hello %s %s you are %.2f from %s", firstname,
                lastname, age, town);
    }
}
