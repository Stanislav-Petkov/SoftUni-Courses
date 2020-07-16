package shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;

    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        Validator.validateName(name);
        this.name = name;
    }

    private void setMoney(double money) {
        Validator.validateMoney(money);
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (this.money < product.getCost()) {
            throw new IllegalStateException(this.name + " can't afford " + product.getName());
        }
        this.products.add(product);
        this.money -= product.getCost();
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String postfix = this.products.size() > 0
                ? this.products.stream()
                .map(p -> p.getName())
                .collect(Collectors.joining(", "))
                : "Nothing bought";
        return this.name + " - " + postfix;
    }
}
