package wildFarm3_old;

public abstract class Animal_old {
    String animalName;
    String animalType;
    Double animalWeight;
    Integer foodEaten;

    public Animal_old(String animalName,
                      String animalType,
                      Double animalWeight,
                      Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();

    public abstract void eat(Food_old food);
}
