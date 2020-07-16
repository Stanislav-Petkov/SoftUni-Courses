package com.github.slavipetkov.checkout;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private String scannedItem;
    private final Map<String, Integer> scannedItems;
    private final PricingRules pricingRules;

    public Checkout(PricingRules pricingRules) {
        this.pricingRules = pricingRules;
        this.scannedItems = new HashMap<>();
    }

    public long total() {
        return scannedItems.entrySet().stream()
                .mapToLong(entry -> pricingRules.ruleFor(entry.getKey())
                        .calculate(entry.getValue()))
                .sum();
    }

    public void scan(String item) {
        this.scannedItems.putIfAbsent(item, 0);
        this.scannedItems.put(item, scannedItems.get(item) + 1);
    }
}
