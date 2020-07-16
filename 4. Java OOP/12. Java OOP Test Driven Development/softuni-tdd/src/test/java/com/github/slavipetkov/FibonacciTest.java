package com.github.slavipetkov;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    //test cases
    /*
    1st number is 1
    2nd number is 1
    3rd number is 2
    8th number is 21
    14th number is 377
    0th number throws IllegalArgumentException
    negative number throws exception
     */
    @Test
    public void n1_is_1() {
        //GIVEN
        Fibonacci fibonacci = new Fibonacci();
        //WHEN
        int nthNumber = fibonacci.getNthNumber(1);
        //THEN
        Assert.assertEquals(1, nthNumber);
    }

    @Test
    public void n2_is_1() {
        //GIVEN
        Fibonacci fibonacci = new Fibonacci();
        //WHEN
        int nthNumber = fibonacci.getNthNumber(2);
        //THEN
        Assert.assertEquals(1, nthNumber);
    }

    @Test
    public void n3_is_2() {
        //GIVEN
        Fibonacci fibonacci = new Fibonacci();
        //WHEN

        int nthNumber = fibonacci.getNthNumber(3);
        //THEN

        Assert.assertEquals(2, nthNumber);
    }

    @Test
    public void n8_is_21() {
        Fibonacci fibonacci = new Fibonacci();
        int nthNumber = fibonacci.getNthNumber(8);
        Assert.assertEquals(21, nthNumber);
    }

    @Test
    public void n14_is_377() {
        Fibonacci fibonacci = new Fibonacci();
        int nthNumber = fibonacci.getNthNumber(14);
        Assert.assertEquals(377, nthNumber);
    }

    @Test(expected = IllegalArgumentException.class)
    public void n0_throws_exception() {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.getNthNumber(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeN_throws_exception() {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.getNthNumber(-1);
    }
}
















