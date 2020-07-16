package PointInRectangle2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point bottomLeft = createPointReadingTwoIntsFrom(scanner);
        Point topRight = createPointReadingTwoIntsFrom(scanner);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);
        int numberOfPoints = scanner.nextInt();
        for (int i = 0; i < numberOfPoints; i++) {
            Point point = createPointReadingTwoIntsFrom(scanner);
            System.out.println(rectangle.contains(point));
        }
    }

    private static Point createPointReadingTwoIntsFrom(Scanner scanner) {
        int pointX = scanner.nextInt();
        int pointY = scanner.nextInt();
        return new Point(pointX, pointY);
    }
}
