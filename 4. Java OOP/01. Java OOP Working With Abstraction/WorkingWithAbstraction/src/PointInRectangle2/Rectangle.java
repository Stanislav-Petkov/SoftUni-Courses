package PointInRectangle2;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        boolean withinX = bottomLeft.getX() <= point.getX()
                && topRight.getX() >= point.getX();
        boolean withinY = bottomLeft.getY() <= point.getY()
                && topRight.getY() >= point.getY();
        return withinX && withinY;
    }

    public static void main(String[] args) {
        Point bottomLeft = new Point(0, 0);
        Point topRight = new Point(2, 2);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        System.out.println(rectangle.contains(new Point(1, 1)));
        System.out.println(rectangle.contains(new Point(2, 3)));
    }
}
