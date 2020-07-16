package zooMain.zoo;

public class Snake extends Reptile {
    public Snake(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("I ate a mouse");
    }
}
