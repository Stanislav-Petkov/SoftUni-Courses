package com.github.slavipetkov;

public class Foo {
    public int addTwoNumbers(int a, int b) {
        return a * b;
    }

    void iThrowNPE() {
        throw new NullPointerException("NPE Messages");
    }

    void iDoNotThrowNPE() {
        // throw new NullPointerException("NPE Messages");
        //System.out.println("not throwing npe");
    }
}
