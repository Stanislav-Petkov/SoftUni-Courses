package Shapes.main;

import Shapes.Rectangle;
import Shapes.Shape;

public class Main {
    public static void main(String[] args) throws Exception {
        Shape shape = new Rectangle(3.0, 5.0);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
