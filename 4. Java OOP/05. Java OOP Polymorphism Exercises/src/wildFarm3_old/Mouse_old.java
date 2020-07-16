package wildFarm3_old;

public class Mouse_old extends Mammal_old {
    public Mouse_old(String animalName,
                     String animalType,
                     Double animalWeight,
                     Integer foodEaten,
                     String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food_old food) {
        if (food instanceof Vegetable_old) {
            this.foodEaten = food.quantity;
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
