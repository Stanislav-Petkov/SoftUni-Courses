package wildFarm;

public class Mouse extends Mammal {
    public Mouse(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public String toString() {
        return "Mouse" + super.toString();
    }
}
