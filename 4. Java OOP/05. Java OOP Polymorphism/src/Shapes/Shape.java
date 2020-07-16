package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    protected abstract Double calculatePerimeter();

    protected abstract Double calculateArea();

    public Double getPerimeter() {
        if (this.perimeter == null) {
            this.perimeter = this.calculatePerimeter();
        }
        return this.perimeter;
    }

    public Double getArea() {
        if (this.area == null) {
            this.area = this.calculateArea();
        }
        return this.area;
    }
}
