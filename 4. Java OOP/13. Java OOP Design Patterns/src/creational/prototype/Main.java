package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShapePrototype firstCircle = new Circle("GREEN",
                new ArrayList<>(List.of("Great Success!")));
        Circle secondCircle = (Circle) firstCircle.clone();
        secondCircle.getText().add("I am second object");
        draw(firstCircle);
        draw(secondCircle);
        System.out.println();
    }

    public static void draw(ShapePrototype shapePrototype) {
        System.out.println(shapePrototype);
    }
}
