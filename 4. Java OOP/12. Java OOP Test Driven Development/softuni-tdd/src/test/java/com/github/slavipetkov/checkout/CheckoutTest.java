package com.github.slavipetkov.checkout;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
    //Item   Unit      Special
    //         Price     Price
    //  --------------------------
    //    A     50       3 for 130
    //    B     30       2 for 45
    //    C     20
    //    D     15

    PricingRules testRules;

    @Before
    public void setup() {
        this.testRules = new PricingRules(
                new ItemPrice("A", 50, new NforMDiscount(3, 130)),
                new ItemPrice("B", 30, new NforMDiscount(2, 45)),
                new ItemPrice("C", 20),
                new ItemPrice("D", 15)
        );
    }

    @Test
    public void no_scanned_items_results_in_0_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(0, total);
    }

    @Test
    public void one_A_scanned_results_in_50_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("A");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(50, total);
    }

    @Test
    public void one_B_scanned_results_in_30_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("B");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(30, total);
    }

    @Test
    public void AB_scanned_results_in_80_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("A");
        checkout.scan("B");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(80, total);
    }

    @Test
    public void ABCD_scanned_results_in_115_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("C");
        checkout.scan("D");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(115, total);
    }

    @Test
    public void AA_scanned_results_in_100_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("A");
        checkout.scan("A");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(100, total);
    }

    @Test
    public void AAA_scanned_use_discount_and_results_in_130_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(130, total);
    }

    @Test
    public void AAABBD_scanned_use_discount_and_results_in_190_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("B");
        checkout.scan("D");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(190, total);
    }

    @Test
    public void DABABA_scanned_use_discount_and_results_in_190_total() {
        //GIVEN
        Checkout checkout = new Checkout(testRules);
        checkout.scan("D");
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("A");
        //WHEN
        long total = checkout.total();
        //THEN
        Assert.assertEquals(190, total);
    }

    // co.scan("A");  assert_equal( 50, co.total)
    //    co.scan("B");  assert_equal( 80, co.total)
    //    co.scan("A");  assert_equal(130, co.total)
    //    co.scan("A");  assert_equal(160, co.total)
    //    co.scan("B");  assert_equal(175, co.total)
    @Test
    public void test_incremental() {
        //GIvEN

        Checkout checkout = new Checkout(testRules);
        Assert.assertEquals(0, checkout.total());

        checkout.scan("A");
        Assert.assertEquals(50, checkout.total());
        checkout.scan("B");
        Assert.assertEquals(80, checkout.total());
        checkout.scan("A");
        Assert.assertEquals(130, checkout.total());
        checkout.scan("A");
        Assert.assertEquals(160, checkout.total());
        checkout.scan("B");
        Assert.assertEquals(175, checkout.total());
    }
}













