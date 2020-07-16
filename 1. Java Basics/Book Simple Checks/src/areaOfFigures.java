import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double num1 = 0; //num1 = Double.parseDouble(scanner.nextLine());
        double num2 = 0; //num2 = Double.parseDouble(scanner.nextLine());
        double result = 0;
        if (figure.equals("square")) {
            num1 = Double.parseDouble(scanner.nextLine());
            result = num1 * num1;
            System.out.printf("%.3f", result);
        } else if (figure.equals("rectangle")) {
            num1 = Double.parseDouble(scanner.nextLine());
            num2 = Double.parseDouble(scanner.nextLine());
            result = num1 * num2;
            System.out.printf("%.3f", result);
        } else if (figure.equals("circle")) {
            num1 = Double.parseDouble(scanner.nextLine());
            result = Math.PI * (num1 * num1);
            System.out.printf("%.3f", result);
        } else if (figure.equals("triangle")) {
            num1 = Double.parseDouble(scanner.nextLine());
            num2 = Double.parseDouble(scanner.nextLine());
            result = (num1 * num2) / 2;
            System.out.printf("%.3f", result);
        }
    }
}
