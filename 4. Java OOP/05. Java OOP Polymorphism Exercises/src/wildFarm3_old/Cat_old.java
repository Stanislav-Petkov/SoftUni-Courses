package wildFarm3_old;

public class Cat_old extends Felime_old {
    private String breed;

    public Cat_old(String animalName,
                   String animalType,
                   Double animalWeight,
                   Integer foodEaten,
                   String livingRegion,
                   String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food_old food) {
        this.foodEaten = food.quantity;
    }

    @Override
    public String toString() {
        return String.format(
                this.getClass().getSimpleName() + "[" +
                        this.animalName + ", " +
                        this.breed + ", " +
                        df.format(this.animalWeight) + ", " +
                        this.livingRegion + ", " +
                        this.foodEaten + "]");
    }
}
