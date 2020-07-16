import java.text.DecimalFormat;
import java.util.Scanner;

public class coordinatesAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        DecimalFormat decimalFormat = new DecimalFormat("#.########");
        double area = Math.abs((x1 - x2) * Math.abs(y1 - y2));
        double perimeter = 2 * (Math.abs((x1 - x2) + Math.abs(y1 - y2)));
        System.out.println(decimalFormat.format(area));
        System.out.print(decimalFormat.format(perimeter));
    }
}


