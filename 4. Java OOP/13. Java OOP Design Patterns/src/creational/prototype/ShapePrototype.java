package creational.prototype;

public interface ShapePrototype extends Cloneable {

    ShapePrototype clone() throws CloneNotSupportedException;
}
