import java.text.DecimalFormat;
import java.util.Scanner;

public class NewTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("#.#########");
        double width = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) - Math.min(y1, y2);
        double area1 = width * height;
        double perimeter1 = 2 * (width + height);
        System.out.println(decimalFormat.format(area1));
        System.out.println(decimalFormat.format(perimeter1));
    }
}
