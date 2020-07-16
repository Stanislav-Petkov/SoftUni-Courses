package com.github.slavipetkov.checkout;

import java.util.Objects;

public class ItemPrice {
    private final int price;
    private final String name;
    private NforMDiscount discount;

    public ItemPrice(int price) {
        this("", price);
    }

    public ItemPrice(String name, int price) {
        this(name, price, new NforMDiscount(1, price));//
    }

    public ItemPrice(String name, int price, NforMDiscount discount) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public long calculate(int count) {
        if (count < 0) {
            throw new IllegalArgumentException();
        }
        return discount.calculate(count, this.price);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPrice itemPrice = (ItemPrice) o;
        return price == itemPrice.price &&
                Objects.equals(name, itemPrice.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }
}
