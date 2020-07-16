package zooMain.zoo;

public class Bear extends Mammal {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void feedAnimal() {
        System.out.println("I ate honey");
    }
}
