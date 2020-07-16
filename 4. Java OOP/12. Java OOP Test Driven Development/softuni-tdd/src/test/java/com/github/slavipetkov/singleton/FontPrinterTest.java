package com.github.slavipetkov.singleton;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class FontPrinterTest {
    @Test
    public void returnFont() {
        //GIVEN
        //Ssome properties with font 42

        MyProperties myProperties = Mockito.mock(MyProperties.class);
        Mockito.when(myProperties.getProperty("font")).thenReturn("42");

        FontPrinter fontPrinter = new FontPrinter(myProperties);

        //WHEN
        String font = fontPrinter.returnFont();

        //THEN
        Assert.assertEquals("42", font);
    }
}


















