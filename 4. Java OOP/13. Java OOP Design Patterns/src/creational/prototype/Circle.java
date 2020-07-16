package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Circle implements ShapePrototype {

    private String color;
    private List<String> text;

    public Circle(String color, List<String> text) {
        this.color = color;
        this.text = text;
    }

    public List<String> getText() {
        return text;
    }

    @Override
    public ShapePrototype clone() throws CloneNotSupportedException {
        return new Circle(
                color,
                new ArrayList<>(this.text));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", text=" + text +
                '}';
    }
}