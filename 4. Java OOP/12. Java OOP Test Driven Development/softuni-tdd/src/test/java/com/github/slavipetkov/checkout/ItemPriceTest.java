package com.github.slavipetkov.checkout;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemPriceTest {
//method: calculatePrice()
//[] price = 50 , count = 5 , calculate = 250
//[] price = 15 , count = 3 , calculate = 45
//[] price = 0 , count = 0 , calculate = 0
//[] price = 5 , count = 0 , calculate = 0
//[] price = 0 , count = 5 , calculate = 0

    // price = -1, count = 42 //throws IAE
    // price = 5, count = -1 //throws IAE
    @Test
    public void price_50_count_5_calculates_250() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(50);
        //WHEN
        long totalPrice = itemPrice.calculate(5);
        //THEN
        Assert.assertEquals(250, totalPrice);

    }

    @Test
    public void price_15_count_3_calculates_45() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(15);
        //WHEN
        long totalPrice = itemPrice.calculate(3);
        //THEN
        Assert.assertEquals(45, totalPrice);
    }

    @Test
    public void price_20_count_3_calculates_60() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(20);
        //WHEN
        long totalPrice = itemPrice.calculate(3);
        //THEN
        Assert.assertEquals(60, totalPrice);
    }

    @Test
    public void price_0_count_3_calculates_0() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(0);
        //WHEN
        long totalPrice = itemPrice.calculate(3);
        //THEN
        Assert.assertEquals(0, totalPrice);
    }

    @Test
    public void price_5_count_0_calculates_0() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(5);
        //WHEN
        long totalPrice = itemPrice.calculate(0);
        //THEN
        Assert.assertEquals(0, totalPrice);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_price_throws_IAE() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(-42);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negative_count_throws_IAE() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(42);
        itemPrice.calculate(-15);
    }

    @Test
    public void item_price_with_name_returns_name_from_getter() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice("A", 42);
        //WHEN
        String name = itemPrice.getName();
        //THEN
        Assert.assertEquals("A", name);
    }

    @Test
    public void item_with_no_name_returns_empty_string_from_getter() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice(42);
        //WHEN
        String name = itemPrice.getName();
        //THEN
        Assert.assertEquals("", name);
    }

    @Test
    public void can_have_discount() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice("A", 50, new NforMDiscount(3, 130));
        //WHEN
        long discountedPrice = itemPrice.calculate(3);
        //THEN
        Assert.assertEquals(130, discountedPrice);
    }

    @Test
    public void can_have_discount_and_one_more() {
        //GIVEN
        ItemPrice itemPrice = new ItemPrice("A", 50,
                new NforMDiscount(3, 130));
        //WHEN
        long discountedPrice = itemPrice.calculate(4);
        //THEN
        Assert.assertEquals(180, discountedPrice);
    }
}








