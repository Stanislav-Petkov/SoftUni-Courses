import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        double rectangleArea = width * height;
        double rectanglePerimeter = 2 * (width + height);
        System.out.printf("%.2f%n%.2f", rectangleArea, rectanglePerimeter);
    }
}