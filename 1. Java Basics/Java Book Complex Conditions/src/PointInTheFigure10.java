import java.util.Scanner;

public class PointInTheFigure10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        boolean outRectangle1 = x > 3 * h || x < 0 || y > h || y < 0;
        boolean outRectangle2 = x > 2 * h || x < h || y > 4 * h || y < h;
        boolean inRectangle1 = x > 0 && y > 0 && x < 3 * h && y < h;
        boolean inRectangle2 = x > h && x < 2 * h && y > h && y < 4 * h;
        boolean commonBorder = x > h && x < 2 * h && y == h;
        if (outRectangle1 && outRectangle2) {
            System.out.println("outside");
        } else if ((inRectangle1 || inRectangle2) || commonBorder) {
            System.out.println("inside");
        } else {
            System.out.println("border");
        }
    }
}
