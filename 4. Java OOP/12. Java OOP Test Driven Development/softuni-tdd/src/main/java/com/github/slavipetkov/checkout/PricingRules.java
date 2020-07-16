package com.github.slavipetkov.checkout;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PricingRules {
    private ItemPrice itemPrice;
    private ItemPrice itemPrice2;
    private Map<String, ItemPrice> itemPriceMap = new HashMap<>();

    public PricingRules(ItemPrice... itemPrices) {

        this.itemPriceMap = Arrays.stream(itemPrices)
                .collect(Collectors.toMap(
                        (ip) -> ip.getName(),
                        (ip) -> ip
                ));
    }

    public ItemPrice ruleFor(String item) {

        if (!itemPriceMap.containsKey(item)) {
            throw new ItemNotFoundException();
        }
        return itemPriceMap.get(item);
    }
}
