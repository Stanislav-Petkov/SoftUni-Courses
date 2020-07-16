package wildFarm3_old;

public class Tiger_old extends Felime_old {
    private String livingRegion;

    public Tiger_old(String animalName,
                     String animalType,
                     Double animalWeight,
                     Integer foodEaten,
                     String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food_old food) {
        if (food instanceof Meat_old) {
            this.foodEaten = food.quantity;
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
