import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double name1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Hello, " + name + "!");
        System.out.print("years ");
        System.out.printf("%.0f", name1);
        System.out.println(name1);
    }
}
