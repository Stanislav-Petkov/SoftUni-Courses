package com.github.slavipetkov.singleton;

public class Main {
    public static void main(String[] args) {
        FontPrinter fontPrinter = new FontPrinter(MyProperties.getInstance());
        FontPrinter fontPrinter2 = new FontPrinter(MyProperties.getInstance());
        System.out.println(fontPrinter.returnFont());
        System.out.println(fontPrinter2.returnFont());
    }
}