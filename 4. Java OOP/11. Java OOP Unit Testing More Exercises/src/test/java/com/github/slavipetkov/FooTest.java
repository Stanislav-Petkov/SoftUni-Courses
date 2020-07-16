package com.github.slavipetkov;


import com.github.slavipetkov.Foo;
import org.junit.Assert;
import org.junit.Test;

public class FooTest {

    @Test
    public void testAddTwoNumbers() {
        Foo foo = new Foo();
        Assert.assertEquals(42, foo.addTwoNumbers(5, 37));
        Assert.assertEquals(-1, foo.addTwoNumbers(1, -2));
        Assert.assertEquals(-1, foo.addTwoNumbers(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
