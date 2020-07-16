package foo;

import foo.bar.Bed;

public class Sofa extends Bed {
    public Sofa(String mattressMaterial) {
        super(mattressMaterial);
    }

    @Override
    public void decay() {
        System.out.println("Sofa is decaying...");
    }

    public void foo() {
        System.out.println(super.mattressMaterial);
        System.out.println(super.getMattressMaterial());
    }
}
