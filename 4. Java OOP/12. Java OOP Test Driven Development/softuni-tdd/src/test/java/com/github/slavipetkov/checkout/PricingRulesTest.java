package com.github.slavipetkov.checkout;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PricingRulesTest {
    /*
    [] pricing rule with no rules always throws ItemNotFoundException when asked for Item
     */
    @Test
    public void instantiate_rules_with_one_item_price() {
        PricingRules pricingRules = new PricingRules(new ItemPrice(42));
    }

    @Test(expected = ItemNotFoundException.class)
    public void empty_rules_throws_item_not_fond_exception_when_asked_for_price() {
        //GIVEN
        PricingRules pricingRules = new PricingRules();
        //WHEN
        ItemPrice itemPrice = pricingRules.ruleFor("A");

    }

    @Test(expected = ItemNotFoundException.class)
    public void another_empty_rules_throws_item_not_fond_exception_when_asked_for_price() {
        //GIVEN
        PricingRules pricingRules = new PricingRules();
        //WHEN
        ItemPrice itemPrice = pricingRules.ruleFor("B");
    }

    @Test
    public void pricing_rule_with_rule_A_returns_the_rule_from_rulerFor() {
        //GIVEN
        PricingRules pricingRules = new PricingRules(new ItemPrice("A", 42));
        //WHEN
        ItemPrice itemPrice = pricingRules.ruleFor("A");
        //THEN
        Assert.assertEquals(new ItemPrice("A", 42), itemPrice);
    }

    @Test
    public void pricing_rule_with_rule_A_and_B_returns_the_rule_from_rulerFor_A_B() {
        //GIVEN
        PricingRules pricingRules = new PricingRules(
                new ItemPrice("A", 42),
                new ItemPrice("B", 42)
        );
        //WHEN
        ItemPrice itemPriceA = pricingRules.ruleFor("A");
        ItemPrice itemPriceB = pricingRules.ruleFor("B");
        //THEN
        Assert.assertEquals(new ItemPrice("A", 42), itemPriceA);
        Assert.assertEquals(new ItemPrice("B", 42), itemPriceB);
    }

}