package wildFarm;

public class Cat extends Felime {
    private String breed;

    public Cat(String name, String type, Double weight, String livingRegion, String breed) {
        super(name, type, weight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        this.incrementFood(food.getQuantity());

    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Cat");
        builder.append(super.toString());

        builder.insert(builder.indexOf(",") + 1, " " + this.breed + ",");
        return builder.toString();
    }
}
