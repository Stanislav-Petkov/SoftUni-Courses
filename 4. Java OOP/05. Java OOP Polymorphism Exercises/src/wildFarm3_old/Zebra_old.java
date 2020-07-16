package wildFarm3_old;

public class Zebra_old extends Mammal_old {
    public Zebra_old(String animalName,
                     String animalType,
                     Double animalWeight,
                     Integer foodEaten,
                     String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food_old food) {
        if (food instanceof Vegetable_old) {
            this.foodEaten = food.quantity;
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }
}
