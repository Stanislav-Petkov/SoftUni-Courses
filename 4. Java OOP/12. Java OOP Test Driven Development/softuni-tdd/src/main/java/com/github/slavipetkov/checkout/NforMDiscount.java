package com.github.slavipetkov.checkout;

public class NforMDiscount {
    private final int howManyItems;
    private final long priceForThatManyItems;

    public NforMDiscount(int howManyItems, long priceForThatManyItems) {
        this.howManyItems = howManyItems;
        this.priceForThatManyItems = priceForThatManyItems;
    }

    //3 for 120
    //itemCount = 4 singleItemPrice = 50
    // 120 + 50 = 170
    public long calculate(int itemCount, long singleItemPrice) {
        int discountedSetsOfItems = itemCount / howManyItems;
        int remainingItems = itemCount % howManyItems;

        return discountedSetsOfItems * priceForThatManyItems
                + remainingItems * singleItemPrice;
    }
}
