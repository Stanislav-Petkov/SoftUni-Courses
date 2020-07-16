package foo.bar;

import foo.Sofa;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed("");
        bed.mattressMaterial = "Cotton";
        bed.getMattressMaterial();

        Sofa sofa = new Sofa("");
        sofa.mattressMaterial = "Leather";
        sofa.getMattressMaterial();

        sofa.decay();
        bed.decay();
    }
}





















