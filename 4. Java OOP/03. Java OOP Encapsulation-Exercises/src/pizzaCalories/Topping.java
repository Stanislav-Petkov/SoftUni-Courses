package pizzaCalories;

import pizzaCalories.utils.TypeUtils;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!TypeUtils.TOPPING_TYPES.containsKey(toppingType)) {

            String invalidType = String.format("Cannot place %s on top of your pizza.", toppingType);
            throw new IllegalArgumentException(invalidType);
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight * 2 * TypeUtils.TOPPING_TYPES.get(this.toppingType);
    }
}
