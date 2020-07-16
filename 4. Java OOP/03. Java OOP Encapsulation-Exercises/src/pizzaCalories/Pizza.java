package pizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int toppingsCount) {
        this.setName(name);
        this.setToppings(toppingsCount);
    }

    private void setToppings(int toppingsCount) {
        if(toppingsCount < 0 || toppingsCount > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(toppingsCount);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.trim().length() > 15) { //|| name.length() < 1
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name.trim();
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addToppings(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        return this.dough.calculateCalories() + this.toppings.stream()
                .mapToDouble(Topping::calculateCalories)
                .sum();
    }

    private double sumEachToppingCalories(List<Topping> toppings) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "";
    }
}