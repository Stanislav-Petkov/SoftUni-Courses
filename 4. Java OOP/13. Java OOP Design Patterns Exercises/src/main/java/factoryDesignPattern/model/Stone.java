package factoryDesignPattern.model;

public class Stone implements GameObject {
    @Override
    public void update() {
        System.out.println("I am stone and I do nothing");
    }

    @Override
    public void render() {
        System.out.println("See stone");

    }
}
