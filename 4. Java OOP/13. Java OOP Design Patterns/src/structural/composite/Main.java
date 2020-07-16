package structural.composite;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape anotherCircle = new Circle();
        CompositeShape innerCompositeShape = new CompositeShape(anotherCircle);
        CompositeShape compositeShape = new CompositeShape(
                innerCompositeShape,
                circle,
                square
        );
        compositeShape.select();
        System.out.println(circle.isSelected());
    }
}

