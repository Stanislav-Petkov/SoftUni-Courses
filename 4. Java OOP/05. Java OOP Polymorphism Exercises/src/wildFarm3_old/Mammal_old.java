package wildFarm3_old;

import java.text.DecimalFormat;

public abstract class Mammal_old extends Animal_old {
    String livingRegion;

    public Mammal_old(String animalName,
                      String animalType,
                      Double animalWeight,
                      Integer foodEaten,
                      String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    DecimalFormat df = new DecimalFormat("####################.######################");

    @Override
    public String toString() {
        return String.format(
                this.getClass().getSimpleName() + "[" +
                        this.animalName + ", " +
                        df.format(this.animalWeight) + ", " +
                        this.livingRegion + ", " +
                        this.foodEaten + "]");
    }
}
